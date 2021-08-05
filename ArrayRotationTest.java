public class ArrayRotationTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        ArrayRotation ar = new ArrayRotation();
        ar.rotation(arr, 2);
        PrintArray pa = new PrintArray();
        pa.display(arr);
    }
}
