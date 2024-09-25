import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How namy numbers would you like to see in this Fibonacci sequence?");
        int lengthOfSequence = sc.nextInt();
        sc.close();

        int a = 0 , b = 1 , next = 0;       //First two number a,b and the 'next' for the next index.
        for(int i = 0; i < lengthOfSequence; i++){
            System.out.print(a + "\t");
            next = a + b;       //Before a and b is changed, next number calculated
            a = b;              //a is now b, and b is the new number which we just calculated. 
            b = next;           //Means, we store last 2 numbers to get next number
        }
    }
}