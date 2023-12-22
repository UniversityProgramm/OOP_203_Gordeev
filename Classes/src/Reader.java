import java.lang.String;

import java.util.Date;

public class Reader {
    String name;
    String secondName;
    String surname;
    int ticketNumber;
    String faculty;
    Date birthday;
    String phoneNumber;

    public void takeBook() {
    }

    public void returnBook() {
    }

    public Reader(String name, String secondName, String surname) {
        this.name = name;
        this.secondName = secondName;
        this.surname = surname;
    }

    public void takeBook(int count) {
        System.out.println(secondName + " " + name + " " + surname + " взял(а) " + count + " книг\n");
    }

    public void takeBook(String... titles) {
        System.out.println(secondName + " " + name + " " + surname + " взял(а) книги:");
        for (String a : titles)
            System.out.print(a + ", ");
        System.out.println("\n");
    }

    public void takeBook(Book... books) {
        System.out.println(secondName + " " + name + " " + surname + " взял(а) книги:");
        for (Book a : books)
            System.out.print("'" + a.title + "' - " + a.author + ", ");
        System.out.println("\n");
    }

    public void returnBook(int count) {
        System.out.println(secondName + " " + name + " " + surname + " вернул(а) " + count + " книги\n");
    }

    public void returnBook(String... titles) {
        System.out.println(secondName + " " + name + " " + surname + " вернул(а) книги:");
        for (String a : titles)
            System.out.print(a + ", ");
        System.out.println("\n");
    }

    public void returnBook(Book... books) {
        System.out.println(secondName + " " + name + " " + surname + " вернул(а) книги: ");
        for (Book a : books)
            System.out.print("'" + a.title + "' - " + a.author + ", ");
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Reader[] readers = new Reader[5];
        readers[0] = new Reader("Вячеслав","Пернов","Васильевич");
        readers[1] = new Reader("Анна","Нигожина","Вячеславовна");

        Book book1 = new Book("Преступление и наказание","Ф.М. Достоевский");
        Book book2 = new Book("Мёртвые души","Н.В. Гоголь");

        readers[0].takeBook(2);
        readers[0].returnBook(1);
        readers[1].takeBook(1);
        readers[1].takeBook("Ядерная физика");
        readers[1].returnBook("Ядерная физика", "Астрология");
        readers[0].returnBook(book1);
    }
}
