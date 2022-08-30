public class BubbleSort 
{

    static void bubbleSort (int[]arr) // driver class
        {
            int n = arr.length;
            int temp = 0;

            for (int i = 0; i < arr.length; i++)
            {
                for (int j = 1; j <(n - i);j++)
                {
                    if (arr[j-1] > arr[j])
                    {
                        //swap elements
                        temp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }  
        }

        static void printArray (int[]arr) // print array class 
        {
            int i;
            for (i = 0; i < arr.length; i++)
            {
                System.out.print(arr[i]);
                System.out.println();
            }
        }


    public static void main(String[] args) // main app 
    {
        int arr[] = {10,40,20,50,30,5};
        int n = arr.length;
        System.out.println("Before bubbleSort : ");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("After bubbleSort : ");
        printArray(arr);
    }

}
