/*
 * File:	SoccerObserver.java
 */
package com.mario.designpatterns.observer;

import java.util.List;

/**
 * Implementation of class <code>SoccerObserver</code>.
 *
 * @author <a href="mailto:mariolopezcampos@gmail.com">Mario Lopez</a>
 * @version 1.0, 11/11/2015
 */
public class SoccerObserver implements Observer {

    /* --- Constants --- */
    
    
    
    /* --- Attributes --- */

    private List<SoccerMatch> soccerMatchList;
    private String name;
    private Subject scoreUpdater;
    
        
    /* --- Constructor methods --- */

    SoccerObserver(Subject scoreUpdater, String name) {
        this.scoreUpdater = scoreUpdater;
        this.name = name;
        scoreUpdater.register(this);

    }


    /* --- Implementation methods --- */
    public void update(List<SoccerMatch> soccerMatchList) {
        this.soccerMatchList = soccerMatchList;

        printScores();
    }

    private void printScores() {
        System.out.println();
        System.out.println(name);
        for (SoccerMatch soccerMatch : soccerMatchList) {
            System.out.println(soccerMatch);
        }

    }


} //end class SoccerObserver
