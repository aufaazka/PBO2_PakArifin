package laptop;
public class Laptop {
    int kodePegawai= 12345;
    String merkLaptop= "HP";
    String jenisProcessor= "Intel";
    int tahunKeluar= 2020;
    int harga= 17000000;
    
    void spesifikasiLaptop(){
        System.out.println("Kode Pegawai: "+ kodePegawai);
        System.out.println("Merk Laptop: " + merkLaptop);
        System.out.println("Jenis Processor: " + jenisProcessor);
        System.out.println("Tahun Keluar: "+ tahunKeluar);
        System.out.println("Harga: "+ harga);
        
    }
    public static void main(String[] args) {
        Laptop laptop=new Laptop();
        laptop.spesifikasiLaptop();
    }
    
}
