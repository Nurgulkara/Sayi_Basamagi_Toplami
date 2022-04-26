import java.util.Scanner;

public class Sayi_Basamagi {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        int a , basamakSayisi = 0, numberCounter = 0;

        // Basamak Sayısı Bulma İşlemi
        // 2451 / 10 = 245
        // 245 / 10 = 24
        // 24 / 10 = 2
        // 2 / 10 = 0
        // 0 / 10 = 0
        System.out.print("Bir sayi giriniz: ");
        a=inp.nextInt();

        while (a != 0) {
           basamakSayisi += a%10 ;
            a /= 10;
            ++numberCounter;
        }
        System.out.println(basamakSayisi);
    }
}
