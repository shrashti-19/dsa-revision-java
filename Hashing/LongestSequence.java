import java.util.HashSet;

public class LongestSequence{
    public static int sequence(int nums[]){
        if(nums.length ==0);
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int maxLength = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int currentSeq = 1;
                int currentNum = num;

                while(set.contains(currentNum+1)){
                    currentNum = currentNum+1;
                    currentSeq++;
                }
                if(currentSeq> maxLength){
                    maxLength =currentSeq;
                }
            }
        }
        return maxLength;
    }
}