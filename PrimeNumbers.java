public class PrimeNumbers {
    public static void main(String[] args) {

        System.out.print("2\t"); // 2 is added because it is the only number even and prime at the same time
        for (int i = 3; i < 100; i = i + 2) { // because even numbers are not prime anyway
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + "\t");
            }
        }
    }
}
