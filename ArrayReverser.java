package class10;
public class ArrayReverser 
{ 
    public static void reverseArray(int[] arr) 
    {   int start = 0; int end = arr.length - 1; 
        while (start < end) 
        { // Swap elements without using a temporary variable 
            arr[start] = arr[start] + arr[end]; 
            arr[end] = arr[start] - arr[end]; 
            arr[start] = arr[start] - arr[end];
            // Move to the next pair of elements 
            start++; end--; 
        } 
    } 

    public static void main(String[] args) { 
        // Example usage 
        int[] arrayToReverse = {1, 2, 3, 4, 5}; 
        reverseArray(arrayToReverse);
        // Print reversed array 
        for (int num : arrayToReverse) 
        { 
            System.out.print(num + " "); 
        } 
    }
}
