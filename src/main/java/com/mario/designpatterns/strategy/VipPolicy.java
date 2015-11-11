/*
 *
 * File:	VipPolicy.java
 */
package com.mario.designpatterns.strategy;

/**
 * Implementation of class <code>VipPolicy</code>.
 *
 * @author <a href="mailto:mariolopezcampos@gmail.com">Mario Lopez</a>
 * @version 1.0, 11/10/2015
 */
public class VipPolicy implements RestrictionPolicy {
    

    
    
    /* --- Implementation methods --- */
public String getPolicy(){
    return "VIP can enter any place";
}

} //end class VipPolicy
