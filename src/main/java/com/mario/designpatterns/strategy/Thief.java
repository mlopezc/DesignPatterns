/*
 *
 * File:	Thief.java
 */
package com.mario.designpatterns.strategy;

/**
 * Implementation of class <code>Thief</code>.
 *
 * @author <a href="mailto:mariolopezcampos@gmail.com">Mario Lopez</a>
 * @version 1.0, 11/10/2015
 */
public class Thief extends Person {

    Thief(int age, String name) {
        super(age, name);
        restrictionPolicy = new DoNotEnterPolicy();
    }


    /* --- Implementation methods --- */
    @Override
    public void work() {

        System.out.println("My job is doing  stealing from normal people!");
    }


} //end class Thief
