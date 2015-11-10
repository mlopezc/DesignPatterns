/*
 *
 * File:	NormalPolicy.java
 */
package com.mario.designpatterns.strategy;

/**
 * Implementation of class <code>NormalPolicy</code>.
 *
 * @author <a href="mailto:mario.elopez@experian.com">Mario Lopez</a>
 * @version 1.0, 11/10/2015
 */
public class NormalPolicy implements RestrictionPolicy {




    /* --- Implementation methods --- */
    public String getPolicy(){
        return "This person can enter, but will have to pay $10";
    }


} //end class NormalPolicy
