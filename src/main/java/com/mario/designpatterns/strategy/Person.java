/*
 *
 * File:	Person.java
 */
package com.mario.designpatterns.strategy;

/**
 * Implementation of class <code>Person</code>.
 *
 * @author <a href="mailto:mariolopezcampos@gmail.com">Mario Lopez</a>
 * @version 1.0, 11/10/2015
 */
public abstract class Person {
    
    

    
    /* --- Attributes --- */	
    protected int age;
    protected String name;
    protected RestrictionPolicy restrictionPolicy;

    
    
        
    /* --- Constructor methods --- */

    public Person(int age, String name) {
        setAge(age);
       setName(name);
    }
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

    /* --- Implementation methods --- */


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public  void print(){
        System.out.println(toString());
        System.out.println("Entering: " + restrictionPolicy.getPolicy());

    }


} //end class Person
