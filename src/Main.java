public class Main {
    public static void main(String[] args) {
        //1
        int [] numbers = new int [3];
        numbers [0] = 1;
        numbers [1] = 2;
        numbers [2] = 3;
        double [] fractions = {1.57, 7.654, 9.986};
        int [] countdown = {5, 4, 3, 2, 1};
        //2
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length - 1) {
                System.out.print(", ");
                ;
            }
        }
            System.out.println();
        for (int i = 0; i < fractions.length; i++) {
            System.out.print(fractions[i]);
            if (i != fractions.length - 1) {
                System.out.print(", ");
            }
        }
            System.out.println();
            for (int i = 0; i < countdown.length; i++) {
                System.out.print(countdown[i]);
                if (i != countdown.length - 1) {
                    System.out.print(", ");
                    ;
                }
            }
            System.out.println();
            //3
            for (int i = numbers.length - 1; i >= 0; i--) {
                System.out.print(numbers[i] + ", ");
            }
            System.out.println();
            for (int i = fractions.length - 1; i >= 0; i--) {
                System.out.print(fractions[i] + ", ");
            }
            System.out.println();
            for (int i = countdown.length - 1; i >= 0; i--) {
                System.out.print(countdown[i] + ", ");
            }
            System.out.println();
            //4
            for (int i = 0; i < numbers.length; i++) {
                if (i % 2 != 0) {
                    System.out.print(numbers[i] + " ");
                } else {
                    numbers[i] = numbers[i] + 1;
                    System.out.print(numbers[i] + " ");
                }
            }

    }
}