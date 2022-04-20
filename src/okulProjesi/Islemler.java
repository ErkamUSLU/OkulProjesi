package okulProjesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {
    static Scanner scanner = new Scanner(System.in);
    List<String> ogrennciListesi=new ArrayList<>();
    List<String> ogretmenListesi=new ArrayList<>();

    public static void anaMenu(){
        System.out.println(
                "\t====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ");
        String secim = scanner.next().toUpperCase();
        switch(secim){
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
                if(!secim.equals("Q")||!secim.equals("1")||!secim.equals("2")){
                    System.out.println("Hatali giris yaptiniz...");
                    anaMenu();
                }
                break;
        }
    }
    public static void altMenu(){
        System.out.println("" +
                "============= İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t 5-ANA MENÜ\n" +
                "\t\t Q-ÇIKIŞ");

    }
}
