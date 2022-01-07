
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double weight , height , bodymassindex;
        Scanner input = new Scanner(System.in);

        System.out.println("Boyunuzu giriniz :  "  );
        height = input.nextDouble();
        System.out.println("Kilonuzu giriniz :  " );
        weight= input.nextDouble();

        bodymassindex = weight / (height * height);
        System.out.print("VÜCUT KİTLE İNDEKSİ : " + bodymassindex);

    }
}