import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class MergeTwoArrays {
    public static void main(String args[]) {
        //
        int size;

        String [] array1;
        String [] array2;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if (size> 20)
            {
                System.out.println("Size large");
            }
        }while (size > 20);
        //
        array1 = new String[size];

        int i =0;

        while (i< array1.length)
        {
            System.out.println("Enter element 1 "+(i+1)+ " : ");
            array1[i] =scanner.next();
            i++;
        }

        //
        array2 = new String[size];

        int j = 0;

        while (j < array2.length)
        {
            System.out.println("Enter element 2 "+(j+1)+ " : ");
            array2[j] = scanner.next();
            j++;
        }
        //
        List list = new ArrayList(Arrays.asList(array1));
        list.addAll(Arrays.asList(array2));
        Object[] c = list.toArray();
        System.out.println(Arrays.toString(c));
    }
}