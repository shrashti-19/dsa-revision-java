public class MaxCard{
        public int maxScore(int[] cardScore, int k) {
        //your code goes here
        int n  = cardScore.length;
        int totalSum = 0;

        //exact sum = totalSum - (n-k) sum

        for(int i=0 ; i<n ; i++){
            totalSum+=cardScore[i];
        }

        int left=0;
        int sum=0;
        int minSum = 0;

        for(int right=0 ; right<n-k ; right++){
            sum+=cardScore[right];
        }
        minSum = sum;

        for(int right=n-k ; right<n ; right++){
            sum-=cardScore[left];
            left++;
            sum+=cardScore[right];
            minSum = Math.min(sum, minSum);
        }

        return totalSum - minSum;
        }
}