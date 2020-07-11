public class Test12 {
    public static int[] selectionSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,7,8,2};
        int[] arr1 = selectionSort(arr);
        for(int i : arr) {
            System.out.println(i);

        }
    }
}