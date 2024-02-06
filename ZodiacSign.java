package patikaodevleri;

import java.util.Scanner;

public class ZodiacSign {

  public static void main(String[] Args){
    Scanner input = new Scanner(System.in);

    System.out.println("What is your birth month?");
    String month = input.nextLine().toLowerCase();

    System.out.println("Enter the day:");
    int day = input.nextInt();

    String sign = "";
    boolean control = true;

    if(day <= 0 || day > 31){
        System.out.println("You entered an invalid date.");
        control = false;
    }

    switch(month){

        case "january" :
          if(0 < day && day < 22){
            sign = "Capricorn";
          }
          else if(22 <= day && day <= 31){
            sign = "Aquarius";
          }
          break;

        case "february" :
          if(0 < day && day <20){
            sign = "Aquarius";
          } 
          else if(20 <= day && day <= 29){
            sign = "Pisces";
          }
          break;

        case "march" :
          if(0 < day && day < 21){
            sign = "Pisces";
          }
          else if(21 <= day && day <= 31){
            sign = "Aries";
          }
          break;

        case "april" :
          if(0 < day && day < 21){
            sign = "Aries";
          }
          else if(21 <= day && day <= 30){
            sign = "Taurus";
          }
          break;

          case "may" :
          if(0 < day && day < 21){
            sign = "Taurus";
          }
          else if(21 <= day && day <= 31){
            sign = "Gemini";
          }
          break;

          case "june" :
          if(0 < day && day < 21){
            sign = "Gemini";
          }
          else if(21 <= day && day <= 31){
            sign = "Cancer";
          }
          break;

          case "july" :
          if(0 < day && day < 21){
            sign = "Cancer";
          }
          else if(21 <= day && day <= 31){
            sign = "Leo";
          }
          break;

          case "August" :
          if(0 < day && day < 21){
            sign = "Leo";
          }
          else if(21 <= day && day <= 31){
            sign = "Virgo";
          }
          break;

          case "September" :
          if(0 < day && day < 21){
            sign = "Virgo";
          }
          else if(21 <= day && day <= 31){
            sign = "Libra";
          }
          break;

          case "October" :
          if(0 < day && day < 21){
            sign = "Libra";
          }
          else if(21 <= day && day <= 31){
            sign = "Sagittarius";
          }
          break;

          case "November" :
          if(0 < day && day < 21){
            sign = "Sagittarius";
          }
          else if(21 <= day && day <= 31){
            sign = "Capricorn";
          }
          break;

          default:
          System.out.println("You entered an invalid date. Write the month's name accurately.");
          control = false;
    }
    if(control){
        System.out.println("Your Zodiac Sign is " + sign);
    }
    input.close();
  }
}
