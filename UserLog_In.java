import java.util.Scanner;

public class UserLog_In {
    public static void main(String[] Args) {

        String userName = "patika";
        String password = "Java101";

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı adınız:");
        String inputUserName = input.nextLine();
        System.out.println("Şifre giriniz");
        String inputPassword = input.nextLine();

        if (userName.equals(inputUserName) && password.equals(inputPassword)) {
            System.out.println("Giriş başarılı.");
        } else if (userName.equals(inputUserName) && !(password.equals(inputPassword))) {
            System.out.println("Yanlış şifre girdiniz, sıfırlamak ister misiniz? (evet / hayır)");
            String yes = "evet";
            String no = "hayır";
            String choice = input.nextLine();
            if (choice.equals(yes)) {
                System.out.println("Yeni şifreyi giriniz: ");
                String newPassword = input.nextLine();
                if(newPassword.equals(password)){
                    System.out.println("yeni şifreniz eskisiyle aynı olamaz.");
                }
                else {
                    password = newPassword;
                    System.out.println("Yeni şifreniz kaydedildi!");
                }
            } else if (choice.equals(no)) {
                // Nothing to do
            } else {
                System.out.println("Geçersiz seçim yaptınız.");
            }
        } else {
            System.out.println("Yanlış bilgi girdiniz.");
        }
        input.close();
    }
}
