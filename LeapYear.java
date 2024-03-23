import java.util.Scanner;

public class LeapYear {

    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();

        if(year % 4 == 0){  //leap years are divisible by 4
            if(year % 100 == 0){    //if year is multiple of 100
                if( year % 400 == 0){   //it must be divisible by 400 to be leap year
                    System.out.println(year + " is a leap year.");
                }
                else{   //if it is not divisible by 400 it is not a leap year although it is multiple of 4.
                    System.out.println(year + " is not a leap year.");
                }
            }
            else{   //A year which is multiple of 4 but not divisible by 100 is leap year.
                System.out.println(year + " is a leap year.");
            }
        }
        else{
            System.out.println(year + " is not a leap year.");
        }

        input.close();
    }
    
}