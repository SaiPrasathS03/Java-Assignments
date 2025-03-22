package com.zoho;

class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter{
    public String toString(){
        return "Fighter is a Warrior";
    }
    public boolean isVulnerable(){
        return false;
    }
    public int getDamagePoints(Fighter fighter){
        if(fighter.isVulnerable()) return 10;
        return 6;
    }
}

// TODO: define the Wizard class
class Wizard extends Fighter{
    boolean var = false;
    public String toString(){
        return "Fighter is a Wizard";
    }
    public void prepareSpell(){
        var=true;
    }
    public int getDamagePoints(Fighter fighter){
        if(isVulnerable()) return 3;
        return 12;
    }
    public boolean isVulnerable(){
        if(var) return false;
        return true;
    }
}


