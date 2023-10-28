public class Atelier {
    public void dressAWomen(Clothes[] clothesArray) {
        System.out.println("Одежда для женщин:");
        for (Clothes clothes : clothesArray) {
            if (clothes instanceof WomensClothes) {
                ((WomensClothes) clothes).dressAWomen();
                System.out.println(clothes.size.getDescription() + ": " + clothes.size);
                System.out.println("Стоимость: " + clothes.price);
                System.out.println("Цвет: " + clothes.color);
                System.out.println();
            }
        }
    }

    public void dressAMen(Clothes[] clothesArray) {
        System.out.println("Одежда для мужчин:");
        for (Clothes clothes : clothesArray) {
            if (clothes instanceof MensClothes) {
                ((MensClothes) clothes).dressAMen();
                System.out.println(clothes.size.getDescription() + ": " + clothes.size);
                System.out.println("Стоимость: " + clothes.price);
                System.out.println("Цвет: " + clothes.color);
                System.out.println();
            }
        }
    }
}