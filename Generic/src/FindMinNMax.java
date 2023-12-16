public class FindMinNMax<T extends Comparable<T>> {
    private T[] array;

    public FindMinNMax(T[] array) {
        this.array = array.clone();
    }

    public T findMin() {
        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0)
            min = array[i];
        }
        return min;
    }
    public T findMax() {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0)
                max = array[i];
        }
        return max;
    }

    public static void main (String[] args) {
        Integer[] array = new Integer[]{9, 0, 3, -5, 19};
        FindMinNMax<Integer> inputArray = new FindMinNMax<>(array);
        System.out.println(inputArray.findMax());
        System.out.println(inputArray.findMin());
    }
}
