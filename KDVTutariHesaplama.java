package patikaodevleri;

import java.util.Scanner;

public class KDVTutariHesaplama {

    public static void main (String[] Args){
        
        double fiyat;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ürünün fiyatını giriniz: ");
        
        fiyat = input.nextDouble();

        // Fiyat 1000 tl'den "fazla" ise KDV tutarı %8 hesaplanacak.
        double fazlaKDV = fiyat*0.08;
        double fazla = fiyat + fazlaKDV;

        // Fiyat 1000 tl'den "az" ise KDV tutarı %18 hesaplanacak.
        double azKDV = fiyat*0.18;
        double az = fiyat + azKDV;
        
        System.out.println("KDV'siz tutar: " + fiyat);
        double sonuc = (0 < fiyat && fiyat <= 1000) ? az : fazla ;
        System.out.println("KDV'li fiyat: " + sonuc);
        double kdvTutari = (0 < fiyat && fiyat <= 1000) ? azKDV : fazlaKDV ;
        System.out.println("ürünün KDV tutarı:" + kdvTutari);

        input.close();

    }
}