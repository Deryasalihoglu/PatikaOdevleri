package patikaodevleri;

import java.util.Scanner;

public class TaksimetreProgrami {

    public static void main(String Args[]){

    /*Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
    */

    Scanner input = new Scanner(System.in);
    System.out.print("Km giriniz: ");         //kilometreyi kullanıcıdan alıyorum
    double km = input.nextDouble();

    double tutar = 10.0 + km * 2.20;                //10tl açılış fiyatı + her km için 2.2 tl
    System.out.println( km + " kilometre yolun taksi ücreti: " + (tutar <= 20 ? 20 : tutar)); 
    input.close();
    }


}
