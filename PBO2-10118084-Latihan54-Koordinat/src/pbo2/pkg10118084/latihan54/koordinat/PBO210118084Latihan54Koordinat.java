/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan54.koordinat;

/**
 *
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk menampilkan Koordinat

 */
public class PBO210118084Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKoordinat warnakoordinat = new WarnaKoordinat("Jingga",10,4);
        System.out.println("Warna Koordinat : "+warnakoordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x :"+warnakoordinat.getX()+", y : "+warnakoordinat.getY());
    }   
    
}
