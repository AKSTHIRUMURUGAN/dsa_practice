//Given a number N, the program must print if N is a step number or not. (A step number is a number which has a digit which is either 1 more or 1 less than the previous digit).
//
//Input Format:
//
//The first line contains N.
//
//Output Format:
//
//The first line contains yes or no
//
//Boundary Conditions:
//
//10 <= N <= 99999999
//
//Example Input/Output 1:
//
//Input:
//
//1212343
//
//Output:
//
//yes
//
//Example Input/Output 2:
//
//Input:
//
//342345
//
//Output:
//
//no
//
//Explanation:
//
//The difference between 2 and 4 is NOT 1.
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        boolean f=true;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int digit=0;
        int value=v;
        while(value!=0){
            digit=value%10;
            arr.add(digit);
            value/=10;
        }
        for(int i=0;i<arr.size()-1;i++){
            if(!(arr.get(i)+1==arr.get(i+1)||arr.get(i)==arr.get(i+1)+1)){
                f=false;
            }

        }
        if(f){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}