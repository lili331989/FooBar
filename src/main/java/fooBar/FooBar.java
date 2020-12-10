package fooBar;

import java.util.HashMap;
import java.util.Scanner;

public class FooBar {
    public static void main(String[] args) {
        System.out.println("Введите целое число больше 0");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int n;
        try {
            n = Integer.parseInt(str);
            getResult(n);
//            getResult2(n);   // второе решение
//            getResult3(n);   // третье решение
        }
        catch (Exception ex) {
            System.out.println("Incorrect format!");
        }
    }

    public static void getResult(int k) {
        if (k > 1) {
           int n= k- 1;
            getResult(n);
        }
        if (k % 15 == 0) System.out.println("FooBar");
        else if (k % 3 == 0) System.out.println("Foo");
        else if (k % 5 == 0) System.out.println("Bar");
        else System.out.println(k);
    }

    public static void getResult2(int n){
        for (int i=1;i<n+1;i++){
            if (i % 15 == 0) System.out.println("FooBar");
            else if (i % 3 == 0) System.out.println("Foo");
            else if (i % 5 == 0) System.out.println("Bar");
            else System.out.println(i);
        }
    }

    public static void getResult3(int n){
        HashMap<Integer,String> values=new HashMap <>();
        values.put(1,"Numb");
        values.put(2,"Numb");
        values.put(3,"Foo");
        values.put(4,"Numb");
        values.put(5,"Bar");
        values.put(6,"Foo");
        values.put(7,"Numb");
        values.put(8,"Numb");
        values.put(9,"Foo");
        values.put(10,"Bar");
        values.put(11,"Numb");
        values.put(12,"Foo");
        values.put(13,"Numb");
        values.put(14,"Numb");
        values.put(15,"FooBar");
        int cycles=n/15;
        int remain=n%15;
        for (int i=0;i<cycles;i++){
            for (int j=1;j<16;j++){
             if (values.get(j).equals("Numb")) System.out.println(j+15*i);
             else System.out.println(values.get(j));
            }
        }
        for (int i=1;i<remain+1;i++){
            if (values.get(i).equals("Numb")) System.out.println(i+15*cycles);
            else System.out.println(values.get(i));
        }
    }
}
