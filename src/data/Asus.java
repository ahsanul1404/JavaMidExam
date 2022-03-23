package data;
/**
 *
 * @author Ahsanul
 */
    public class Asus extends Laptop {
    public Asus(String Nama, String Prosesor, int Core, 
            String Os, int Ram, String Storage, int Stok){
            
            super(Nama,"Asus",Prosesor,Core,Os,Ram,Storage,Stok);     
    }
    
    public Asus(){
        super();
        super.setBrandLaptop("Asus");
    }
    
    public void AsusSlogan(){
        System.out.println("");
        System.out.println("=======================");
        System.out.println("Asus");
        System.out.println("Be Unstoppable");
        System.out.println("=======================");   
    }
    
    @Override
    public void getAllLaptopData(){
        AsusSlogan();
        super.getAllLaptopData();
        System.out.println("");
    }
    
    @Override
    public void setRamLaptop(int angka){
        if(angka < 0){
            System.out.println("");
            System.out.println("Ukuran RAM tidak dapat lebih kecil dari nol!");
            System.out.println("Ukuran RAM diatur ke default (4 GB)");
            System.out.println("");
            super.setRamLaptop(4);
             } else {
            super.setRamLaptop(angka);
        }
    }
    
    @Override
    public void setCoreLaptop(int angka){
        if(angka < 0){
            System.out.println("");
            System.out.println("Jumlah Core tidak dapat lebih kecil dari nol!");
            System.out.println("Jumlah Core diatur ke default (Dual-Core)");
            System.out.println("");
            super.setCoreLaptop(2);
            } else {
            super.setCoreLaptop(angka);
        }
    }
    
    @Override
    public void setStokLaptop(int angka){
        if(angka < 0){
            System.out.println("");
            System.out.println("Jumlah Stok Laptop tidak dapat lebih kecil dari nol!");
            System.out.println("Jumlah Stok diatur ke default (0 pcs)");
            System.out.println("");
            super.setStokLaptop(0);
        }
    }
    
//    Posisi Pada Etalase Toko
    public String getStorePositionLaptop(){
        String storage = super.getStorageLaptop().toLowerCase().replaceAll("\\s+","");
        switch(storage) {
            case "ssdm.2" -> {
                return "Best";
            }
            case "ssdsata" -> {
                return "Good";
            }
            case "hdd" -> {
                return "Middle";
            }
            default -> {
                    return "unidentified";
            }
        }
    }
}