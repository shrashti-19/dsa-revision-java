public class SortFrequency{
    public List<Character> frequencySort(String s) {
        // Your code goes here
        List<Character> result = new ArrayList<>();

        int[] count = new int[26];
        int n = s.length();

        for(int i=0 ; i<n ; i++){
            count[s.charAt(i)-'a']++;
        }

        while(n!=0){
            int maxFrequency = 0;
            int maxIndex = -1;

            for(int i=0 ; i<26 ; i++){
                if(count[i]>maxFrequency){
                    maxFrequency = count[i];
                    maxIndex = i;
                }
            }
            
            //only one e required like no repeat - unique
            char c = (char)(maxIndex + 'a');
            result.add(c);

            count[maxIndex]=0;
            n-=maxFrequency;

        }
        return result;

    }

}