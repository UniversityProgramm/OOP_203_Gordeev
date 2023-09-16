public class Main {
    public static void main(String[] args) {/*
        String input = "inputs";
        int index = input.length() / 2;
        System.out.println(String.valueOf(input.charAt(index-1)) + String.valueOf(input.charAt(index)));
        */
        String input = "input aaaaca abc aaa";
        String[] inputArr = input.split(" ");
        for (int i = 0; i < inputArr.length; i++){
            char[] temp = new char[]{};
            for (int j = 0; j < inputArr[i].length(); j++){
                char let = inputArr[i].charAt(j);
                boolean contain = Check(temp, let);
                if (!contain){
                    temp.
                }
            }
        }
    }
    public static boolean Check (char[] inp, char letter){
        for (int j = 0; j < inp.length; j++){
            if (inp[j] == letter){
                return true;
            }
        }
        return false;
    }
}