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


    BusinessPerson(){
        restrictionPolicy = new VipPolicy();
    }

    
    /* --- Implementation methods --- */
    @Override
    public void work() {

        System.out.println("My work is doing business and making money!");
    }

} //end class BusinessPerson
