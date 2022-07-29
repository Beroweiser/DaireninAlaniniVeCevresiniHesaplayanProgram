import java.util.Scanner;

public class DaireninAlanCevre {
    public static void main(String[] args) {
        double tumalan,tumcevre,pi = 3.14,r,a,alan,cevre;
        Scanner input = new Scanner(System.in);

        System.out.print("Yarı Çapı Giriniz: ");
        r = input.nextInt();

        tumalan = pi * r * r;
        tumcevre = pi * 2 * r;

        System.out.print("Alanını Bulmak istediğiniz açı: ");
        a = input.nextInt();
        
        alan = (tumalan*a)/360;
        cevre = (tumcevre*a)/360;

        System.out.println("Dairenin Toplam alanı: "+ tumalan +"\nDairenin Toplam çevresi: "+ tumcevre +"\nDairenin "+a+"° açılı diliminin alanı:"+ alan +"\nDairenin "+a+"° açılı diliminin çevresi: "+ cevre);

    }
}
