class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" "); 
        if(words.length == 1){
            return words[0].charAt(0) == words[0].charAt(words[0].length() - 1);
        }

        for(int i = 0; i < words.length; i++){
            String currentWord = words[i];
            String nextWord = words[(i + 1) % words.length];
            if(currentWord.charAt(currentWord.length() - 1) != nextWord.charAt(0)){
                return false;
            }
        }
        return true;
    }
}