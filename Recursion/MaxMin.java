public class MinMaxRecursion {
    
    // Helper method to find the minimum element recursively
    public static int findMin(int[] arr, int n) {
        // Base case: if the array has only one element
        if (n == 1) {
            return arr[0];
        }
        // Recursively find the minimum of the rest of the array
        int minRest = findMin(arr, n - 1);
        // Return the minimum of the last element and the minimum of the rest
        return Math.min(arr[n - 1], minRest);
    }
// Helper method to find the maximum element recursively
    public static int findMax(int[] arr, int n) {
        // Base case: if the array has only one element
        if (n == 1) {
            return arr[0];
        }
        // Recursively find the maximum of the rest of the array
        int maxRest = findMax(arr, n - 1);
        // Return the maximum of the last element and the maximum of the rest
        return Math.max(arr[n - 1], maxRest);
    }
// Drive code
    public static void main(String[] args) {
        int[] arr = {12, 34, 5, 70, 56, 92, 10, 2};
        int n = arr.length;

        int min = findMin(arr, n);
        int max = findMax(arr, n);

        System.out.println("Minimum element is: " + min);
        System.out.println("Maximum element is: " + max);
    }
}

// output will be 
Minimum element is : 2
Maximum element is : 92
