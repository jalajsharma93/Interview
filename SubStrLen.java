import java.util.*;
class SubStrLen {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
           int temp = target-nums[i];
            if(m.containsKey(temp)){
                return new int[] {m.get(temp),i}; 
            }
            else{
                m.put(nums[i],i);
            }
        }
        return null;
    }
}