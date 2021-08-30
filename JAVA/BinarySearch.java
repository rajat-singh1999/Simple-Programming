class BinarySearch {
    // Returns index of x if it is present in arr[l..
    // r], else return -1
    static int binarySearchRec(int arr[], int l, int r, int x)
    {
        System.out.println("l="+l+" r="+r+" m="+(l + (r - l) / 2));
        if (r >= l) {
            int mid = l + (r - l) / 2;
            
 
            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;
 
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearchRec(arr, l, mid - 1, x);
 
            // Else the element can only be present
            // in right subarray
            return binarySearchRec(arr, mid + 1, r, x);
        }
 
        // We reach here when element is not present
        // in array
        return -1;
    }

    public static int binarySearch(int[] arr, int target)
    {
        int left, right, middle;
        left = 0;
        right = arr.length - 1;
        while(left <= right)
        {
            middle = left + (right-left)/ 2; // Find the middle index.
            int middleElement = arr[middle];
            if(middleElement == target)
            {
                return middle;
            }
            if(middleElement > target)
            {
                right = middle - 1;
            }
            else
            {
                left = middle + 1;
            }
        }
        return -1;
    }
 
    // Driver method to test above
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = {1, 2, 4, 12, 18, 23, 54, 56, 60, 89, 91, 102, 148, 176, 192};
        int x = 24;
        int result = ob.binarySearch(arr,x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}