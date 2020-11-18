/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan UMUR BARANG ANTIK
 */
package pboif2.pkg10119059.latihan56.umurbarangantik;
/**
 *
 * @author Corazon
 */
public class PBOIF210119059Latihan56UmurBarangAntik {

    public static void main(String[] args) {
        Radio radio = new Radio(234);
        radio.setName("Radio AM");
        
        System.out.println("Nama Barang Antik : " + radio.getName());
        radio.tampilUmur();
        
    }
    
}
