class TestSort {
    public static void main(String[] args) {
        int[] data = {38,27,43,3,9,82,10};
       
        MergeSort ms = new MergeSort();
        ms.sort(data, 0, (data.length-1));
        PrintArray pa = new PrintArray();
        pa.display(data);
    }
}