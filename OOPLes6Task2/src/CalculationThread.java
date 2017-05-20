import java.util.concurrent.atomic.AtomicInteger;

public class CalculationThread implements Runnable{

    private int begin;
    private int end;
    private int[] array;
    private AtomicInteger sum;

    public AtomicInteger getSum() {
        return sum;
    }

    public void setSum(AtomicInteger sum) {
        this.sum = sum;
    }

    public CalculationThread() {
    }

    public CalculationThread(int begin, int end, int[] array, AtomicInteger sum) {
        this.begin = begin;
        this.end = end;
        this.array = array;
        this.sum = sum;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getBegin() {
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }
    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    private int Calculate(int[] array ,int begin, int end){
        int result = 0;
        for (int i = begin; i < end; i++) {
            result += array[i];
        }
        Thread t = Thread.currentThread();
        System.out.println(t + " : " + result);
        this.sum.addAndGet(result);
        return result;
    }

    @Override
    public void run() {
        Calculate(this.array ,this.begin, this.end);
    }
}
