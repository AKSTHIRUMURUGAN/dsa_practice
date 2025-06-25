import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={10,6,9,8,7,4,3};
        int k=sc.nextInt();
        int s=0;
        int e=1;
        int max=0;
        while(e!=arr.length){
            if(e-s==k-1){
                for(int i=s;i<=e;i++){
                    max=Math.max(max,arr[i]);
                }
                s++;
                System.out.println(max);
                max=0;
            }

            e++;
        }
    }
}

//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Read array size
//        int n = sc.nextInt();
//
//        // Read array elements
//        int[] arr = new int[n];
//        for(int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        // Read window size
//        int k = sc.nextInt();
//
//        Deque<Integer> dq = new LinkedList<>(); // stores indices
//
//        for(int i = 0; i < n; i++) {
//            // Remove indices out of current window
//            while(!dq.isEmpty() && dq.peekFirst() <= i - k) {
//                dq.pollFirst();
//            }
//
//            // Remove smaller elements (they'll never be max)
//            while(!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
//                dq.pollLast();
//            }
//
//            // Add current index
//            dq.offerLast(i);
//
//            // Print max for the current window
//            if(i >= k - 1) {
//                System.out.print(arr[dq.peekFirst()] + " ");
//            }
//        }
//    }
//}
