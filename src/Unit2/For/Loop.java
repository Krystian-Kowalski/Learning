package Unit2.For;

import java.util.Random;

public class Loop {
    public static void main(String[] args) {
        Random rd = new Random();
        double sum =0;
        int[] number = new int[20];

        for (int i=0; i < number.length ; i++) {
            number[i] = rd.nextInt();
            System.out.println(number[i]);
            sum = sum + number[i];
        }

        double average = sum/ number.length;

        System.out.println("The average of elements is: " + average);
    }
}
