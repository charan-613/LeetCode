class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int l = 0;
        int currentCost = 0;
        int maxLength = 0;
        int n = s.length();

        if(s.length() != t.length()){
            return 0;
        }

        for(int r = 0; r < n; r++){
            currentCost += Math.abs(s.charAt(r) - t.charAt(r));

            while(currentCost > maxCost){
                currentCost -= Math.abs(s.charAt(l) - t.charAt(l));
                l++;
            }
            maxLength = Math.max(maxLength, r - l + 1);
        }
        return maxLength;
    }
}