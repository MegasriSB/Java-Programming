import java.util.*;

public class Search_Floor {
    public static void main(String[] args) {
        int i, x;
        try (Scanner ob = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int n = ob.nextInt();
            int arr[] = new int[n];

            // Getting Elements of the Array
            System.out.println("Enter array elements: ");
            for (i = 0; i < n; i++)
                arr[i] = ob.nextInt();

            // Get the value of k
            System.out.print("Enter the value of x: ");
            x = ob.nextInt();

            int start = 0;
            int end = n - 1;
            int floor = -1;

            while (start <= end) {
                int mid = (start + end) / 2;
                if (x == arr[mid])
                    System.out.println(arr[mid]);
                else if (x < arr[mid])
                    end = mid - 1;
                else {
                    floor = arr[mid];
                    start = mid + 1;
                }
            }
            System.out.println(floor);

            ob.close();
        }
    }
}
