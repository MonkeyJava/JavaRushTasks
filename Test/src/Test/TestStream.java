package Test;

import java.io.*;

/**
 * Created by Sveta on 14.02.2018.
 */
public class TestStream {
    public static void main(String[] args) throws IOException {
        BufferedInputStream is = new BufferedInputStream(new FileInputStream("C:\\Users\\Sveta\\Desktop\\Data\\Вибр(ОС)ФНЧ1кГц.dat"));
        //OutputStream os = new FileOutputStream();
        //int i = 0;
        int[] a = new int[is.available()];
        while (is.available() > 0){
            int data = is.read();
         //   a[i] = is.read();
           // i++;
            System.out.print(data + " : ");
        }
        for (int n : a) {
            System.out.print(n);
        }
    }
}
