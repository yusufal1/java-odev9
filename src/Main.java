import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password, currentUserName = "patika", currentPassword = "java123", newPassword;
        int select;

        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();

        if(userName.equals(currentUserName) && password.equals(currentPassword)){
            System.out.println("Giriş başarılı.");
        } else {
            System.out.println("Giriş bilgileri yanlış. Şifreyi sıfırlamak için 1'e basınız.");
            select = input.nextInt();
            input.nextLine();
            if(select == 1) {
                System.out.print("Yeni şifre: ");
                newPassword = input.nextLine();
                if(newPassword.equals(currentPassword)) {
                    System.out.println("Yeni şifreniz eskisiyle aynı olamaz.");
                } else {
                    System.out.println("Şifre değiştirildi.");
                }
            }
        }
    }
}
