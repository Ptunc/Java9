package Java9;

import java.util.Scanner;

public class java9 {
    public static void main(String[] args) {
        
        int sifre, kars, a;
        String kontrol;

        Scanner input = new Scanner(System.in);
        
        System.out.print("sifreyi girin: ");
        sifre = input.nextInt();
        kars = sifre;
        System.out.print("sifre sıfırlamak istiyor musunuz? (1/0): ");
        a = input.nextInt();
        
        if(a==1){
            System.out.print("yeni sifreyi girin: ");
            sifre = input.nextInt();
            kontrol = kars == sifre ? "Şifre oluşturulamadı. lütfen tekrar girin." : "sifre oluşturuldu.";
            System.out.println(kontrol);
        }
            else{
            System.out.println("Tamamdır.");
            }
            input.close();
    }
}
