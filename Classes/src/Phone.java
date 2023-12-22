import java.lang.String;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит {" + name + "}");
    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит {" + name + "}" + number);
    }

    public Phone(String number, String model, double weight) {
//        this.number = number;
//        this.model = model;
//        this.weight = weight;

        this (number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void sendMessage(String... numbers) {
        for (String number : numbers)
            System.out.print(number + ", ");
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("123456","A1",300);
        Phone phone2 = new Phone("638127","B2",270);
        Phone phone3 = new Phone("864006","C3",210);
        System.out.println("phone1:\nNumber - " + phone1.getNumber() + ", Model - " + phone1.getModel() + ", Weight - " + phone1.getWeight() + "\n");
        System.out.println("phone2:\nNumber - " + phone2.getNumber() + ", Model - " + phone2.getModel() + ", Weight - " + phone2.getWeight() + "\n");
        System.out.println("phone3:\nNumber - " + phone3.getNumber() + ", Model - " + phone3.getModel() + ", Weight - " + phone3.getWeight() + "\n");

        phone1.receiveCall("Mom");
        phone1.getNumber();
        phone2.receiveCall("Dad");
        phone2.getNumber();
        phone3.receiveCall("Friend");
        phone3.getNumber();
    }
}
