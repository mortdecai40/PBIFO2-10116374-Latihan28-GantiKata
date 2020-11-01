package pbo2.pkg10116374.latihan28.gantikata;
import java.util.Scanner;
/** @author
 * NAMA                 : TEUKU RIZKI NABIL
 * KELAS                : PBOIF2
 * NIM                  : 10116374
 * Deskripsi Program    : Program untuk melakukan Proses penggantian kata
 *
 */
public class PBO210116374Latihan28GantiKata {

    public static String replace(String kalimat, String ubah, String replace){
       replace = kalimat.replace(ubah, replace);
       return  replace;
    }
    public static void main(String[] args) {
    // TODO code application logic here
     String kalimat, ubah, replace;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("=======Program Mengganti Kata=======");
        
        System.out.println("");
        System.out.print("Masukkan Kalimat : ");
        kalimat = keyboard.nextLine();
        
        System.out.print("Ganti Kata : ");
        ubah = keyboard.next();
        
        System.out.print("Menjadi Kata : ");
        replace = keyboard.next();
        
        System.out.println("");
        System.out.println("=======Hasil Formating=======");
        System.out.println("Kalimat awal : " + kalimat);
        System.out.println("Kalimat baru : " + replace(kalimat, ubah, replace));
    }
    
}
