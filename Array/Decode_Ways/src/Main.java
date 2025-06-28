import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String in=sc.nextLine().trim();
        int n=in.length();
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<=n;i++){
            int d=Integer.parseInt(in.substring(i-1,i));
            int td=Integer.parseInt(in.substring(i-2,i));
            if(td>=10&&td<=26){
                dp[i]+=dp[i-2];
            }
            if(d!=0){
                dp[i]+=dp[i-1];
            }

        }
        System.out.println(dp[n]);

    }
}