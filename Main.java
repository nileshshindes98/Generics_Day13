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
    }
}

