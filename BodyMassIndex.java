import java.util.Scanner;

public class BodyMassIndex{

    public static void main (String[] Args){
        Scanner input = new Scanner(System.in);
        double boy;
        double kilo;
        System.out.print("Lütfen kilonuzu kilogram cinsinden giriniz: ");
        kilo = input.nextDouble();
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();

        double index = kilo / (boy * boy);
        System.out.println("Vücut kitle indexiniz: " + index);
        input.close();
    }

}

