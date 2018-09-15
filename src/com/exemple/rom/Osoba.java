package com.exemple.rom;

public abstract class Osoba {

    public String name;

    public String getName(){
        return name;
    }

    public String getClassName(){
        return this.getClass().getName();
    }

    public String getOsobaName(){
        return name;
    }

    public abstract void iAm();
}
