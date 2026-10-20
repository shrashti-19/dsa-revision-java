public class CharacterReplacement{
    public int characterReplacement(String s, int k) {
        //your code goes here
        int left = 0;
        int maxFrequency = 0;
        int[] frequency = new int[26];
        int maxLength= 0;


        for(int right=0; right<s.length() ; right++){
            char ch = s.charAt(right);
            frequency[ch-'A']++;
            //max frequency with the character that has currently entered
            maxFrequency = Math.max(maxFrequency, frequency[ch-'A']);

            
            while((right-left+1) - maxFrequency > k){
                //shrink 
                frequency[s.charAt(left)-'A']--;
                left++;
            }
            //window become valid
            maxLength = Math.max(maxLength, right-left+1);   
        }
        return maxLength;
    }
}