class MaxProductSubArray {
    public int maxProduct(int[] nums) {
        
        if(nums.length==0){return 0;}
        int mins = nums[0];
        int maxs = nums[0];
        int product = maxs;    
        
        for(int i=1;i<nums.length;i++){
            int tmax = Math.max(nums[i], Math.max(maxs*nums[i],mins*nums[i]));
            mins = Math.min(nums[i],Math.min(mins*nums[i],maxs*nums[i]));
            
            maxs=tmax;
            product = Math.max(product,maxs);
        }
        return product;
    }
}