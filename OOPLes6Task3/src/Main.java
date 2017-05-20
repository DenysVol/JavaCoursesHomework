import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {10,2,15,6,7,22,1,4,5,0};
        ShellSortThread sst = new ShellSortThread();
        sst.sort(array,0, array.length/4 );
        sst.sort(array,array.length/4, array.length/2);
        sst.sort(array,array.length/2, array.length * 3 / 4);
        sst.sort(array,array.length * 3 / 4, array.length);
        System.out.println(Arrays.toString(array));
    }
}
