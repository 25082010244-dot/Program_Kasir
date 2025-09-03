import java.util.Scanner;
public class tugas {

    public static void main(String[] args) {
        int hargaberas, kg, hargaawal;
        double diskon, totalharga, uang, kembalian;

        Scanner input = new Scanner(System.in);

        
        System.out.println("Kasir Belanja");
        hargaberas = 25000;
        System.out.print("Total Beras (kg) = ");
        kg = input.nextInt();
        hargaawal = hargaberas * kg;
        System.out.println("Harga Awal = "+hargaawal);
        System.out.print("Masukkan Diskon (%) = ");
        diskon = input.nextDouble();
        totalharga =hargaawal * (1 - diskon/100.00);
        System.out.println("Harga Diskon = "+totalharga);
        System.out.print("Uang diterima = ");
        uang = input.nextInt();
        kembalian = uang - totalharga;
        System.out.println("Uang kembalian = "+kembalian);

        input.close();
    }
}