package com.exemple.rom;

import java.util.Iterator;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        System.out.println("Hallo people\n");
        MakeList makeList = new MakeList("src/com/exemple/rom/list.txt");

        List<Osoba> listaOsob =  makeList.getListOfPeople();
        Iterator iterPoLiscie = makeList.getIteratorOverOsoba();

//        int mentorCounter = 0;
//        int studentCounter = 0;
//        while( iterPoLiscie.hasNext() ) {
//            Osoba osoba = (Osoba) iterPoLiscie.next();
//            if ( osoba.getClass().getName().equals("com.exemple.rom.Mentor")) {
//                System.out.println(osoba.getName());
//                mentorCounter++;
//            }
//            System.out.println();
//            if ( osoba.getClass().getName().equals("com.exemple.rom.Student")) {
//                System.out.println(osoba.getName());
//                studentCounter++;
//            }
//        }
//        System.out.println( " numbers of mentor : "+mentorCounter );
//        System.out.println( " numbers of student : "+studentCounter );

        makeList.makeListOfMentors();

//        for ( Osoba mentor : makeList.getListOfMentor()){
//            System.out.println(mentor.getName());
//            mentor.iAm();
//        }

        for ( Osoba osoba : listaOsob){
            System.out.print( osoba.getOsobaName()+" : " );
            osoba.iAm();
            System.out.println();
        }


    }




}



