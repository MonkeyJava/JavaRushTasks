package Pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sveta on 04.03.2018.
 */
                                            //http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo//
    public class Solution {
        public static void main(String[] args) throws IOException {
            //add your code here
           // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           // String str = reader.readLine();

          //  int n = str.indexOf('&');
           // System.out.println(n);
            String URL=new BufferedReader(new InputStreamReader(System.in)).readLine().replaceAll("^(.*?\\?)","");
            for(String s:URL.split("&"))System.out.print(s.replaceAll("=.*$","")+" ");
            System.out.println();
            for(String s:URL.split("&")){
                if(s.replaceAll("=.*$","").equals("obj")){
                    try{
                        alert(Double.parseDouble(s=s.replaceAll("^[^=]*=","")));
                    }catch(NumberFormatException e){
                        alert(s);
                    }
                }
            }
        }

        public static void alert(double value) {
            System.out.println("double " + value);
        }

        public static void alert(String value) {
            System.out.println("String " + value);
        }
    }

