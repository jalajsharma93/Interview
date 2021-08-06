public class ArrayRotation {
    public int[] rotation(int[] arr, int d) {
        int temp2[] = new int[d];
        int temp[] = new int[arr.length];
        int k = 0;

        for (int i = 0; i < d; i++) {
            temp2[i] = arr[i];
        }

        int index = 0;
        for (k = d; k < arr.length; k++) {

            temp[index] = arr[k];
            index++;
        }

        for (int i = 0; i < temp2.length; i++) {
            temp[index] = temp2[i];
            index++;
        }
        return temp;
    }
}
