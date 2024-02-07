package patikaodevleri;

import java.util.Scanner;

public class FlightTicketPrice {
    public static void main(String[] Args){

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the distance in kilometers:");
        double km = inp.nextDouble();
        System.out.println("Enter the passennger's age:");
        int age = inp.nextInt();
        System.out.println("Select the travel type: (1 -> One-way / 2 -> Round trip)");
        int chosen = inp.nextInt();

        double price = km * 0.10;
        double discount;
        boolean status = true;

        if(age < 0 || km < 0 ){
            System.out.println("You entered invalid data.");
            status = false;
        }
        else if(age < 12){
            discount = price * 0.50;
            price -= discount;
        }
        else if(12 <= age && age <= 24){
            discount = price * 0.10;
            price -= discount;
        }
        else if(age > 65){
            discount = price * 0.30;
            price -= discount;
        }
        if(status){
          switch(chosen){
            case 1:
            System.out.println("Total price: " + price);
            break;

            case 2:
            double secDiscount = price * 0.20;
            price -= secDiscount;
            System.out.println("Total price: " + (2 * price));

            default:
            System.out.println("Please select the travel type correctly: (1 -> One-way / 2 -> Round trip)");
          }
        }
        inp.close();
    }
}
