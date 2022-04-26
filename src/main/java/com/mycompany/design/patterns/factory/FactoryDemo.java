/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design.patterns.factory;

/**
 *
 * @author channyeintun
 */
class Namer {
//a simple class to take a string apart into two names

    protected String last; //store last name here 
    protected String first; //store first name here

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

}

class FirstFirst extends Namer {

    public FirstFirst(String s) {
        int i = s.lastIndexOf(" ");
        if (i > 0) {
            //split first last //find sep space
            //left is first name
            first = s.substring(0, i).trim();
            //right is last name
            last = s.substring(i + 1).trim();
        } else {
            first = ""; // put all in last name // if no space
            last = s;
        }
    }
}

class LastFirst extends Namer { //split last, first //find comma

    public LastFirst(String s) {
        int i = s.indexOf(","); //find comma
        if (i > 0) {
            //left is last name
            last = s.substring(0, i).trim();
            //right is first name
            first = s.substring(i + 1).trim();
        } else {
            last = s;// put all in last name
            first = "";// if no comma
        }
    }
}

class NameFactory {
//returns an instance of LastFirst or FirstFirst
//depending on whether a comma is found

    public Namer getNamer(String entry) {
        int i = entry.indexOf(","); //comma determines name order
        if (i > 0) {
            return new LastFirst(entry); //return one class else
        }
        return new FirstFirst(entry); //or the other
    }
}

public class FactoryDemo {

    public static void main(String[] args) {
        NameFactory nfactory = new NameFactory();
        Namer namer = nfactory.getNamer("Smith, Will");
        System.out.println(namer.getFirst() + " " + namer.getLast());
    }
}
