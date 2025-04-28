class Palidrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121)); 
    }
    public static boolean isPalindrome(int n) {
        if (n < 0) return false; 
        
        int x = n;
        int sum = 0;
        while (n > 0) {
            int ls = n % 10;
            sum = sum * 10 + ls;
            n = n / 10;
        }
        return sum == x; 
    }
}
