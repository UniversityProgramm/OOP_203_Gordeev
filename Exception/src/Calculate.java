import java.util.List;

public class Calculate {
    public static double calculates(String equation) {
        String[] partsOfEquation = equation.split("=");
        String leftPart = partsOfEquation[0].trim();
        String rightPart = partsOfEquation[1].trim();
        char variable = findVariable(leftPart);
        if (variable == ' ') {
            variable = findVariable(rightPart);
            List<Symbol> symbols = SymbolBuffer.symbolAnalyze(leftPart);
            SymbolBuffer symbolBuffer = new SymbolBuffer(symbols);
            double c = SymbolBuffer.expr(symbolBuffer);
            if (rightPart.length() == 2) c *= -1;
            return c;
        }
        else {
            boolean minus = false;
            String[] rExp = rightPart.split(" ");
            String[] exp = leftPart.split(" ");
            for (int i = 0; i < exp.length; i++) {
                if (exp[i].matches("-[a-zA-Zа-яА-Я]")) {
                    minus = true;
                    exp[i] = exp[i].substring(1);
                }
            }
            switch (exp[1]) {
                case "*":
                    if (exp[0].equals("0") || exp[2].equals("0") && rightPart.equals("0")) {
                        System.out.println(variable + " = R");
                    }
                    else {
                        rightPart += "/";
                        rightPart += (variable == exp[0].charAt(0)) ? exp[2] : exp[0];
                        List<Symbol> symbols = SymbolBuffer.symbolAnalyze(rightPart);
                        SymbolBuffer symbolBuffer = new SymbolBuffer(symbols);
                        double c = SymbolBuffer.expr(symbolBuffer);
                        if (minus == true)c *= -1;
                        return c;
                    }
                case "+":
                    rightPart += "-";
                    rightPart += (variable == exp[0].charAt(0)) ? exp[2] : exp[0];
                    List<Symbol> symbols = SymbolBuffer.symbolAnalyze(rightPart);
                    SymbolBuffer symbolBuffer = new SymbolBuffer(symbols);
                    double c = SymbolBuffer.expr(symbolBuffer);
                    if (minus == true) c *= -1;
                    return c;
                case "-":
                    if (variable == exp[2].charAt(0)) {
                        exp[2] = rExp[0];
                        String ex = exp[0] + exp[1] + exp[2];
                        List<Symbol> symbol = SymbolBuffer.symbolAnalyze(ex);
                        SymbolBuffer symbolBuffer1 = new SymbolBuffer(symbol);
                        double c1 = SymbolBuffer.expr(symbolBuffer1);
                        if (minus == true) c1 *= -1;
                        return c1;
                    }
                    else {
                        rightPart += "+";
                        rightPart += exp[2];
                        List<Symbol> symbol = SymbolBuffer.symbolAnalyze(rightPart);
                        SymbolBuffer symbolBuffer1 = new SymbolBuffer(symbol);
                        double c1 = SymbolBuffer.expr(symbolBuffer1);
                        if (minus == true) c1 *= -1;
                        return c1;
                    }
                case "/":
                    if (variable == exp[2].charAt(0)) {
                        exp[2] = rExp[0];
                        String ex = exp[0] + exp[1] + exp[2];
                        List<Symbol> symbol = SymbolBuffer.symbolAnalyze(ex);
                        SymbolBuffer symbolBuffer1 = new SymbolBuffer(symbol);
                        double c1 = SymbolBuffer.expr(symbolBuffer1);
                        if (minus == true) c1 *= -1;
                        return c1;
                    }
                    else {
                        rightPart += "*";
                        rightPart += exp[2];
                        List<Symbol> symbol = SymbolBuffer.symbolAnalyze(rightPart);
                        SymbolBuffer symbolBuffer1 = new SymbolBuffer(symbol);
                        double c1 = SymbolBuffer.expr(symbolBuffer1);
                        if (minus == true)c1 *= -1;
                        return c1;
                    }
                default:
                    break;
            }
        }
        return 0;
    }


    public static char findVariable(String inputExpression) {
        for (char c : inputExpression.toCharArray()) {
            if (Character.isLetter(c)) {
                return c;
            }
        }
        return ' ';
    }
}
