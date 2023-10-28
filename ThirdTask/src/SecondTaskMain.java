public class SecondTaskMain {
    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[4];
        clothes[0] = new TShirt(ClothesSize.L, 15.99, "Green");
        clothes[1] = new Trousers(ClothesSize.M, 30.0, "Grey");
        clothes[2] = new Skirt(ClothesSize.XS, 19.99, "Black");
        clothes[3] = new Tie(ClothesSize.S, 10.00, "Red");

        Atelier atelier = new Atelier();
        atelier.dressAWomen(clothes);
        atelier.dressAMen(clothes);
    }
}