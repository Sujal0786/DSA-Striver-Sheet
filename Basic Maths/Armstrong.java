class Solution {
    public boolean isArmstrong(int n) {
                int sum=0;
                int x =n;
                while(n!=0){
                    int ls=n%10;
                    sum=sum+(ls*ls*ls);
                    n/=10;
                }
                return sum == x;
    }
}