// run Status : true

import java.util.Scanner;
import java.util.Arrays;

class MergeArrays
{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Size of Array: ");
        System.out.println("---------------------------");
        int size1 = sc.nextInt();
         System.out.println("---------------------------");
        

        System.out.println("Insert "+size1+" Element in First  Array :");
        int []arr1 = new int[size1];
        
        for(int i=0;i<size1;i++)
        {
            arr1[i]=sc.nextInt();
        }

        System.out.println("Thank you ");

        System.out.println("Enter the size of Second Array: ");
        System.out.println("---------------------------");
        int size2 = sc.nextInt();
         System.out.println("---------------------------");
        

        System.out.println("Insert "+size2+" Element in second Array : ");
        int []arr2 = new int[size2];

        for (int i=0;i<size2;i++) {
            arr2[i]=sc.nextInt();
            
        }
        //new Question wajp  to merge two arrays into one single arrays //
        

        int mergedArraySize = size1+size2;
        int[] mergedArray = new int[mergedArraySize];

        for(int i=0;i<size1;i++)
        {
            mergedArray[i]=arr1[i];
        }
        for(int i=0;i<size2;i++)
        {
            mergedArray[size1+i]=arr2[i];
        }

        System.out.println("First Array: " + Arrays.toString(arr1));
        System.out.println("Second Array: "+ Arrays.toString(arr2));
        System.out.println("Merged Array: "+Arrays.toString(mergedArray));
    }
}


// write a java prgram to check if the array is pelindrome which work for both;
//create a array of char datatype