public class Symbol {
    SymbolType type;
    String value;

    public SymbolType getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    public Symbol(SymbolType type, String value) {
        this.type = type;
        this.value = value;
    }

    public Symbol(SymbolType type, Character value) {
        this.type = type;
        this.value = value.toString();
    }

    @Override
    public String toString() {
        return "Symbol{" +
                "type = " + type +
                ", value = '" + value + '\'' +
                '}';
    }
}