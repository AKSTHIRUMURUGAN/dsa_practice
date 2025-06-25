// problem:Stock Buy and Sell – Multiple Transaction Allowed

//description:
//The cost of stock on each day is given in an array price[]. Each day you may decide to either buy or sell the stock i at price[i], you can even buy and sell the stock on the same day. Find the maximum profit that you can get.
//Note: A stock can only be sold if it has been bought previously and multiple stocks cannot be held on any given day.

//example
//Input: prices[] = [100, 180, 260, 310, 40, 535, 695]
//Output: 865
//Explanation: Buy the stock on day 0 and sell it on day 3 => 310 – 100 = 210. Buy the stock on day 4 and sell it on day 6 => 695 – 40 = 655. Maximum Profit = 210 + 655 = 865.
public class Main {
    public static int maximumProfit(int prices[]) {
        int profit=0;
        int v=0;
        int b=0;
        int s=1;
        while(s!=prices.length){
            if(prices[b]<prices[s]){
                if(prices[s]-prices[b]>v){
                    v=prices[s]-prices[b];
                }
                else{
                    profit+=v;
                    v=0;
                    b=s;
                    s++;
                    continue;
                }
            }
            else{
                profit+=v;
                v=0;
                b=s;
                s++;
                continue;

            }
            s++;
        }
        return profit+v;

    }
    public static void main(String[] args) {
        int[] prices={4,2,2,4};
        System.out.println(maximumProfit(prices));
    }
}