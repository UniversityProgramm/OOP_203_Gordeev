
public class Tie extends Clothes implements MensClothes {
    public Tie(ClothesSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressAMen() {
        System.out.println("Галстук");
    }
}