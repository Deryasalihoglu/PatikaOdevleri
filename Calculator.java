import java.util.Scanner;

public class Calculator {
    
    public static void main (String[] Args){

        Scanner input = new Scanner(System.in);
        double number1, number2;
        int choice ;

        System.out.println("Lütfen işlem yapmak istediğiniz sayıları giriniz");
        number1 = input.nextDouble();
        number2 = input.nextDouble();
        System.out.println("Hangi işlemi yapmak istiyorsunuz? \nToplama ise 1 \nÇıkarma ise 2" 
        + " \nÇarpma ise 3 \nBölme ise 4'ü tuşlayınız.");
        choice = input.nextInt();

        switch(choice){
            case 1: System.out.println("sonuç =" + (number1 + number2));
            break;
            case 2: System.out.println("sonuç =" + (number1 - number2));
            break;
            case 3: System.out.println("sonuç =" + (number1 * number2));
            break;
            case 4: System.out.println("sonuç =" + (number1 / number2));
            break;
            default: System.out.println("Hatalı seçim yaptınız. Tekrar deneyin.");            
        }
        input.close();
    }
}
