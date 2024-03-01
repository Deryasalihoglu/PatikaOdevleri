package patikaodevleri;

import java.util.Scanner;

public class Armstrong_numbers {
    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int sameNum= Math.abs(number);
        //I create a copy of the number because I will use it later and it should stay same. 

        // int q = 0;
        // do{
        // number /= 10;
        // q++;
        // }while( number != 0 );
        // System.out.println("basamak sayisi: " + q);
        // int num2 = 2;
        // int remainder =1;
        // int sum = 0;
        // for(int i = 1; i <= q; i++){
        // num2 = number /i;
        // System.out.println("num2: " + num2);
        // remainder = num2 % 10;
        // System.out.println("remainder: " + remainder);
        // sum += remainder;
        // }

        int quotient;
        int remainder;
        int counter = 0;
        // Counter counts digits
        int sum = 0;

        do {
            quotient = sameNum / 10;
            sameNum = quotient;
            counter++;
        } while (quotient > 0);

        sameNum = number;

        for(int i = 0; i < counter; i++){
            remainder = sameNum % 10;
            sum += Math.pow(remainder, counter);
            sameNum = sameNum /10;
        }

        if(sum == number){
            System.out.println("Number " + number + " is an Armstrong Number.");
        }
        else {
            System.out.println("Number " + number + " is not an Armstrong Number.");
        }
    }
}
