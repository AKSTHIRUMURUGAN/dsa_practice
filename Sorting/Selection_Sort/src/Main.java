public class Main {
    public static void main(String[] args) {
    int[] arr={8,4,2,3,1};
    SelectionSort(arr);
    for(int i:arr){
        System.out.print(i);
    }
    }

    private static void SelectionSort(int[] arr) {
        int minIndex=0;
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i;j<n;j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int t=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=t;
        }
    }
}