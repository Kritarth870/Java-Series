public class Decreasing_Sort {
    public static void main(String[] args) {
        int arr[] = {1 ,3 ,2 ,5 ,4};


        // BY Using Bubble Sort
        
        for(int i=0 ; i<arr.length-1 ; i++){
            for(int j=0 ; j<arr.length-i-1 ; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int ele : arr){
            System.out.println(ele);
        }
    }
}
