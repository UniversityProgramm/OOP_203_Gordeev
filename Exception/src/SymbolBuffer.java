import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;


public class SymbolBuffer {
    private int position;
    public List<Symbol> symbols;
    public SymbolBuffer(List<Symbol> symbols) {
        this.symbols = symbols;
    }
    public Symbol next() {
        return symbols.get(position++);
    }
    public void previous() {
        position--;
    }
    public int getPosition() {
        return position;
    }


    public static List<Symbol> symbolAnalyze(String expressionString) {
        ArrayList<Symbol> symbols = new ArrayList<>();
        int pos = 0;
        while (pos < expressionString.length()) {
            char c = expressionString.charAt(pos);
            switch (c) {
                case '(':
                    symbols.add(new Symbol(SymbolType.LEFT_BRACKET, c));
                    pos++;
                    continue;
                case ')':
                    symbols.add(new Symbol(SymbolType.RIGHT_BRACKET, c));
                    pos++;
                    continue;
                case '+':
                    symbols.add(new Symbol(SymbolType.PLUS, c));
                    pos++;
                    continue;
                case '-':
                    symbols.add(new Symbol(SymbolType.MINUS, c));
                    pos++;
                    continue;
                case '*':
                    symbols.add(new Symbol(SymbolType.MUL, c));
                    pos++;
                    continue;
                case '/':
                    symbols.add(new Symbol(SymbolType.DIV, c));
                    pos++;
                    continue;
                case '=':
                    symbols.add(new Symbol(SymbolType.EQUAL, String.valueOf(c)));
                    pos++;
                    continue;
                default:
                    if (c <= '9' && c >= '0') {
                        StringBuilder strBuild = new StringBuilder();
                        do {
                            strBuild.append(c);
                            pos++;
                            if (pos >= expressionString.length()) break;
                            c = expressionString.charAt(pos);
                        }
                        while (c <= '9' && c >= '0');
                        symbols.add(new Symbol(SymbolType.NUMBER, strBuild.toString()));
                    }
                    else if (String.valueOf(c).matches("[a-zA-Zа-яА-Я]")) {
                        c = 'x';
                        symbols.add(new Symbol(SymbolType.LETTER, String.valueOf(c)));
                        pos++;
                    }
                    else {
                        if (c != ' ') {
                            throw new RuntimeException("Unexpected character: " + c);
                        }
                        pos++;
                    }
            }
        }
        symbols.add(new Symbol(SymbolType.EOF, ""));
        return symbols;
    }

    public static double expr(SymbolBuffer symbols) {
        Symbol symbol = symbols.next();
        if (symbol.type == SymbolType.EOF) {
            return 0;
        }
        else {
            symbols.previous();
            return plusMinus(symbols);
        }
    }

    public static double plusMinus(SymbolBuffer symbols) {
        double value = multDiv(symbols);
        while (true) {
            Symbol symbol = symbols.next();
            switch (symbol.type) {
                case PLUS:
                    value += multDiv(symbols);
                    break;
                case MINUS:
                    value -= multDiv(symbols);
                    break;
                case EOF:
                case RIGHT_BRACKET:
                    symbols.previous();
                    return value;
                default:
                    throw new RuntimeException("Unexpected token: " + symbol.value
                            + " at position: " + symbols.getPosition());
            }
        }
    }

    public static double multDiv(SymbolBuffer symbols) {
        double value = factor(symbols);
        while (true) {
            Symbol symbol = symbols.next();
            switch (symbol.type) {
                case MUL:
                    value *= factor(symbols);
                    break;
                case DIV:
                    value /= factor(symbols);
                    break;
                case EOF:
                case RIGHT_BRACKET:
                case PLUS:
                case MINUS:
                    symbols.previous();
                    return value;
                default:
                    throw new RuntimeException("Unexpected token: " + symbol.value
                            + " at position: " + symbols.getPosition());
            }
        }
    }

    public static double factor(SymbolBuffer symbols) {
        Symbol symbol = symbols.next();
        switch (symbol.type) {
            case MINUS:
                double unValue = factor(symbols);
                return -unValue;
            case NUMBER:
                return parseInt(symbol.value);
            case LEFT_BRACKET:
                double value = plusMinus(symbols);
                symbol = symbols.next();
                if (symbol.type != SymbolType.RIGHT_BRACKET) {
                    throw new RuntimeException("Unexpected token: " + symbol.value
                            + " at position: " + symbols.getPosition());
                }
                return value;
            default:
                throw new RuntimeException("Unexpected token: " + symbol.value
                        + " at position: " + symbols.getPosition());
        }
    }

}
