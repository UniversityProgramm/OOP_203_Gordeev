public class CatsFactory {
    public static Factory createCat(FactoryEnum catType) {
        switch (catType) {
            case CAT:
                return new Cat();
            case LION:
                return new Lion();
            case LYNX:
                return new Lynx();
            case CHEETAH:
                return new Cheetah();
            case LEOPARD:
                return new Leopard();
            default:
                throw new RuntimeException("Неверный тип");
        }
    }
}
