/*
 * File:	SoccerMatch.java
 */
package com.mario.designpatterns.observer;

/**
 * Implementation of class <code>SoccerMatch</code>.
 *
 * @author <a href="mailto:mariolopezcampos@gmail.com">Mario Lopez</a>
 * @version 1.0, 11/10/2015
 */
public class SoccerMatch {

    /* --- Attributes --- */

    private String homeTeam;
    private int homeTeamScore;
    private String awayTeam;
    private int awayTeamScore;
    private String currentTime;
        
    /* --- Constructor methods --- */

    public SoccerMatch(String homeTeam, String awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeTeamScore = 0;
        this.awayTeamScore = 0;
        this.currentTime = "0";
    }
    
    /* --- Getters and Setters--- */


    public String getHomeTeam() {
        return homeTeam;
    }

    public int getHomeTeamScore() {
        return homeTeamScore;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public int getAwayTeamScore() {
        return awayTeamScore;
    }

    public String getCurrentTime() {
        return currentTime;
    }

    public void addHomeTeamGoal() {
        homeTeamScore++;
    }

    public void addAwayTeamGoal() {
        awayTeamScore++;
    }


    public void setCurrentTime(String currentTime) {

        this.currentTime = currentTime;

    }
    /* --- Implementation methods --- */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SoccerMatch that = (SoccerMatch) o;

        if (!homeTeam.equals(that.homeTeam)) return false;
        return awayTeam.equals(that.awayTeam);

    }

    @Override
    public int hashCode() {
        int result = homeTeam.hashCode();
        result = 31 * result + awayTeam.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "SoccerMatch{" +

                homeTeam + ":" + homeTeamScore +
                " - " + awayTeam + ":" + awayTeamScore +
                " Time: " + currentTime +
                '}';
    }
} //end class SoccerMatch
