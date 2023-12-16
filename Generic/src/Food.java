class Food{
    public void prepare(Cookable c, String str) {
        c.cook(str);
    }
    public static void main (String[] args){
        Food meal = new Food();
        Cookable c = new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println("Cooking "+ str);
            }
        };
        meal.prepare(c, "ready");
    }
}
