package Arrays;

public class SearchingAlgo {
    
    public static int linearsearchalgo(int arr[] , int x) { 
        int n = arr.length;
    
        for(int i = 0; i<n; i++) { 
            if(arr[i] == x) { 
                return i;
            }
        }
        return -1;
    }

    // Binary search :

    public static void main(String[] args) {
        int arr[] = {1 ,2 ,3 ,4 , 5};
        int x = 4;
        int result = linearsearchalgo(arr, x);
        System.out.println(result);
    }
    
}
