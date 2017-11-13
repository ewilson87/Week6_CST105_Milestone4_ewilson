/**
 * Program: NFL Draft Final 
 * Project - NFL Player class 
 * File: NFLPlayer.java
 * Summary: The NFL Player class for the project. 
 * Author: Evan W Wilson 
 * Date: November 5, 2017
 **/
package draftfinalproject;


public class DefensivePlayer extends NFLPlayer {
    
    String team;
    String position;
    int tackles;
    int sacks;
    int forcedFumbles;
    int interceptions;
    
    public DefensivePlayer(){

    }
    
    public DefensivePlayer(String Team, String position, int tackles, int sacks, int forcedFumbles, int interceptions){
    
    }
    
    //following methods set and get all variables

        
    public void setDefensePosition(String p) {
        position = p;
    }

    public String getDefensePosition() {
        return position;
    }

    public void setTackles(int t) {
        tackles = t;
    }

    public int getTackles() {
        return tackles;
    }

    public void setSacks(int s) {
        sacks = s;
    }

    public int getSacks() {
        return sacks;
    }

    public void setForcedFumbles(int f) {
        forcedFumbles = f;
    }

    public int getForcedFumbles() {
        return forcedFumbles;
    }
    
    public void setInterceptions(int i) {
        interceptions = i;
    }

    public int getInterceptions() {
        return interceptions;
    }
    
    @Override
        public String toString() {

        //converts height into feet/inches
        int feet = height / 12;
        int inches = height % 12;

       
        return "Name:  " + firstName + " " + lastName
                + "\nTeam:  " + getTeam()
                + "\nPosition:  " + position
                + "\nCollege:  " + college
                + "\n40 Yard Dash Time:  " + dash40
                + "\nAge:  " + age
                + "\nHeight:  " + feet + " foot " + inches + " inches"
                + "\nWeight:  " + weight
                + "\nBMI:  " + BMI
                + "\nYears College Experiennce:  " + experience
                + "\n" + injury
                + "\nTackles This Year:  " + tackles
                + "\nSacks This Year:  " + sacks
                + "\nForced Fumbles This Year:  " + forcedFumbles
                + "\nInterceptions This Year:  " + interceptions;
    }
    
}
