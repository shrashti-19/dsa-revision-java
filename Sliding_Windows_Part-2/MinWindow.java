public class MinWindow{
    public String minWindow(String s, String t) {
        //your code goes here
        HashMap<Character, Integer> tFreq = new HashMap<>();
        HashMap<Character, Integer> windowFreq  = new HashMap<>();
        for(int i=0 ; i<t.length() ; i++){
            tFreq.put(t.charAt(i), tFreq.getOrDefault(t.charAt(i),0)+1);
        }
        int left=0;
        int minLen = Integer.MAX_VALUE;
        int formed = 0;
        int bestStart=0;
        
        for(int right=0 ; right<s.length(); right++){
            char ch = s.charAt(right);

            if(tFreq.containsKey(ch)){
                windowFreq.put(ch, windowFreq.getOrDefault(ch,0)+1);

                if(windowFreq.get(ch)<=tFreq.get(ch)){
                    formed++;
                }
            }

            while(t.length()==formed){
                int currentLength = right-left+1;
                
                if(currentLength< minLen){
                    minLen = currentLength;
                    bestStart = left;
                }
                
                char chr = s.charAt(left);
                if(tFreq.containsKey(chr) && windowFreq.get(chr)<=tFreq.get(chr)){
                    formed--;
                }

                //decrease window frequency for left
                windowFreq.put(chr, windowFreq.getOrDefault(chr,0)-1);
                left++;
            }


        }
        if(minLen == Integer.MAX_VALUE){
           return "";
        }
        
        return s.substring(bestStart, minLen+bestStart);
    }
}