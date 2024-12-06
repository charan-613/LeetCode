class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> bannedSet = new HashSet<>();
        for(int i : banned){
            bannedSet.add(i);
        }

        int sum = 0;
        int count = 0;

        for(int i = 1; i <= n; i++){
            if(bannedSet.contains(i)){
                continue;
            }
            if(sum + i > maxSum){
                break;
            }
            sum += i;
            count++;
        }
        return count;
    }
}