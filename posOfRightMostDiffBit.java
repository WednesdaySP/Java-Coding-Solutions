public class posOfRightMostDiffBit {

    public static void posRightBit(int m, int n){
//        int []binaryM=new int[100];
        int i=1;
//        int []binaryN=new int[100];
//        int r=0;
//
//        while(m!=0){
//            binaryM[i]=m%2;
//            m=m/2;
//            i++;
//        }
//        while(n!=0){
//            binaryN[r]=n%2;
//            n=n/2;
//            r++;
//        }
//        for(int j=0;j<binaryM.length;j++){
//            for(int k=0;k<binaryN.length;k++){
//                if(binaryM[j]==binaryN[k]){
//                    System.out.println(k+1);
//                }
//                else
//                    System.out.println("-1");
//            }
//        }

        while(((m&1)==(n&1))&&(m!=0 || n!=0)){
            m>>=1;
            n>>=1;
            i++;
        }
        if(m!=n){
            System.out.println(i);
        }
        else
            System.out.println("-1");
    }
    public static void main(String []args){
        posRightBit(18,18);


    }
}
