class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int sum =0;
        // for(int i=0; i<nums.length-1; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         sum =nums[i]+nums[j];
        //         if(sum == target){
        //         return new int[] {i,j};
        //     }
        //     }
            
        // }
        // return new int[]{};
        HashMap<Integer,Integer> map = new HashMap<>();
        int diff =0;
        for(int i=0; i<nums.length; i++){
            diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
