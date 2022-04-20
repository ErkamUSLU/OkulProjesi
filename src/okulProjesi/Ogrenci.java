package okulProjesi;

public class Ogrenci {
   private String ogrenciAdSoyad;
   private String ogrenciKimlikNo;
   private int ogrenciYas;
   private String ogrenciNumara;
   private String ogrenciSinif;

    public Ogrenci(){

    }
    public Ogrenci(String ogrenciAdSoyad, String ogrenciKimlikNo, int ogrenciYas, String ogrenciNumara, String ogrenciSinif) {
        this.ogrenciAdSoyad = ogrenciAdSoyad;
        this.ogrenciKimlikNo = ogrenciKimlikNo;
        setOgrenciYas(ogrenciYas);
        this.ogrenciNumara = ogrenciNumara;
        this.ogrenciSinif = ogrenciSinif;
    }

    public String getOgrenciAdSoyad() {
        return ogrenciAdSoyad;
    }

    public void setOgrenciAdSoyad(String ogrenciAdSoyad) {
        this.ogrenciAdSoyad = ogrenciAdSoyad.toUpperCase();
    }

    public String getOgrenciKimlikNo() {
        return ogrenciKimlikNo;
    }

    public void setOgrenciKimlikNo(String ogrenciKimlikNo) {
        this.ogrenciKimlikNo = ogrenciKimlikNo;
    }

    public int getOgrenciYas() {
        return ogrenciYas;
    }

    public void setOgrenciYas(int ogrenciYas) {
        if (ogrenciYas<0){
         this.ogrenciYas =-ogrenciYas;
        }else
        this.ogrenciYas = ogrenciYas;
    }

    public String getOgrenciNumara() {
        return ogrenciNumara;
    }

    public void setOgrenciNumara(String ogrenciNumara) {
        this.ogrenciNumara = ogrenciNumara;
    }

    public String getOgrenciSinif() {
        return ogrenciSinif;
    }

    public void setOgrenciSinif(String ogrenciSinif) {
        this.ogrenciSinif = ogrenciSinif;
    }
}
