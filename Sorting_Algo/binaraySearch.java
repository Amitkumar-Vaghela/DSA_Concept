## using recursssion 
 
 binarySearchSort(a,i,j,x)
{
   mid=(i+j)/2;
  if(mid=x)
  {
    return x;
  }

  elseif(a[mid]>x)
    {
    binarySearchSort(a,i,mid-1,x);
    }
  else{
    binarySearchSort(a,mid+1,j,x);
     }
}

here the exaple of binary seach 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the elements of the array in sorted order:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Enter the element to search:");
        int x = scanner.nextInt();

        int result = binarySearch(a, x);
        if (result == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }

    public static int binarySearch(int[] a, int x) {
        int i = 0;
        int j = a.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a[mid] == x) {
                return mid;
            } else if (a[mid] < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return -1;
    }
}
  
