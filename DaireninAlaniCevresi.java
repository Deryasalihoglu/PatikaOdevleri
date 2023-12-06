package patikaodevleri;

import java.util.Scanner;

public class DaireninAlaniCevresi {

    public static void main(String[] Args){

        /* Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
           𝜋 sayısını = 3.14 alınız.
           Formül : (𝜋 * (r*r) * 𝛼) / 360
        */

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        double r = input.nextDouble();
        System.out.print("Daire diliminin açısını giriniz: ");
        double angle = input.nextDouble();

        double pi = 3.14;
        double alan = (pi * r * r * angle ) / 360;
        System.out.println("Yarıçapı " + r + " olan dairenin " + angle + " açılı diliminin alanı " + alan +"'dır.");
        input.close();
        

    }
    
}
