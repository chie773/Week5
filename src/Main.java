public class Main {
    public static void main(String[] args) {

        int arr[] = {2,1,14,54,25,1};

        Solution solver = new Solution();
        int newArr[] = solver.sortArray(arr);

        for (int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }


    }
}