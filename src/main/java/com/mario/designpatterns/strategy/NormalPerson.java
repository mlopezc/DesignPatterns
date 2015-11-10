/*
 *
 * File:	NormalPerson.java
 */
package com.mario.designpatterns.strategy;

/**
 * Implementation of class <code>NormalPerson</code>.
 *
 * @author <a href="mailto:mario.elopez@experian.com">Mario Lopez</a>
 * @version 1.0, 11/10/2015
 */
public class NormalPerson extends Person {

    NormalPerson(int age, String name) {
        super(age, name);
        restrictionPolicy = new NormalPolicy();
    }


    /* --- Implementation methods --- */
    @Override
    public void work() {

        System.out.println("My job is doing  taks and helping the business men!");
    }


} //end class NormalPerson
