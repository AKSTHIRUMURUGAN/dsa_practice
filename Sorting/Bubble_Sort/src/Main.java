public class Main {
    static void BubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                    swapped=true;
                }
            }
            if(!swapped) return;
        }
    }
    public static void main(String[] args) {
       int[] arr={6,7,5,3,2,1};
       BubbleSort(arr);
       for(int i:arr){
           System.out.println(i);
       }

    }
}