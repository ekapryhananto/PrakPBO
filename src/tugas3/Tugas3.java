package tugas3;


import java.util.Scanner;
import tugas3.bidang.Lingkaran;
import tugas3.bidang.PersegiPanjang;
import tugas3.ruang.Balok;
import tugas3.ruang.Kerucut;

public class Tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        do {
            int pilih;
            double p, l, t, jari;
            Scanner input = new Scanner(System.in);

            System.out.println("INPUT");
            System.out.println("1. BALOK");
            System.out.println("2. KERUCUT");
            System.out.println("3. EXIT");
            System.out.print("PILIH : ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("PANJANG : ");
                    p = input.nextInt();
                    System.out.print("LEBAR   : ");
                    l = input.nextInt();
                    System.out.print("TINGGI  : ");
                    t = input.nextInt();
                    System.out.println("_________OUTPUT_________");
                    PersegiPanjang persegi = new PersegiPanjang(p, l);
                    Balok balok = new Balok(p, l, t);
                    persegi.luas();
                    persegi.keliling();
                    balok.volume();
                    balok.luas();
                    break;


                case 2:
                    System.out.print("JARI-JARI : ");
                    jari = input.nextInt();
                    System.out.print("TINGGI   : ");
                    t = input.nextInt();
                    System.out.println("_________OUTPUT_________");
                    Lingkaran lingkaran = new Lingkaran(jari);
                    Kerucut kerucut = new Kerucut(jari, t);
                    lingkaran.luas();
                    lingkaran.keliling();
                    kerucut.volume();
                    kerucut.luas();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("YANG ANDA INPUTKAN SALAH");
                    break;
            }
        } while (true);
        
        
        
        
    }
    
}
