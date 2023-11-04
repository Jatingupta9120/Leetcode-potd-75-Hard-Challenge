/*1503. Last Moment Before All Ants Fall Out of a Plank
 *QuestionLink:-https://leetcode.com/problems/last-moment-before-all-ants-fall-out-of-a-plank/description/
 My Solution in Java:-Day 03 of 75
 */
class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
     int result=0;
     for(int x:left){
         result=Math.max(x,result);
     }   
     for(int x:right){
         result=Math.max(n-x,result);
     } 
     return result;  
    }
}