//Given a number, convert it into corresponding alphabet.
//
//Input                 Output
//
//1                           A
//
//26                         Z
//
//27                         AA
//
//676                      YZ
//
//Input Format
//
//Input is an integer
//
//Output Format
//
//Print the alphabets
//
//Constraints
//1 <= num <= 4294967295
//Sample Input 1
//26
//Sample Output 1
//Z
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int digit=n/27;
        int remaining=n%26;
        if(digit!=0){
            System.out.printf("%c",64+digit);}
        if(remaining!=0){
            System.out.printf("%c",64+remaining);
        }
        else{
            System.out.print("Z");
        }
    }
}