/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulg.pkg10115557.latihan49.biayaemaskawin;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author RyanJuan
 * NAMA              : RAYAN
 * KELAS             : PBOULG
 * NIM               : 10115557
 * Deskripsi Program : Menampilkan Program biaya emas kawin
 */
public class PBOULG10115557Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    DecimalFormat mataUangIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRP = new DecimalFormatSymbols();

        formatRP.setCurrencySymbol("Rp.");
        formatRP.setMonetaryDecimalSeparator(',');
        formatRP.setGroupingSeparator('.');

        mataUangIndonesia.setDecimalFormatSymbols(formatRP);

        EmasKawin objEmas = new EmasKawin();
        objEmas.setHargaGram(570000);
        objEmas.setBeratEmas(15.7);
        System.out.println("====Aplikasi Hitung Harga Emas====");
        System.out.printf("Total Bayar Emas : %s %n ",
                mataUangIndonesia.format(
                        objEmas.perhitungan(objEmas.getHargaGram(),
                                objEmas.getBeratEmas())));
    }
    
}
