/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomy
 */
public class KonversiNumber {
    public static void main(String[] args) {
        // Konversi Tipe Data Number

        // Widening Casting (Otomatis): byte->short->int->long->float->double
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        
        // Narrowing Casting (Manual): double->float->long->int->char->short->byte     
        int iniInt2 = 100;
        byte iniByte2 = (byte) iniInt2;
        
    }
}
