package okulProjesi;

public class Ogretmen {
  private  String ogretmenAdSoyad;
  private  int ogretmenYas;
  private  String ogretmenSicilNo;
  private  String ogretmenBolum;

    public Ogretmen(){

    }
    public Ogretmen(String ogretmenAdSoyad, int ogretmenYas, String ogretmenSicilNo, String ogretmenBolum) {
        setOgretmenAdSoyad(ogretmenAdSoyad);
        setOgretmenYas(ogretmenYas);
        this.ogretmenSicilNo = ogretmenSicilNo;
        this.ogretmenBolum = ogretmenBolum;
    }

    public String getOgretmenAdSoyad() {
        return ogretmenAdSoyad;
    }

    public void setOgretmenAdSoyad(String ogretmenAdSoyad) {
        this.ogretmenAdSoyad = ogretmenAdSoyad.toUpperCase();
    }

    public int getOgretmenYas() {
        return ogretmenYas;
    }

    public void setOgretmenYas(int ogretmenYas) {
        if(ogretmenYas<0){
        this.ogretmenYas=-ogretmenYas;
       }else this.ogretmenYas=ogretmenYas;}

    public String getOgretmenSicilNo() {
        return ogretmenSicilNo;
    }

    public void setOgretmenSicilNo(String ogretmenSicilNo) {
        this.ogretmenSicilNo = ogretmenSicilNo;
    }

    public String getOgretmenBolum() {
        return ogretmenBolum;
    }

    public void setOgretmenBolum(String ogretmenBolum) {
        this.ogretmenBolum = ogretmenBolum;
    }
}
