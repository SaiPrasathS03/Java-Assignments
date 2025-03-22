package com.zoho;

public class WizardsAndWarriors2 {

    // TODO: define a 'describe' method that returns a description of a Character
    public static String describe(Character ch){
        return "You're a level "+ch.getLevel()+" "+ch.getCharacterClass()+" with "+ch.getHitPoints()+" hit points.";
    }
     
    // TODO: define a 'describe' method that returns a description of a Destination
    public static String describe(Destination des){
        return "You've arrived at "+des.getName()+", which has "+des.getInhabitants()+" inhabitants.";
    }

    // TODO: define a 'describe' method that returns a description of a TravelMethod
    public static String describe(TravelMethod tm){
        if(tm==TravelMethod.valueOf("HORSEBACK")) return "You're traveling to your destination on horseback.";
        else return "You're traveling to your destination by walking.";
    }

    // TODO: define a 'describe' method that returns a description of a Character, Destination and TravelMethod
    public static String describe(Character ch,Destination des,TravelMethod tm){
        if(tm==tm.valueOf("HORSEBACK")) return "You're a level "+ch.getLevel()+" "+ch.getCharacterClass()+" with "+ch.getHitPoints()+" hit points. You're traveling to your destination on horseback. You've arrived at "+des.getName()+", which has "+des.getInhabitants()+" inhabitants.";
        return "You're a level "+ch.getLevel()+" "+ch.getCharacterClass()+" with "+ch.getHitPoints()+" hit points. You're traveling to your destination by walking. You've arrived at "+des.getName()+", which has "+des.getInhabitants()+" inhabitants.";
    }

    // TODO: define a 'describe' method that returns a description of a Character and Destination
    public static String describe(Character ch,Destination des){
        return "You're a level "+ch.getLevel()+" "+ch.getCharacterClass()+" with "+ch.getHitPoints()+" hit points. You're traveling to your destination by walking. You've arrived at "+des.getName()+", which has "+des.getInhabitants()+" inhabitants.";
    }
}
