public class PrintableAnonymousClass {
    public static void main(String[] args){
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Вывод");
            }
        };
        printable.print();
    }
}
