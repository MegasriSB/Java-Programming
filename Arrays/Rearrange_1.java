package Rearrange_array;
public class Rearrange_1 {
    public static void main(String []args) {
        int i, j, temp;
        int n, a[] = { 0, -1, -1, 1, 9, 3, 2, -1, 4, -1 };
        n = a.length;
        for(i = 0; i < n; i++) {
            for(j = 0; j < n; j++) {
                if (a[j] == i) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                    break;
                }
            }
        }
        System.out.println("Array after Rearranging");
        for(i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}

