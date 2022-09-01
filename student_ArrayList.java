import java.util.*;

public class ArrayList_Student 
{
    public static void main(String[] args)
    {
        ArrayList stu = new ArrayList();

        if (stu.isEmpty())
        {
            System.out.println("\n The Array Is Empty!");
        }

        stu.add("Ahmad");
        stu.add("Melati");
        stu.add("Wahid");
        stu.add("Sarah");
        stu.add("Husin");

        System.out.println("\n The Array Contains:");
        System.out.println(stu);

        System.out.println("\n Index 3 Contains :"+stu.get(3));
        System.out.println("\n Index 0 Contains :"+stu.get(0));

        System.out.println("\n The size of the Array : "+stu.size());

        stu.remove(2);

        System.out.println("\n The new Array contains :");
        System.out.println(stu);

        stu.add("Zakaria");

        System.out.println("\n The new Array contains :");
        System.out.println(stu);

        stu.add(1,"Rahmah");

        System.out.println("\n The new Array contains :");
        System.out.println(stu);

        if (stu.isEmpty())
        {
            System.out.println("\n The Array is empty !!!");
        }
        else
        {
            System.out.println("\n The Array is not empty and size is :"+stu.size());
        }

        stu.set(3,"Orkid");
        
        System.out.println("\n The new Array contains :");
        System.out.println(stu);

        if (stu.contains("Melati"))
        {
            System.out.println("\n Melati is in the array");
        }

        stu.clear();

        if (stu.isEmpty())
        {
            System.out.println("\n The Array is empty");
        }
        else
        {
            System.out.println("\n The array is not empty and size is " + stu.size());
        }
    }

    
}
