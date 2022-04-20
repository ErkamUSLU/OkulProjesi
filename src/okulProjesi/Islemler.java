package okulProjesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {
    static Scanner scanner = new Scanner(System.in);
    static List<Ogrenci> ogrenciListesi = new ArrayList<>();
    static List<Ogretmen> ogretmenListesi = new ArrayList<>();

    public static void anaMenu() {
        System.out.println(
                "\t====================================\n" +
                        "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                        "\t====================================\n" +
                        "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                        "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                        "\t Q- ÇIKIŞ");
        String secim = scanner.next().toUpperCase();
        switch (secim) {
            case "1":
                System.out.println("Ogrenci islemlerine aktarildiniz:");
                altMenu();
                break;
            case "2":
                System.out.println("Ogretmen islemlerine aktarildiniz:");
                altMenu();
                break;
            case "Q":
                System.out.println("Bye...");
                break;
            default:
                if (!secim.equals("Q") || !secim.equals("1") || !secim.equals("2")) {
                    System.out.println("Hatali giris yaptiniz...");
                    anaMenu();
                }
                break;
        }
    }

    public static void altMenu() {
        System.out.println("" +
                "============= İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t 5-ANA MENÜ\n" +
                "\t\t Q-ÇIKIŞ");
        System.out.println("Yapmak istediniz islemi seciniz : ");
        String secim1 = scanner.next();
        switch (secim1) {
            case "1":
                ekleme();
                anaMenu();
                break;
            case "2":
                arama();
                anaMenu();
                break;
            case "3":
                listeleme();
                anaMenu();
                break;
            case "4":
                silme();
                anaMenu();
                break;
            case "5":
                anaMenu();
                break;
            case "Q":
                System.out.println("Bye...");
                break;
            default:
                System.out.println("Hatali giris yaptiniz...");
                altMenu();
                break;
        }
    }

    public static void ekleme() {
        System.out.println("***Ekleme Sayfasi***");
        System.out.println("Ogrenci(1) mi eklencek yoksa Ogretmen(2) mi : ");
        String secim2 = scanner.next();
        if (secim2 == "1") {
            System.out.println("Ad-soyad girriniz : ");
            String adSoyad = scanner.nextLine();
            System.out.println("Kimlik no giriniz : ");
            String kimlikNo = scanner.next();
            System.out.println("Yas giriniz : ");
            int yas = scanner.nextInt();
            System.out.println("Numarasini giriniz : ");
            String ogrenciNo = scanner.next();
            System.out.println("Sinifini giriniz : ");
            String sinif = scanner.next();
            Ogrenci ogrenci1 = new Ogrenci(adSoyad, kimlikNo, yas, ogrenciNo, sinif);
            ogrenciListesi.add(ogrenci1);
        } else if (secim2 == "2") {
            System.out.println("Ad-soyad girriniz : ");
            String adSoyad = scanner.nextLine();
            System.out.println("Yas giriniz : ");
            int yas = scanner.nextInt();
            System.out.println("Sicil numarasini giriniz : ");
            String sicilNo = scanner.next();
            System.out.println("Kimlik numarasini giriniz : ");
            String kimlikNo = scanner.next();
            System.out.println("Bolumunu giriniz : ");
            String bolum = scanner.next();
            Ogretmen ogretmen1 = new Ogretmen(adSoyad, yas, kimlikNo, sicilNo, bolum);
            ogretmenListesi.add(ogretmen1);
        } else {
            System.out.println("Hatali giris yaptiniz...");
        }
    }

    public static void arama() {
        System.out.println("***Arama Sayfasi***");
        System.out.println("Ogrenci(1) mi aranacak yoksa Ogretmen(2) mi : ");
        String secim3 = scanner.next();
        String arananKimlikNo = scanner.next();
        if (secim3 == "1") {
            for (Ogrenci each : ogrenciListesi) {
                if (each.getOgrenciKimlikNo().equalsIgnoreCase(arananKimlikNo)) {
                    System.out.println("Aradiginiz ogrenci " + each.getOgrenciAdSoyad() + "'dir.");
                }
            }
        } else if (secim3 == "2") {
            for (Ogretmen each1 : ogretmenListesi) {
                if (each1.getOgretmenKimlikNo().equalsIgnoreCase(arananKimlikNo)) {
                    System.out.println("Aradiginiz ogretmen " + each1.getOgretmenAdSoyad() + "'dir.");
                }
            }
        } else {
            System.out.println("Hatali giris yaptiniz...");
        }
    }

    public static void listeleme() {
        System.out.println("***Listeleme Sayfasi***");
        System.out.println("Ogrenci(1) mi listelenecek yoksa Ogretmen(2) mi : ");
        String secim4 = scanner.next();
        if (secim4 == "1") {
            System.out.println(ogrenciListesi);
        } else if (secim4 == "2") {
            System.out.println(ogretmenListesi);
        } else {
            System.out.println("Hatali giris yaptiniz...");
        }
    }

    public static void silme() {
        System.out.println("***Silme Sayfasi***");
        System.out.println("Ogrenci(1) mi silinecek yoksa Ogretmen(2) mi : ");
        String secim5 = scanner.next();
        if (secim5 == "1") {
            String silinecekOgrenciKimlikNo = scanner.next();
            System.out.println("Silinecek ogrenci kimlik numarasini giriniz : ");
            for (Ogrenci each2 : ogrenciListesi) {
                if (each2.getOgrenciKimlikNo().equalsIgnoreCase(silinecekOgrenciKimlikNo)) {
                    System.out.println("Silinen ogrenci : " + each2.getOgrenciAdSoyad());
                    ogrenciListesi.remove(each2);
                }
            }
        } else if (secim5 == "2") {
            String silinecekOgretmenKimlikNo = scanner.next();
            System.out.println("Silinecek ogretmen kimlik numarasini giriniz : ");
            for (Ogretmen each3 : ogretmenListesi) {
                if (each3.getOgretmenKimlikNo().equalsIgnoreCase(silinecekOgretmenKimlikNo)) {
                    System.out.println("Silinen ogretmen : " + each3.getOgretmenAdSoyad());
                    ogretmenListesi.remove(each3);
                }
            }
        }
    }

    public static void cikis() {
        System.out.println("Bye...");
    }
}



