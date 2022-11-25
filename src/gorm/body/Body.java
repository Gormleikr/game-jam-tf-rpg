package gorm.body;

import java.util.List;

public class Body {
    int SP;
    int MP;
    int maxSP;
    int maxMP;
    int str;
    int agl;
    int intelligence;
    List <BodyPart> bodyList;
    //WIP, todo, build bodyPart first



    // GETTERS
    public int getSP() {
        return SP;
    }
    public int getMP() {
        return MP;
    }
    public int getMaxSP() {
        return maxSP;
    }
    public int getStr() {
        return str;
    }
    public int getMaxMP() {
        return maxMP;
    }
    public int getIntelligence() {
        return intelligence;
    }
    public int getAgl() {
        return agl;
    }
    public List<BodyPart> getBodyList() {
        return bodyList;
    }

    // SETTERS
    private void setSP(int SP) {
        this.SP = SP;
    }
    private void setMP(int MP) {
        this.MP = MP;
    }
    private void setMaxSP(int maxSP) {
        this.maxSP = maxSP;
    }
    private void setMaxMP(int maxMP) {
        this.maxMP = maxMP;
    }
    private void setStr(int str) {
        this.str = str;
    }
    private void setAgl(int agl) {
        this.agl = agl;
    }
    private void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    private void setBodyList(List<BodyPart> bodyList) {
        this.bodyList = bodyList;
    }

    //CALCULATIONS
    //todo, calculate stats from body parts

    //CONSTRUCTORS
    public Body(){
//        set
    }














}
