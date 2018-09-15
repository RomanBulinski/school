package com.exemple.rom;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MakeList {

    private static String DYR = "dyrektor";
    private static String MENT = "mentor";
    private static String KSIE = "ksiegowa";
    private static String STUD = "student";
    private Dyrektor dyro;
    private Mentor mentor;
    private Ksiegowa ksiegowa;
    private Student student;

    private List<Osoba> listOfPeople;
    private List<Osoba> listOfMentor = new ArrayList<Osoba>();

    public MakeList(String string){
        listOfPeople = new ArrayList<Osoba>();
        makeList( string );
    }

    public void makeList( String string ){
        try {
            Scanner scaner = new Scanner(new File(string));

            while (scaner.hasNextLine()) {
                String line = scaner.nextLine();
                String[] info = line.split(" ");

                if( info[1].equals(DYR) ){
                    dyro = new Dyrektor(info[0] );
                    listOfPeople.add(dyro);
                }
                if( info[1].equals(MENT) ){
                    mentor = new Mentor(info[0] );
                    listOfPeople.add(mentor);
                }
                if( info[1].equals(KSIE) ){
                    ksiegowa = new Ksiegowa(info[0] );
                    listOfPeople.add(ksiegowa);
                }
                if( info[1].equals(STUD) ){
                    student = new Student(info[0] );
                    listOfPeople.add(student);
                }
            }
            scaner.close();
        }catch( FileNotFoundException e  )  {
            e.printStackTrace();
        }
    }

    public List<Osoba> getListOfPeople(){
        return listOfPeople;
    }


    public Iterator<Osoba> getIteratorOverOsoba(){
        return new IteratorPoOsobach();
    }

    private class IteratorPoOsobach implements Iterator{
        int index = 0;
        @Override
        public boolean hasNext() {
            if(index < listOfPeople.size()){
                return true;
            }
            return false;
        }
        @Override
        public Osoba next() {
            if(this.hasNext()){
                return listOfPeople.get(index++);
            }
            return null;
        }
    }


    public void makeListOfMentors(){
        IteratorPoOsobach iteratorPoOsobach = new IteratorPoOsobach();
        while(iteratorPoOsobach.hasNext()){
            Osoba osoba = iteratorPoOsobach.next();
            if( osoba.getClass().getName().equals("com.exemple.rom.Mentor") ){
                listOfMentor.add (osoba);
            }
        }
    }

    public List<Osoba> getListOfMentor(){
        return listOfMentor;
    }






}




