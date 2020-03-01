package Parsing;

/*
Parsing is the process of turning some kind of data into another kind of data.
 */

public class Parsing {
    public static void main(String[] args) {
        // Parsing String to int
        String s1 = "12";
        // System.out.println(s1 * s1);            //  gives compilation error
        int a = Integer.parseInt(s1);
        System.out.println("a*a is : " + a * a);   // 144

        // Parsing String to double
        String s2 = "12.2";
        // System.out.println(s2 * s2);            //  gives compilation error
        double b = Double.parseDouble(s2);
        System.out.println("b*b is : " + b * b);   // 148.83
    }
}
