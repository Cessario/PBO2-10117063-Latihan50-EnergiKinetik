/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan50.energikinetik;

/*
    Nama : Cessario Shevs Lakita Purwa Adidjaya
    Kelas : IF-2
    Nim : 10117063
    Definisi Program : Energi Kinetik
 */
public class PBO210117063Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bola bol = new Bola();
        bol.setMassa(145);
        bol.setKecepatan(25);
        System.out.println("1 buah baseball dengan massa = " + bol.getMassa() + " g");
        System.out.println("baseball dilempar dengan kecepatan = " + bol.getKecepatan() + " m/s");
        
        double massa = bol.getMassa();
        double kecepatan = bol.getKecepatan();
        
        System.out.println("A. Energi Kinetik = " + bol.hitungEnergiKinetik1(massa, kecepatan));
        System.out.println("B. Usaha pada bola = " + bol.usaha());
        System.out.println("Catatan : Nilai usaha tetap, karena dimulai dari keadaan diam");
    }
    
}
