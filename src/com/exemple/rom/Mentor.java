package com.exemple.rom;

public class Mentor extends Osoba{



    public Mentor(String name) {

        this.name = name;
    }

    @Override
    public void iAm() {
        System.out.println("jestem mentorem");
    }


}
