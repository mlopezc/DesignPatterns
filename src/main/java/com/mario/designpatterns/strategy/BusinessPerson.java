/*
 *
 * File:	BusinessPerson.java
 */
package com.mario.designpatterns.strategy;

/**
 * Implementation of class <code>BusinessPerson</code>.
 *
 * @author <a href="mailto:mario.elopez@experian.com">Mario Lopez</a>
 * @version 1.0, 11/10/2015
 */
public class BusinessPerson extends Person {


    /* --- Constructor methods --- */
    BusinessPerson(int age, String name){
        super(age, name);
        restrictionPolicy = new VipPolicy();
    }

    
    /* --- Implementation methods --- */
    @Override
    public void work() {

        System.out.println("My job is doing business and making money!");
    }

} //end class BusinessPerson
