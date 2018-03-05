package Pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Created by Sveta on 05.03.2018.
 */
public class Facktorial {

        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int input = Integer.parseInt(reader.readLine());
            reader.close();

            System.out.println(factorial(input));
        }

       /* public static String factorial(int n) {
            //add your code here
            int res = 1;
            if(n < 0) return "0";
            for ( int i = 1; i <= n; i++) {
                res = res * i;
            }

            return res + "";
        }*/
        public static String factorial(int n) {
            BigInteger res = BigInteger.ONE;
            if (n < 0) return "0";
            for (int i = 1; i <= n ; i++) {
                res = res.multiply(BigInteger.valueOf(i));
            }
            return res + "";
        }


}
