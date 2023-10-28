
public class Skirt extends Clothes implements WomensClothes {
    public Skirt(ClothesSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressAWomen() {
        System.out.println("Юбка");
    }
}