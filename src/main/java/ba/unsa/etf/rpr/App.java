package ba.unsa.etf.rpr;


import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App
{
    static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }

        return fact;

    }
    public static void main( String[] args )
    {
        Scanner unos=new Scanner(System.in);
        int n=unos.nextInt();
        double sinus=Math.sin(n);
        double faktorijel=factorial(n);
        System.out.println(sinus + " " + faktorijel);


    }
}
