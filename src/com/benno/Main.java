package com.benno;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

    /*
        NAMA        : BENNO ALIF ANGGARA
        KELAS       : IF1
        NIM         : 10118024
        Deskripsi   : Menampilkan waktu saat ini dalam bahasa Indoenesia
     */


public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        Locale locale = new Locale("id", "ID");

        SimpleDateFormat format = new SimpleDateFormat("EEEE, dd MMM YYY HH:mm:ss", locale);

        System.out.println("Hari ini adalah hari : " + format.format(date));
    }
}
