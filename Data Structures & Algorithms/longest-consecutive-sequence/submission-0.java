class Solution {
    public int longestConsecutive(int[] nums) {
        int ans=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }

        for(int num : nums){
            int streak =0, curr =num;
            while(set.contains(curr)){
                streak++;
                curr++;
            }
            ans = Math.max(ans,streak);
        }
        return ans;
    }
}
