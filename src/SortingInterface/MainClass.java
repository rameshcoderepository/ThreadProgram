package SortingInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        List<Laptop> laptopList = new ArrayList<Laptop>();
        
        
               // String
        
        laptopList.add(new Laptop("DELL", 250, 30000));
        laptopList.add(new Laptop("Lenovo", 500, 7000));
        laptopList.add(new Laptop("KCER", 125, 45000));
        laptopList.add(new Laptop("MAC", 750, 50000));
        
         Collections.sort(laptopList);
         
         for(Laptop laptop:laptopList){
             System.out.println(laptop);
         }
        
        List<Integer> integerobj=new ArrayList<Integer>();
        
        integerobj.add(23);
        integerobj.add(Integer.valueOf(36));
        integerobj.add(50);
        
        Collections.sort(integerobj);

         List<String> stringobj=new ArrayList<String>();
        
        stringobj.add("c");
        stringobj.add("A");
        stringobj.add("B");
        
        Collections.sort(stringobj);
        
        int a[]=new int[5];
         a[0]=4;
         a[1]=3;
         a[2]=9;
         a[3]=2;
         a[4]=11;
         
         Arrays.sort(a);
    }

}
