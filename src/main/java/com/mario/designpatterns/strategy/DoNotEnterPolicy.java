/*
 *
 * File:	DoNotEnterPolicy.java
 */
package com.mario.designpatterns.strategy;

/**
 * Implementation of class <code>DoNotEnterPolicy</code>.
 *
 * @author <a href="mailto:mariolopezcampos@gmail.com">Mario Lopez</a>
 * @version 1.0, 11/10/2015
 */
public class DoNotEnterPolicy implements RestrictionPolicy  {
    
    

    
    
    /* --- Implementation methods --- */
    public String getPolicy(){
        return "This kind of person can't enter to this place.";
    }

} //end class DoNotEnterPolicy
