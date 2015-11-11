/*
 * Copyright (c) 2014, Experian Marketing Services
 * 
 * Ownership and copyright in this software at all times belongs to
 * Experian Marketing Services. It is supplied on the basis that its
 * contents are at all times kept strictly confidential. This software
 * (or any part of it) shall not be copied or reproduced in any way or
 * disclosed to any third party and Experian shall take all such steps
 * as it considers necessary to protect its rights in the event of any
 * unauthorized use.
 *
 * File:	TestStrategyPattern.java
 */
package com.mario.designpatterns.strategy;

/**
 * Implementation of class <code>TestStrategyPattern</code>.
 *
 * @author <a href="mailto:mariolopezcampos@gmail.com">Mario Lopez</a>
 * @version 1.0, 11/10/2015
 */
public class TestStrategyPattern {
    

    
    
    /* --- Implementation methods --- */

    public static void main(String [] args){
        Person p1 = new BusinessPerson(26,"Sir Richard");
        Person p2 = new NormalPerson(29,"John Doe");
        Person p3 = new Thief(35,"Robin Hood");

        p1.print();
        p2.print();
        p3.print();

    }

} //end class TestStrategyPattern
