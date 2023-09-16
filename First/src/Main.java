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
        String str = "One two three раdfз д2ва три one two2 123";
        int k = 0;
        boolean detect = true;
        String[] s = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length(); j++) {
                if (( (int) s[i].charAt(j) < 65  (int) s[i].charAt(j) > 122  ((int) s[i].charAt(j) > 90 && (int) s[i].charAt(j) < 97) ))
                detect = false;
            }
            if (detect) k++;
        }
        System.out.println(k);
    }
}

