public class BubbleSort {
    public static void main(String args[]) 
    {
        int[] array = {12,15,10,3,2,14};
        bubbleSort(array);
        
        System.out.println("Sorted array:");
        for (int i=0;i<array.length;i++) {
            System.out.print(array[i] +" ");
        }
    }
    
    public static void bubbleSort(int[] arr) 
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
         {
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
