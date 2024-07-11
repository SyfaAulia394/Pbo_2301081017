/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_8Juni2024;

/**
 *
 * @author AULIA SYFA
 */
public class Buku {
    private String KodeBuku;
    private String Judul;
    private String Pengarang;
    private String Penerbit;
    private String TahunTerbit;

    public Buku(String KodeBuku, String Judul, String Pengarang, String Penerbit, String Tahun_Terbit) {
        this.KodeBuku = KodeBuku;
        this.Judul = Judul;
        this.Pengarang = Pengarang;
        this.Penerbit = Penerbit;
        this.TahunTerbit = Tahun_Terbit;
        
    }

    public String getKodeBuku() {
        return KodeBuku;
    }

    public void setKodeBuku(String KodeBuku) {
        this.KodeBuku = KodeBuku;
    }

    public String getJudul() {
        return Judul;
    }

    public void setJudul(String Judul) {
        this.Judul = Judul;
    }

    public String getPengarang() {
        return Pengarang;
    }

    public void setPengarang(String Pengarang) {
        this.Pengarang = Pengarang;
    }

    public String getPenerbit() {
        return Penerbit;
    }

    public void setPenerbit(String Penerbit) {
        this.Penerbit = Penerbit;
    }

    public String getTahunTerbit() {
        return TahunTerbit;
    }

    public void setTahunTerbit(String TahunTerbit) {
        this.TahunTerbit = TahunTerbit;
    }

    

 
    

}
