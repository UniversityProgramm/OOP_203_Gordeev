import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void StreamAPIFirst() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int number;
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            number = rand.nextInt() % 100;
            list.add(number);
        }

        System.out.println("List:");
        System.out.println(list);
        int CountOfPairs = (int)(list.stream().filter((n) -> (n % 2) == 0)).count();
        System.out.println("Count of pairs numbers = " + CountOfPairs);
    }
    public static void StreamAPISecond() {
        Set<String> set = new HashSet();
        set.add("Smith");
        set.add("Williams");
        set.add("Johnson");
        set.add("Jones");
        set.add("William Junior");
        System.out.println("Surnames that begin with the letter J: ");
        Stream stream = set.stream().filter((surname) -> (surname.charAt(0) == 'J'));
        stream.forEach(surname -> System.out.print(surname + " "));
    }
    public static void StreamAPIThird() {
        String[] stringsMass = {"awdfgf", "bsgdf", "cherda", "cdhfdgt", "bcaft", "ergjr"};
        ArrayList<String> stringsArr = new ArrayList<String>(stringsMass.length);
        for (int i = 0; i < stringsMass.length; i++)
            stringsArr.add(i, stringsMass[i]);
        stringsArr.stream().sorted().forEach(System.out::println);
    }
    public static List<Integer> getEvenNumberPro(List<Integer> inputList) {
        List<Integer> outputList = new ArrayList<Integer>();
        inputList.stream().filter((number) -> (number % 2) == 0).forEach(outputList::add);
        return outputList;
    }
    public static void StreamAPITaskFirst() {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.println(getEvenNumberPro(list));
    }
    public static void StreamAPITaskSecond() {
        List<String> names = List.of("Egor", "Max", "Ivan", "Petr", "Patric", "");
        List<String> outputNames = new ArrayList<String>();
        names.stream().filter(name -> name != "").map(name -> name.toUpperCase()).forEach(outputNames::add);
        System.out.println(outputNames);
        char inputLetter = 'P';
        System.out.println(outputNames.stream().filter(name -> name.charAt(0) == 'P').count());
    }
    public static void main(String[] args) {
//        StreamAPIFirst();
//        StreamAPISecond();
//        StreamAPIThird();
//        StreamAPITaskFirst();
        StreamAPITaskSecond();
    }
}