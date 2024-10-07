public class Solution {
    public int[] sortArray(int[] nums) {
        //invoke the mergeSort function with appropriate attribute values
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void mergeSort(int[] array, int low, int high) {
        //Calculate the mid index and invoke the mergeSort function recurvisely
        // and merge the sorted arrays
        if (array.length < 2) {
            return;
        }
        if (low < high) {
            int mid = low + (high - low)/2;
            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);
            merge(array, low, mid, high);
            }
        }


    public void merge(int[] array, int low, int mid, int high) {
        //Create two temporary array for holding the left sub-array and right sub-array
        int len1 = mid - low + 1;
        int len2 = high - mid;

        int[] leftArray = new int[len1];
        int[] rightArray = new int[len2];

        //Copy the appropriate elements of the original 'array' into the left and right sub-array

        for (int i = 0; i < len1; i++) {
            leftArray[i] = array[low + 1];
        }
        for (int j = 0; j < len2; j++) {
            rightArray[j] = array[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = low;
        // Implement the natural merging to merge two sorted arrays

        while (i < len1 && j < len2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            }
            else {
                array[k] = leftArray[i];
                j++;
            }
            k++;
        }
        //Copies the rest of the left array if there are any remaining elements
        while (i < len1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        //Copies the rest of the right array if there are any remaining elements
        while (j < len2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }

    }
}

