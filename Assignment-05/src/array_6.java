class array_6 {
    public static void main(String[] args) {
        int arr[] = getArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    static int[] getArray() {
        int arr[] = {1, 2, 3, 4, 5};
        return arr;
    }
}