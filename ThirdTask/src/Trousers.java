
public class Trousers extends Clothes implements MensClothes, WomensClothes {
    public Trousers(ClothesSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressAMen() {
        System.out.println("Брюки");
    }

    @Override
    public void dressAWomen() {
        System.out.println("Брюки");
    }
}
