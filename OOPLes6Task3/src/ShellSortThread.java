public class ShellSortThread {
    private int[] array;


    public void sort(int[] arr, int begin, int end) {
        int j = begin;
        int step = end / 2;
        for (;step > 0;){
            for(int i = step; i < end; i++){
                int value = arr[i];
                for (j = i - step; (j >= begin) && (arr[j]) > value; j -= step){
                    arr[j + step] = arr[j];
                }
                arr[j + step] = value;
            }
            step /= 2;
        }
    }

}
