package gorm.body;

import java.util.List;
import java.util.Scanner;

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
    public BodyPart getBodyPart(int in){
        return this.getBodyList().get(in);
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


    // create specific bodies here:
    public Body(String init){
        //wip, todo
    }

//    public Body(int SP, int MP, int maxSP){
//        this.setSP(SP);
//        this.setMP(MP);
//        private void setMaxSP() {
//            this.maxSP = maxSP;
//        }
//        private void setMaxMP(int maxMP) {
//            this.maxMP = maxMP;
//        }
//        private void setStr(int str) {
//            this.str = str;
//        }
//        private void setAgl(int agl) {
//            this.agl = agl;
//        }
//        private void setIntelligence(int intelligence) {
//            this.intelligence = intelligence;
//        }
//        private void setBodyList(List<BodyPart> bodyList) {
//            this.bodyList = bodyList;
//        }
//    }

    // gender change
    // beast change
    // humanity change





// TODO, SELECT PART, affect part, get random part
    //
    public void displayBodyParts(Scanner sc){
        System.out.println("select a limb, use number");
        for (int i =0; i<this.getBodyList().size();i++){
            System.out.println(i+". ");
            this.getBodyList().get(i).display();
        }//fixme, number probably not on correct line
    }
    public int selectRandomPart(){
        return (int) (Math.random()*bodyList.size());
    }
    public int selectPart() { //todo, fixme
        // display
//        return (int) (Math.random()*bodyList.size());

//        String out;
//        int input;
//        do {
//            out = sc.nextLine();
//
//        }(while input!=)
        return 0;// fixme
        }



}
