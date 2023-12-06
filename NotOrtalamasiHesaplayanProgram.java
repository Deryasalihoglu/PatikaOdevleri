package patikaodevleri;

import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram{
    public static void main(String[] Args){

        int turkce, matematik, fizik, kimya,tarih, muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Türkçe notunuzu giriniz:");
        turkce = input.nextInt();

        System.out.print("Matematik notunuzu giriniz:");
        matematik = input.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        kimya = input.nextInt();

        System.out.print("Tarih notunuzu giriniz:");
        tarih = input.nextInt();

        System.out.print("Müzik notunuzu giriniz:");
        muzik = input.nextInt();

        double ortalama = (double)(turkce + matematik + fizik + kimya + tarih + muzik) / 6;
        System.out.println("Ortalamanız:" + ortalama);
         
        String sonuc = (ortalama >= 60) ? "Geçtiniz" : "Kaldınız";
        System.out.println(sonuc);

        input.close();
    }
}