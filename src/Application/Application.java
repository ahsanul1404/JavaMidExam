package Application;
import data.*;
import java.util.Scanner;
/**
 *
 * @author Ahsanul
 */
public class Application {
    public static void main(String[] args) {
        String Nama, Prosesor, Os, Storage;
        int Stok,Core, Ram;
        
//        Scanner
        Scanner masukan = new Scanner(System.in);
       
        Asus ROG = new Asus();
        Hp pavilion = new Hp();
        
//        ROG.getAllLaptopData();
        ROG.AsusSlogan();
//        Untuk test Asus ROG
        System.out.print("Nama : "); Nama = masukan.nextLine();
        System.out.print("Prosesor : "); Prosesor = masukan.nextLine();
        System.out.print("Jumlah Core : "); Core = masukan.nextInt();masukan.nextLine();
        System.out.print("Operating System : "); Os = masukan.nextLine();
        System.out.print("Ukuran RAM(GB): "); Ram = masukan.nextInt();masukan.nextLine();
        System.out.print("Jenis Storage : "); Storage = masukan.nextLine();
        System.out.print("Stok : "); Stok = masukan.nextInt();masukan.nextLine();
        System.out.println("");
        ROG.setNamaLaptop(Nama);
        ROG.setProsesorLaptop(Prosesor);
        ROG.setCoreLaptop(Core);
        ROG.setOsLaptop(Os);
        ROG.setRamLaptop(Ram);
        ROG.setStorageLaptop(Storage);
        ROG.setStokLaptop(Stok);
        ROG.getAllLaptopData();
        System.out.println("Store Position " + ROG.getNamaLaptop() + 
                " adalah " + ROG.getStorePositionLaptop());
        System.out.println("==========================================");
                

//        pavilion.getAllLaptopData();
        pavilion.HpSlogan();
        
//        Untuk test Hp Pavilion
        System.out.print("Nama : "); Nama = masukan.nextLine();
        System.out.print("Prosesor : "); Prosesor = masukan.nextLine();
        System.out.print("Jumlah Core : "); Core = masukan.nextInt();masukan.nextLine();
        System.out.print("Operating System : "); Os = masukan.nextLine();
        System.out.print("Ukuran RAM(GB): "); Ram = masukan.nextInt();masukan.nextLine();
        System.out.print("Jenis Storage : "); Storage = masukan.nextLine();
        System.out.print("Stok : "); Stok = masukan.nextInt();masukan.nextLine();
        System.out.println("");
        pavilion.setNamaLaptop(Nama);
        pavilion.setProsesorLaptop(Prosesor);
        pavilion.setCoreLaptop(Core);
        pavilion.setOsLaptop(Os);
        pavilion.setRamLaptop(Ram);
        pavilion.setStorageLaptop(Storage);
        pavilion.setStokLaptop(Stok);
        pavilion.getAllLaptopData();
        System.out.println("Store Position " + pavilion.getNamaLaptop() + 
                " adalah " + pavilion.getStorePositionLaptop());
        System.out.println("==========================================");       
        
    }
}