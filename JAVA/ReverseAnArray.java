public class ReverseAnArray {	

    static void rvereseArray(int arr[])
        {
            int temp, start=0, end=arr.length-1;
            
            while (start < end)
            {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }	
        
        static void printArray(int arr[])
        {
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");
            
            System.out.println();
        }
    
        // Driver code
        public static void main(String[] args) {
            
            int arr[] = {1, 2, 3, 4, 5, 6};
            printArray(arr);
            rvereseArray(arr);
            System.out.print("Reversed array is \n");
            printArray(arr);
            
        }
    }
    