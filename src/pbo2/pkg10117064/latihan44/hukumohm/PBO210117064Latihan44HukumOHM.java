/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117064.latihan44.hukumohm;

/**
 *
 * @author WAHID HERLAMBANG
 * NAMA     : Wahid Herlambang Suroso
 * KELAS    : PBO2
 * NIM      : 10117064
 * Deskripsi Program : Program ini berisi program untuk menghitung 
 * hasil tegangan dari hukum OHM.
 */
public class PBO210117064Latihan44HukumOHM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai batt1 = new Baterai(3,12);
        Baterai batt2 = new Baterai();

        System.out.println("\nKuat Arus : "+batt1.getKuatArus()+" ampere");
        System.out.println("Hambatan : "+batt1.getHambatan()+" ohm");
        System.out.println("Hasil Tegangan : "+batt1.hitungTegangan()+" volt");
    }
    
}
