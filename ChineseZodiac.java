import java.util.Scanner;

public class ChineseZodiac {

    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birth year:");
        int year = input.nextInt();

        switch (year % 12) {
            case 0:
                System.out.println("Your Chinese zodiac sign is monkey.");
                break;

            case 1:
                System.out.println("Your Chinese zodiac sign is rooster.");
                break;

            case 2:
                System.out.println("Your Chinese zodiac sign is dog.");
                break;

            case 3:
                System.out.println("Your Chinese zodiac sign is pig.");
                break;

            case 4:
                System.out.println("Your Chinese zodiac sign is mouse.");
                break;

            case 5:
                System.out.println("Your Chinese zodiac sign is ox.");
                break;

            case 6:
                System.out.println("Your Chinese zodiac sign is tiger");
                break;

            case 7:
                System.out.println("Your Chinese zodiac sign is rabbit.");
                break;

            case 8:
                System.out.println("Your Chinese zodiac sign is dragon.");
                break;

            case 9:
                System.out.println("Your Chinese zodiac sign is snake.");
                break;

            case 10:
                System.out.println("Your Chinese zodiac sign is horse.");
                break;

            case 11:
                System.out.println("Your Chinese zodiac sign is sheep.");
                break;

            default:
                System.out.println("Invalid number.");
        }
        input.close();
    }
}
