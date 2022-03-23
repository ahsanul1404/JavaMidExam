package data;
/**
 *
 * @author Ahsanul
 */
public class Laptop {
    private String Nama, Brand, Prosesor, Os, Storage;
    private int Stok, Core, Ram;
    
    public Laptop(String Nama, String Brand, String Prosesor, int Core, 
            String Os, int Ram, String Storage, int Stok){
        
        this.Nama = Nama;
        this.Brand = Brand;
        this.Prosesor = Prosesor;
        this.Core = Core;
        this.Os = Os;
        this.Ram = Ram;
        this.Storage = Storage;
        this.Stok = Stok;
    }

//    Overloading Constructor
    public Laptop(){
        this.Nama = "unidentified"; // Nama Laptop
        this.Brand = "unidentified"; // Merk Laptop
        this.Prosesor = "unidentified"; // Prosessor pada Laptop
        this.Core = 0; // Jumlah Core pada Laptop
        this.Os = "unidentified"; // OS laptop
        this.Ram = 0; // Jumlah Ram(GB) Laptop
        this.Storage = "unidentified"; // Jenis Storage Laptop
        this.Stok = 0; // Stok Laptop Tersedia
    }
    
//    Nama Laptop
    public String getNamaLaptop(){
        return Nama;
    }
    
    public void setNamaLaptop(String text){
        Nama = text;
    }
    
//    Brand Laptop
    public String getBrandLaptop(){
        return Brand;
    }
    
    public void setBrandLaptop(String text){
        Brand = text;
    }
    
//    Nama Prosesor
    public String getProsesorLaptop(){
        return Prosesor;
    }
    
    public void setProsesorLaptop(String text){
        Prosesor = text;
    }
    
//      Jumlah Core  
    public int getCoreLaptop(){
        return Core;
    }
    
    public void setCoreLaptop(int angka){
        Core = angka;
    }
    
//    OS
    public String getOsLaptop(){
        return Os;
    }
    
    public void setOsLaptop(String text){
        Os = text;
    }
    
//    Jumlah Ram
    public int getRamLaptop(){
        return Ram;
    }
    
    public void setRamLaptop(int angka){
        Ram = angka;
    }
    
//    Storage
    public String getStorageLaptop(){
        return Storage;
    }
    
    public void setStorageLaptop(String text){
        Storage = text;
    }
    
//    Stok
    public int getStokLaptop(){
        return Stok;
    }
    
    public void setStokLaptop(int angka){
        Stok = angka;
    }
    
    public void getAllLaptopData(){
        System.out.println("Nama : "+ Nama);
        System.out.println("Brand : "+ Brand);
        System.out.println("Prosesor : "+ Prosesor);
        System.out.println("Jumlah Core : "+ Core);
        System.out.println("Operating System : "+ Os);
        System.out.println("Ukuran RAM(GB) : "+ Ram);
        System.out.println("Jenis Storage : "+ Storage);
        System.out.println("Stok Tersedia : "+ Stok);
    }
}