class GCD {
        public static void main(String[] args) {
            System.out.println(GCDs(12, 15)); 
        }
        public static int GCDs(int n1, int n2) {
          while(n2!=0){
            int temp=n2;
            n2=n1%n2;
            n1=temp;
          }
          return n1;
        }
 }   
