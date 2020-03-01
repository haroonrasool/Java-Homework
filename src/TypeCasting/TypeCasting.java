package TypeCasting;

/* In Java Type casting means assigning a value of one primitive data type to another type.
 * There are two types of castings in Java.
 *
 * Widening Casting is done automatically when converting a smaller size type to a larger type size.
 * byte -> short -> char -> int -> long -> float -> double
 *
 * Narrowing Casting is done manually when converting a larger size type to a smaller size type.
 * double -> float -> long -> int -> char -> short -> byte
 */
public class TypeCasting {
    public static void main(String[] args) {
        int number = 9;
        double widening = number; // Automatic casting integer to double

        System.out.println(number);      // Outputs 9
        System.out.println(widening);   // Outputs 9.0

        double myDouble = 9.78;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9
    }
}
