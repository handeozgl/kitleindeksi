import java.util.Scanner;
import java.math.*;
public class VucutKitleIndeksi {

    public static void main(String[] args) {
        double kilo, boy, vki;
        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen boyunuzu giriniz(metre cinsinden): ");
        boy = input.nextDouble();
        System.out.println("Lutfen kilonuzu giriniz(kilo cinsinden): ");
        kilo= input.nextDouble();
        vki= kilo/ (boy*boy);
        System.out.println("Vucut kitle indeksiniz= " + vki);

    }
}
