package generics;

public class Max_problem {
    public static Integer findMaximum(Integer num1, Integer num2, Integer num3)
    // we use Integer object instead of int Primitive data type
    //when we use 'int' the we allow only operators to compare and in other
    // hand 'Integer' is object which allows .compareTo method
    {
        Integer max = num1;
        if (num2.compareTo(max) > 0) {
            max = num2;
        }
        if (num3.compareTo(max) > 0) {
            max = num3;
        }
        return max;
    }
    //UC2 check same for float number
    public static Float findMaximum(Float num1, Float num2, Float num3) {
        Float max = num1;
        if (Float.compare(num2, max) > 0) {
            max = num2;
        }
        if (Float.compare(num3, max) > 0) {
            max = num3;
        }
        return max;
    }
    // UC3 for String

    public static String findMaximum(String str1, String str2, String str3) {
        String max = str1;
        if (str2.compareTo(max) > 0) {
            max = str2;
        }
        if (str3.compareTo(max) > 0) {
            max = str3;
        }
        return max;
    }
}