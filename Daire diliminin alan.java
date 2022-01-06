
import java .util.Scanner;


public class Main {
    public static void main( String[] args) {

        int r ;
        double pi = 3.14;
        double a ;

        Scanner inp = new Scanner(System.in);

        System.out.println("Daireni çapını giriniz : ");
        r =  inp.nextInt();
        System.out.println("Dairenin merkez açısını giriniz : ");
        a = inp.nextDouble();


        double  diliminAlanı = (pi * (r*r) * a) / 360;


        System.out.println("Dairenin diliminin alanı : " + diliminAlanı);


    }
}