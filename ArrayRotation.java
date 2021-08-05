public class ArrayRotation {
    public int[] rotation(int[] arr, int d) {
        int temp2[] = new int[d - 1];
        int temp[] = new int[arr.length - 1];
        // int curr_index=0;
        int k = 0;

        for (int i = 0; i <= d; i++) {
            temp2[i] = arr[i];
        }
        for (k = d - 1; k < arr.length - d - 1; k++) {
            temp[k] = arr[k];
        }
        k = k + 1;
        for (int i = 0; i < arr.length - 1; i++) {
            temp[k] = temp2[i];
        }

        return temp;
    }
}
