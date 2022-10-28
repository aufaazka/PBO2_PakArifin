/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pob2;


public class laptop {
    public int kodeLaptop=1;
    public String merkLaptop="Asus";
    public String processor="i5";
    public int tahunKeluar=2022;
    public int harga=500000;
    
    public void tampilLaptop(){
        System.out.println("Kode Laptop= "+kodeLaptop);
        System.out.println("Merk Laptop= "+merkLaptop);
        System.out.println("Prossesor= "+processor);
        System.out.println("Harga= "+harga);
    }
    public static void main(String[] args) {
       laptop asus= new laptop();
       
       asus.tampilLaptop();
    }
   
}
