import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        int[] array = new int [200000000];
        AtomicInteger sum = new AtomicInteger(0);
        for (int i = 0; i < array.length; i++) {
            array[i] = 1;
        }
        Thread tOne = new Thread(new CalculationThread(0, array.length/4, array, sum));
        Thread tTwo = new Thread(new CalculationThread(array.length/4, array.length/2, array, sum));
        Thread tThree = new Thread(new CalculationThread(array.length/2, array.length * 3/4, array, sum));
        Thread tFour = new Thread(new CalculationThread(array.length * 3/4, array.length, array, sum));
        long tMultStart = System.currentTimeMillis();
        tOne.start();
        tTwo.start();
        tThree.start();
        tFour.start();
        try {
            tOne.join();
            tTwo.join();
            tThree.join();
            tFour.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long tMultEnd = System.currentTimeMillis();
        System.out.println("Multithreading sum : " + (tMultEnd - tMultStart) + " ms");
        long tSingleStart = System.currentTimeMillis();
        sum(array);
        long tSingleEnd = System.currentTimeMillis();
        System.out.println("Single thread sum : " + (tSingleEnd - tSingleStart) + " ms");
    }

    private static int sum(int[] array){
        int result = 0;
        for (int element : array) {
            result += element;
        }
        return result;
    }
}
