class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int l = 0;
        int count = 0;
        int sum = 0;

        for(int r = 0; r < n; r++){
            sum += arr[r];

            if(r - l == k){
                sum = sum - arr[l];
                l++;
            }

            if(r - l + 1 == k){
                if(sum / k >= threshold){
                    count++;
                }
            }
        }
        return count;
    }
}