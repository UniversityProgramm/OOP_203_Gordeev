public class Main {
    // 1 задание я вам сдавал, кода не осталось, но если надо могу написать
    public static void main(String[] args) {
        thirdTask();
    }

    public static void secondTask() {
        String input = "inputs";
        int index = input.length() / 2;
        System.out.println(String.valueOf(input.charAt(index - 1)) + String.valueOf(input.charAt(index)));
    }

    public static void thirdTask() {
        String input="1213 ffr jjjj wadjk ";
        int numbDifferent = 0;
        double minDifferent = Double.POSITIVE_INFINITY;
        int index = 0;

        String[] Words = input.split(" ");

        for (int i = 0; i < Words.length; i++) {
            for (int j = 0; j < Words[i].length() - 1; j++) {
                if (Words[i].charAt(j) != Words[i].charAt(j + 1)) {
                    numbDifferent++;
                }
            }
            if (numbDifferent < minDifferent) {
                minDifferent = numbDifferent;
                index = i;
            }
            numbDifferent = 0;

        }
        System.out.println(Words[index]);
    }

    public static void fourthTask() {

    }
}

