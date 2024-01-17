public class Last8 {
    private int[] arr = new int[8];

    public void add(int a) {
        int temp;
        for (int i = 7; i >= 0; i--) {
            temp = arr[i];
            arr[i] = a;
            a = temp;
        }

    }

    public int[] last() {
        return arr;
    }
}