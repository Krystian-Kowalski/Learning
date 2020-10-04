package Unit3.While;

import java.util.Random;

class sumRace {
    public static void main(String[] args) {
        int sumaA = 1000;
        int sumaB = 0;
        int tryCounter = 0;
        Random randomGenerator = new Random();
        int increaseSumaA = randomGenerator.nextInt(10);
        int increaseSumaB = randomGenerator.nextInt(50);

        while(sumaA > sumaB) {
            tryCounter++;
            System.out.println("Waiting for the sumaA to be lower than sumaB : [attempt # " + tryCounter + "]" + "sumaA is: " + sumaA + " sumaB is: " + sumaB);
            sumaA = sumaA + increaseSumaA;
            sumaB = sumaB + increaseSumaB;
        }
        System.out.println("Finished! sumaA is: " + sumaA + " sumaB is: " + sumaB);
    }
}
