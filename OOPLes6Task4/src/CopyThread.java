import java.io.*;

public class CopyThread implements Runnable{
    private File rootFolder;

    public CopyThread(File rootFolder) {
        this.rootFolder = rootFolder;
    }

    public CopyThread() {
    }

    public File getRootFolder() {
        return rootFolder;
    }

    private void copyFiles(int start, int end, File rootFolder, File dirOut) throws IOException {
        if (rootFolder == null | dirOut == null) {
            throw new IllegalArgumentException("Null file pointer");
        }
        if (!rootFolder.exists()) {
            throw new IllegalArgumentException("Source file doesn't exist");
        }
        if (!rootFolder.isDirectory()) {
            throw new IllegalArgumentException("It's not directory");
        }
        File[] fileArray = this.rootFolder.listFiles();
        File[] fileOutputArray = new File[fileArray.length];
        for (int i = start; i < end; i++) {
            try (FileInputStream fis = new FileInputStream(fileArray[i]); FileOutputStream fos = new FileOutputStream(dirOut)) {

            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }

    @Override
    public void run() {

    }
}
