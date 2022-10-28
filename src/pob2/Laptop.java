/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Laptop {
  public int kodeLaptop=1;
    public String merkLaptop="Lenovo";
    public String processor="r7";
    public int tahunKeluar=2022;
    public int harga=500000;
    
    public void tampilLaptop(){
        System.out.println("Kode Laptop= "+kodeLaptop);
        System.out.println("Merk Laptop= "+merkLaptop);
        System.out.println("Prossesor= "+processor);
        System.out.println("Harga= "+harga);
    }
    public static void main(String[] args) {
       Laptop asus= new Laptop();
       
       asus.tampilLaptop();
}
}
