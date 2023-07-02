package generics;

public class Main {
    public static void main(String[] args) {
        Max_problem mp = new Max_problem();

        // Test case 1: Maximum number at 1st position
        Integer max1 = mp.findMaximum(10, 5, 3);
        System.out.println("Maximum: " + max1);

        // Test case 2: Maximum number at 2nd position
        Integer max2 = mp.findMaximum(7, 15, 4);
        System.out.println("Maximum: " + max2);

        // Test case 3: Maximum number at 3rd position
        Integer max3 = mp.findMaximum(2, 8, 12);
        System.out.println("Maximum: " + max3);
    }
}

