/*
 * File:	ScoreUpdater.java
 */
package com.mario.designpatterns.observer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of class <code>ScoreUpdater</code>.
 *
 * @author <a href="mailto:mariolopezcampos@gmail.com">Mario Lopez</a>
 * @version 1.0, 11/11/2015
 */
public class ScoreUpdater implements Subject {
    
    
    /* --- Constants --- */
    
    
    
    /* --- Attributes --- */


    private List<Observer> observers;
    private List<SoccerMatch> soccerMatchList;
        
    /* --- Constructor methods --- */

    ScoreUpdater() {
        observers = new ArrayList<Observer>();
        soccerMatchList = new ArrayList<SoccerMatch>();

    }

    /* --- Getters and Setters--- */
    
    
         
    /* --- Interface methods --- */
    
    
    
    /* --- Implementation methods --- */


    public void register(Observer newObserver) {

        observers.add(newObserver);
    }

    public void unregister(Observer deleteObserver) {

        int observerIndex = observers.indexOf(deleteObserver);
        observers.remove(observerIndex);
    }

    public void notifyObserver() {


        for (int clear = 0; clear < 100; clear++) {
            System.out.println("\b");
        }
        for (Observer observer : observers) {
            observer.update(soccerMatchList);
        }

    }

    public void updateScore(SoccerMatch soccerMatch) {
        int matchIndex = soccerMatchList.indexOf(soccerMatch);
        if (matchIndex != -1) {
            soccerMatchList.set(matchIndex, soccerMatch);
        } else {
            soccerMatchList.add(soccerMatch);
        }
        notifyObserver();
    }

} //end class ScoreUpdater
