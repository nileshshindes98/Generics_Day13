package generics;

public class Main {
    public static void main(String[] args) {
        Max_problem mp = new Max_problem();


        Integer max1 = mp.findMaximum(10, 5, 3);
        System.out.println("Maximum: " + max1);
        //Maximum number at 1st position
        if (max1.equals(10)) {
            System.out.println("Condition Passed");
        } else {
            System.out.println("Condition Failed ");
        }

        // Maximum number at 2nd position
        Integer max2 = mp.findMaximum(7, 15, 4);
        System.out.println("Maximum: " + max2);

        // Maximum number at 3rd position
        Integer max3 = mp.findMaximum(2, 8, 12);
        System.out.println("Maximum: " + max3);
        System.out.println();
        System.out.println("****************Float*****************");
        System.out.println();

        // Maximum number at 1st position (Float)
        Float max4 = mp.findMaximum(3.2f, 2.5f, 1.8f);
        System.out.println("Maximum (Float): " + max4);
        if (max4.equals(3.2f)) {
            System.out.println("Float Condition Passed");
        } else {
            System.out.println("Float Condition Failed");
        }

        //Maximum number at 2nd position (Float)
        Float max5 = mp.findMaximum(5.5f, 10.2f, 3.7f);
        System.out.println("Maximum (Float): " + max2);
        if (max5.equals(10.2f)) {
            System.out.println("Float Condition Passed");
        } else {
            System.out.println("Float Condition Failed");
        }

    }
}

