class TestSort {
    public static void main(String[] args) {
        int[] data = { 38, 27, 43, 3, 9, 82, 10 };

        // Calling merge sort
        /*
         * System.out.println("Merge Sort"); MergeSort ms = new MergeSort();
         * ms.sort(data, 0, (data.length-1)); PrintArray pa = new PrintArray();
         * pa.display(data);
         */

        // Bubble Sort
/*
        System.out.println("Buble Sort");
        BubbleSort bSort = new BubbleSort();
        bSort.bubbleSort(data);
        PrintArray pa = new PrintArray();
        pa.display(data);

  */      //Selection Sort
        System.out.println("Selection Sort");
        SelectionSort ss = new SelectionSort();
        ss.selectionSort(data);
        PrintArray pa = new PrintArray();
        pa.display(data);


    }
}