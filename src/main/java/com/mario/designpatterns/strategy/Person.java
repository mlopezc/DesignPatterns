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
 * File:	Person.java
 */
package com.mario.designpatterns.strategy;

/**
 * Implementation of class <code>Person</code>.
 *
 * @author <a href="mailto:mario.elopez@experian.com">Mario Lopez</a>
 * @version 1.0, 11/10/2015
 */
public abstract class Person {
    
    

    
    /* --- Attributes --- */	
    protected int age;
    protected String name;
    protected RestrictionPolicy restrictionPolicy;

    
    
        
    /* --- Constructor methods --- */
    
    
         
    /* --- Getters and Setters--- */

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0) {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public void setRestrictionPolicy(RestrictionPolicy restrictionPolicy) {
        this.restrictionPolicy = restrictionPolicy;
    }
    /* --- Interface methods --- */
    
    public abstract void  work();

    public void enterPlace(){
        System.out.println(restrictionPolicy.getPolicy());
    }
    
    /* --- Implementation methods --- */


} //end class Person
