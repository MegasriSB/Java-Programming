package Set_2;
public class weight {
    public static void main(String[] args) {
        int i, j, temp;
        int arr[] = {10, 36, 54, 89, 12};
        int wei[] = new int[arr.length];
        for (i = 0; i < arr.length - 1; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (i = 0; i < arr.length; i++) {
            wei[i] = 0;
            int per_sq = (int) Math.sqrt(arr[i]);
            if (per_sq * per_sq == arr[i]) {
                wei[i] += 5;
            }
            if (arr[i] % 4 == 0 && arr[i] % 6 == 0) {
                wei[i] += 4;
            }
            if (arr[i] % 2 == 0) {
                wei[i] += 3;
            }
        }
        for (i = 0; i < arr.length; i++) {
            System.out.print("<" + arr[i] + "," + wei[i] + "> ");
        }
    }
}
