import java.util.HashSet;

import java.util.Set;

public class RearrangeArray {
    public int[] rearrange(int[] arr) {
        Set<Integer> data = new HashSet<>();
        for (int i : arr) {
            data.add(i);
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (data.contains(i)) {
                arr[i] = i;
            } else {
                arr[i] = -1;
            }
        }
        return arr;
    }
}
