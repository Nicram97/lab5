package com.example.lab5;

import java.io.Serializable;

public class Animal implements Serializable {
    public int getId() {
        return id;
    }

    public String getGatunek() {
        return gatunek;
    }

    public String getKolor() {
        return kolor;
    }

    public String getOpis() {
        return opis;
    }

    public float getWielkosc() {
        return wielkosc;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    private String gatunek;
    private String kolor;
    private String opis;
    private float wielkosc;

    public Animal() {}

    public Animal(String gatunek, String kolor, float wielkosc, String opis) {
        super();
        this.gatunek = gatunek;
        this.kolor = kolor;
        this.wielkosc = wielkosc;
        this.opis = opis;
    }

    @Override
    public String toString() {
        return "Zwierze: [id=" + id + ", gatunek=" + gatunek + ", kolor" + kolor + " wielkosc=" + wielkosc +" ]";
    }
    //Metoda zwracajaca opis zwierzecia
}
