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
public class Bola {
    private double massa;
    private double kecepatan;
    private double energikntk1;
    private double energikntk2;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public double hitungEnergiKinetik1(double m, double k) {
        energikntk1 = 0.5 * m * (k * k);
        return energikntk1;
    }
    
    public void hitungEnergiKinetik2(double m) {
        this.energikntk2 = 0.5 * m * 0;
    }
    
    public double usaha() {
        return energikntk1 - energikntk2;
    
}
}