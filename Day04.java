/*1535. Find the Winner of an Array Game
 Link-https://leetcode.com/problems/find-the-winner-of-an-array-game/description/?envType=daily-question&envId=2023-11-05
 My Solution in Java:-Day 04 of 75
 */
class Solution {
    public int getWinner(int[] arr, int k) {
        int n=arr.length;
        int max=arr[0];
        for(int i:arr){
            max=Math.max(i,max);
        }
        if(k>=n){
            return max;
        }
        int winner=arr[0],streak=0;
        for(int i=1;i<n;i++){
            if(arr[i]>winner){
                winner=arr[i];
                streak=1;
            }else{
                streak++;
            }
            if(streak==k||winner==max){
                return winner;
            }
        }
        return -1;
        

    }
}