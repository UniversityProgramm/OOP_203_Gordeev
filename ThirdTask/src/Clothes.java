public abstract class Clothes {
    protected ClothesSize size;
    protected double price;
    protected String color;

    public Clothes(ClothesSize size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }
}