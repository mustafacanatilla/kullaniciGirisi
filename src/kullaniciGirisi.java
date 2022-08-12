import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {

        String userName, pass, change, newPass;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz:");
        userName = input.nextLine();

        System.out.print("Şifrenizi Giriniz:");
        pass = input.nextLine();

        if (userName.equals("patika") && pass.equals("java123")) {
            System.out.print("Giriş Başarılı.Yönlendiriliyorsunuz.");
        } else {
            System.out.println("Girilen şifre hatalı.");
            System.out.println("Yeni Bir Şifre Oluşturmak İster Misiniz?");
            System.out.println("1-Evet\n2-Hayır");
            System.out.print("Seçimiz:");
            change = input.nextLine();
            if (change.equals("1")) {
                System.out.println("Yeni şifreniz eski şifre ve yanlış girilen şifreden oluşamaz!");
                System.out.print("Yeni Şifrenizi Giriniz: ");
                newPass = input.nextLine();
                if (newPass.equals("pass") == newPass.equals("java123")) {
                    System.out.println("Yeni şifre eski şifre ve yanlış girilen şifreden oluşamaz!");
                    return;
                } else {
                    System.out.println("Yeni Şifre Başarıyla Oluşturuldu!");
                }
            } else {
                System.out.print("Şifre değiştirme işlemi iptal edildi.");
            }

        }
    }


}
