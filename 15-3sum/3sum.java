class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> op = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                break;
            }
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            int left = i + 1, right = nums.length - 1;

            while(left < right){
                if(nums[i] + nums[left] + nums[right] == 0){
                    op.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left - 1]){
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
                else if(nums[i] + nums[left] + nums[right] < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return op;
    }
}
