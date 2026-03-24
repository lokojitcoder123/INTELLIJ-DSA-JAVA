package Recursion;

import java.util.ArrayList;

public class StringsBasicsMore {
    public static void main(String[] args) {
        String s = "Lokojit";
        change(s);
        System.out.println(s);
        
        String[] arr = {"Santosh","Krish","Rahul","Preet"};

        ArrayList<String> al = new ArrayList<>();
        al.add("fokojit");
        al.add("kokojit");
        al.add("dokojit");
        System.out.println(al);
        change2(al);
        System.out.println(al);

    }
    private static void change2(ArrayList<String> al){
        al.add("biplab");
    }

    private static void change(String s) {
        s = "Ranojit";

    }
}
