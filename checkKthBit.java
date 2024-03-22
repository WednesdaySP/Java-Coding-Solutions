public class checkKthBit {


//        int i=1;
//        // Your code here
//        while((n&1) && (n!=0)){
//            n>>=1;
//            i++;
//
//        }
//        if(i!=1){
//            return false;
//        }
//        else{
//            return true;
//        }

    static boolean checkKthBit(int n, int k)
    {
        return ((n & (1 << k)) != 0);
    }
    public static void main(String [] args){
//        int k, n;
//        int [] binary=new int[100];
//        while(n!=0){
//        checkKthBit(4,0);
        int n = 10; // Binary representation: 100
        int k = 3; // Check the 0th bit
        boolean result = checkKthBit(n, k);
        System.out.println( result);

        }
    }

