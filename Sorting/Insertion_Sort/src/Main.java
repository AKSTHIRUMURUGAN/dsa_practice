public class Main {
    public static void main(String[] args) {
    int[] arr={8,9,3,4,2,7};
    InsertionSort(arr);
    for(int i:arr){
        System.out.println(i);
    }
    }

    private static void InsertionSort(int[] arr) {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}