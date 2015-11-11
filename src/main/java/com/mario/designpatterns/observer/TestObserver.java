/*
 *
 * File:	TestObserver.java
 */
package com.mario.designpatterns.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Implementation of class <code>TestObserver</code>.
 *
 * @author <a href="mailto:mariolopezcampos@gmail.com">Mario Lopez</a>
 * @version 1.0, 11/11/2015
 */
public class TestObserver {


    /* --- Implementation methods --- */

    public static void main(String[] args) {
        ScoreUpdater scoreUpdater = new ScoreUpdater();
        Observer espnObserver = new SoccerObserver(scoreUpdater, "ESPN");
        Observer foxSportsObserver = new SoccerObserver(scoreUpdater, "Fox Sports");
        Observer tdnObserver = new SoccerObserver(scoreUpdater, "TDN");

        SoccerMatch soccerMatch1 = new SoccerMatch("RMA", "BAR");
        SoccerMatch soccerMatch2 = new SoccerMatch("INT", "MIL");
        SoccerMatch soccerMatch3 = new SoccerMatch("BAY", "DORT");
        scoreUpdater.updateScore(soccerMatch1);
        scoreUpdater.updateScore(soccerMatch2);
        scoreUpdater.updateScore(soccerMatch3);
        List<SoccerMatch> soccerMatchList = new ArrayList<SoccerMatch>();
        soccerMatchList.add(soccerMatch1);
        soccerMatchList.add(soccerMatch2);
        soccerMatchList.add(soccerMatch3);

        for (int minute = 0; minute <= 90; minute++) {
            Iterator<SoccerMatch> soccerMatchIterator = soccerMatchList.iterator();
            while (soccerMatchIterator.hasNext()) {
                int goalProbability = (int) Math.floor(Math.random() * 101);
                SoccerMatch soccerMatch = soccerMatchIterator.next();
                if (goalProbability <= 5) {
                    int whoScoredProbability = (int) Math.floor(Math.random() * 11);
                    if (whoScoredProbability <= 5) {
                        (soccerMatch).addHomeTeamGoal();
                    } else {
                        (soccerMatch).addAwayTeamGoal();
                    }

                }
                if (minute == 45) {

                    (soccerMatch).setCurrentTime("MT");

                } else if (minute == 90) {
                    (soccerMatch).setCurrentTime("FT");
                } else {
                    (soccerMatch).setCurrentTime(String.valueOf(minute));
                }
                scoreUpdater.updateScore((soccerMatch));


            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }




    }


} //end class TestObserver
