package patikaodevleri;

import java.util.Scanner;

class HipotenusBulanProgram {

    public static void main(String[] Args){

        //Uzunlukları a,b ve c(hipotenüs) olan üçgenin hipotenüsü a^2 + b^2 = C^2 formülünden hesaplanır.
        int a ,b;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Üçgenin ilk kenarını giriniz: ");
        a = input.nextInt();
        System.out.print("İkinci kenarı da giriniz: ");
        b = input.nextInt();

        double c = Math.pow(Math.pow(a, 2) + Math.pow(b,2),0.5);
        System.out.print("Bu üçgenin hipotenüsü " + c +"'tir.");

        input.close();
    }
}