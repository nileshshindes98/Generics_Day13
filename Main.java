package generics;
import java.lang.Float;
public class Main {
    public static void main(String[] args) {
        Max_problem mp = new Max_problem();

        Integer max1 = mp.findMaximum(10, 5, 3);
        System.out.println("Maximum: " + max1);
        //Maximum number at 1st position

        // Maximum number at 2nd position
        Integer max2 = mp.findMaximum(7, 15, 4);
        System.out.println("Maximum: " + max2);

        // Maximum number at 3rd position
        Integer max3 = mp.findMaximum(2, 8, 12);
        System.out.println("Maximum: " + max3);
        System.out.println();
        System.out.println("**************** Float *****************");
        System.out.println();

        // Maximum number at 1st position (Float)
        Float max4 = mp.findMaximum(3.2f, 2.5f, 1.8f);
        System.out.println("Maximum (Float): " + max4);


        //Maximum number at 2nd position (Float)
        Float max5 = mp.findMaximum(5.5f, 10.2f, 3.7f);
        System.out.println("Maximum (Float): " + max5);

        //Maximum number at 3rd position (Float)
        Float max6 = mp.findMaximum(5.5f, 10.2f, 12.1f);
        System.out.println("Maximum (Float): " + max6);

        System.out.println();
        System.out.println("***************** String ****************");
        System.out.println();

        String max7 = mp.findMaximum("banana", "Peach", "apple");
        System.out.println("Maximum (String): " + max7);


    }
}

