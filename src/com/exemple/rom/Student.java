package com.exemple.rom;

public class Student extends Osoba{



    public Student(String name) {

        this.name = name;
    }

    @Override
    public void iAm() {
        System.out.println("jestem Studentem");
    }


}
