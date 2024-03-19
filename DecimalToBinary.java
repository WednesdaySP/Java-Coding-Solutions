import java.util.*;
public class DecimalToBinary {

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number:");
        int num=sc.nextInt();
        int i=0;
        int count=0;
        int []binary=new int[100];

        //for negative numbers
        if(num<0){
            System.out.println("Binary representation is:");
            System.out.println(Integer.toBinaryString(num));
            return;
        }

        //convert decimal to binary
        while(num!=0){
            binary[i]=num%2;
            if(binary[i]==1){
                count++;
            }
            num=num/2;
            i++;
        }
        System.out.println("Binary number is: ");

       //print count of set bits in it(i.e. number of 1's).
        for(int j=i-1;j>=0;j--){
            System.out.print(binary[j]);
        }
        System.out.println();
        System.out.println("Count of bits:"+count);

        // The task is to return the position of first set bit found from the right side in the binary representation of the number.
        for(int j=0;j<binary.length;j++){
            if(binary[j]==1){
                System.out.println(j+1);
                break;
            }
        }
    }
}
