public class RearrangeArrayTest {
    public static void main(String[] args) {
        int[] arr = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
        PrintArray pa = new PrintArray();
        System.out.println("Array");
        pa.display(arr);
        RearrangeArray ra = new RearrangeArray();
        ra.rearrange(arr);
        System.out.println("\n Rearranged Array");
        pa.display(arr);
    }
}
