package com.example.myapplication;

import java.util.Date;

public class Notatka {
    public String tytulNotatki;
    public String trescNotatki;


    public Notatka(String tytulNotatki, String trescNotatki) {
        this.tytulNotatki = tytulNotatki;
        this.trescNotatki = trescNotatki;


    }

    @Override
    public String toString() {
        return
                "tytulNotatki :'" + tytulNotatki  +
                ", trescNotatki :'" + trescNotatki + '\''
                ;
    }
}
