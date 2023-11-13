class Solution {
    public int reverse(int x) {
        long num=0;
        long rev=0;
        while(x!=0){
            rev=x%10;
            num=num*10+rev;
            x=x/10;
        }
        if(num<Integer.MIN_VALUE||num>Integer.MAX_VALUE){
            return 0;
        }
        return (int)num;
    }
}