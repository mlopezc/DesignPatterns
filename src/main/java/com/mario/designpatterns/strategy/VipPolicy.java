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
 * File:	VipPolicy.java
 */
package com.mario.designpatterns.strategy;

/**
 * Implementation of class <code>VipPolicy</code>.
 *
 * @author <a href="mailto:mario.elopez@experian.com">Mario Lopez</a>
 * @version 1.0, 11/10/2015
 */
public class VipPolicy implements RestrictionPolicy {
    

    
    
    /* --- Implementation methods --- */
public String getPolicy(){
    return "VIP can enter any place";
}

} //end class VipPolicy
