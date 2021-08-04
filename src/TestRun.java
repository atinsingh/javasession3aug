import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;

public class TestRun {
    public static void main(String ...args) {
       // System.out.println(str.endsWith("Java"));
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.vendor"));
        System.out.println(System.getProperty("user.name"));
        // %d -- for ints
        //%f --- formatter for floating point numbers
        // %s -- formatter strings

        String formattedString = String.format( "Dear %10s, Your account %,010d is due of $%.2f, please pay", "Vivek", 1234567890, 2123.239932);
        System.out.println(formattedString);

        String st1  = "Hello";
        String st2  = "World";

        String helloWorld =  "Hello$World$Vivek";



        String[] split = helloWorld.split("\\$");

        for (String temp : split) {
            System.out.println(temp);
        }


        //System.out.println(String.join("$",st1,st2));

         String st  = "hello Java class";
        System.out.println(st.substring(6,10));
        String delta  = "So, the Delta variant is a variant of concern that WHO is tracking and monitoring around the world. It's a variant of concern because we know it has increased transmissibility. This has been demonstrated by several countries. And we know that where the Delta variant is identified, it really rapidly takes off and spreads between people more efficiently than even the Alpha variant that was first detected around December, January 2021. As of today, the Delta variant has been reported in 96 countries and we expect that the Delta variant will continue to spread. There are a number of factors that are contributing to increased transmission around the world. The first are these variants of concern, including the Delta variant. The second factor is that we have increased social mixing and increased social mobility, which increases the number of contacts that individuals have. The third factor is the relaxation or the inappropriate use of public health and social measures. Proven public health and social measures that we know prevent infections, reduce the spread of somebody who is infected with the virus to others and save lives. And the fourth factor is the uneven and inequitable distribution of vaccines";
        // count number d in string
        // count how many words with more than 5 chars.
    }
  // Dear XXXX, Your account XXXXXXXX is due of $XX.XX, please pay
   static String[] printNames(String ...names){
       System.out.println("----------------");

       for( String temp : names ){
           System.out.println(temp);
       }


       System.out.println("----------------");
        return names;
   }

}