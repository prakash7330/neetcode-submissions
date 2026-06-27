class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Arrays.sort(nums);
        // HashSet<List<Integer>> set = new HashSet<>();
        
        // for(int i=0; i<nums.length-2; i++){
        //     for(int j=i+1; j<nums.length-1; j++){
        //         for(int k=j+1; k<nums.length; k++){
        //             int sum = nums[i] + nums[j] + nums[k];
        //             if(sum == 0){
        //                 List<Integer> ls = new ArrayList<>(List.of(nums[i], nums[j], nums[k]));
        //                 set.add(ls); 
        //             }
        //         }
        //     }
        // }
        // return new ArrayList<>(set);
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> ls = new ArrayList<>();
        for(int i=0; i<n-2; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int l=i+1;
            int r=n-1;

            while(l<r){
                int sum =nums[i] + nums[l] + nums[r];
                if(sum ==0){
                    ls.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while(l<r && nums[l]==nums[l+1]) l++;
                    while(l<r && nums[r]==nums[r-1]) r--;

                    l++;
                    r--;
                }else if(sum < 0){
                    l++;
                }else{
                    r--;
                }
            }
              
        }
        return ls;
    }
}
