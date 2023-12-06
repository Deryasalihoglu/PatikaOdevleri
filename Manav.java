package patikaodevleri;

import java.util.Scanner;

public class Manav {

    public static void main(String[] Args){
        /*Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
        Meyveler ve KG Fiyatları
        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL 
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç kilo armut aldınız?");
        double armut = input.nextDouble();
        System.out.println("Kaç kilo elma aldınız?");
        double elma = input.nextDouble();
        System.out.println("Kaç kilo domates aldınız?");
        double domates = input.nextDouble();
        System.out.println("Kaç kilo muz aldınız?");
        double muz = input.nextDouble();
        System.out.println("Kaç kilo patlıcan aldınız?");
        double patlican = input.nextDouble();

        double total = armut *2.14 + elma * 3.67 + domates * 1.11 + muz * 0.95 + patlican * 5.00;  
        System.out.println("Toplam tutar: " + total + "TL");        


        }
    
}
