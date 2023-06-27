import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int i, j, temp, k;
        try (Scanner ob = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int n = ob.nextInt();
            int arr[] = new int[n];

            // Getting Elements of the Array
            System.out.println("Enter array elements: ");
            for (i = 0; i < n; i++)
                arr[i] = ob.nextInt();

            // Get the value of k
            System.out.print("Enter the value of k: ");
            k = ob.nextInt();

            // Sorting
            for (i = 0; i < n - 1; i++) {
                int maxi = i;
                for (j = i + 1; j < n; j++) {
                    if (arr[j] > arr[maxi])
                        maxi = j;
                }
                temp = arr[maxi];
                arr[maxi] = arr[i];
                arr[i] = temp;
            }

            // Printing first K largest elements
            for (i = 0; i < k; i++)
                System.out.print(arr[i] + " ");

            ob.close();
        }
    }
}
