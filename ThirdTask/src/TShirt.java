public class TShirt extends Clothes implements MensClothes, WomensClothes {
    public TShirt(ClothesSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressAMen() {
        System.out.println("Футболка");
    }

    @Override
    public void dressAWomen() {
        System.out.println("Футболка");
    }
}

