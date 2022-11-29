package gorm.body;

import java.util.LinkedList;
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
    String name;
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
    public String getName() {
        return name;
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
    public void setName(String name) {
        this.name = name;
    }
    //CALCULATIONS
    //todo, calculate stats from body parts

    //CONSTRUCTORS
    public Body(){
        List<BodyPart> b = new LinkedList<>();
        b.add(new BodyPart());
        this.setBodyList(b);
        this.setName("Your");
    }


    // create specific bodies here:
    public Body(String init){
        //wip, todo
        if (init.equalsIgnoreCase("human")) {
            this.getBodyList().add(new BodyPart("leftarm"));
            this.getBodyList().add(new BodyPart("rightarm"));
            this.getBodyList().add(new BodyPart("leftleg"));
            this.getBodyList().add(new BodyPart("rightleg"));
            this.getBodyList().add(new BodyPart("torso"));
            this.getBodyList().add(new BodyPart("abdomen"));
            this.getBodyList().add(new BodyPart("waist"));
            this.getBodyList().add(new BodyPart("tail"));
            this.getBodyList().add(new BodyPart("head"));


        }
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

    // QUICK ATTACK FUNCTIONS
    public void takeRandomHit(int baseDmg){

    }
    public void takeRandomHit(){
        int locMax = this.getBodyList().size();
        int hitLoc = (int)(Math.random()*locMax);
        int dmg = (int)(Math.random()*10)+3;
        this.getBodyPart(hitLoc).takeDmg(dmg);
        // todo, add a name and display dmg
        // System.out.println(this.getName()+" took "+dmg+" to the ");
    }
    public void takeRandomTF(){
        int locMax = this.getBodyList().size();
        int hitLoc = (int)(Math.random()*locMax);
        // todo, make this an enum or something
        String[] species = {"wolf", "rabbit", "feline", "sheep", "goat", "deer", "horse", "lizard", "rodent", "bird"};
        int tf = (int)(Math.random()*9);
        this.getBodyPart(hitLoc).takeSpeciesChange(species[tf]);
    }
    public void takeRandomSpecificTF(String newSpecies){
        int locMax = this.getBodyList().size();
        int hitLoc = (int)(Math.random()*locMax);
        this.getBodyPart(hitLoc).takeSpeciesChange(newSpecies);
    }
    public void takeWholeSpeciesTF(String newSpecies){
        int locMax = this.getBodyList().size();
        for (int i =0;i<locMax;i++){
            this.getBodyPart(i).takeSpeciesChange(newSpecies);
        }
    }
    public void takeRandomFeminize(){
        int locMax = this.getBodyList().size();
        int hitLoc = (int)(Math.random()*locMax);
        // todo, make this an enum or something
        int tf = -(int)(Math.random()*3);
        this.getBodyPart(hitLoc).takeGenderChange(tf);
    }
    public void takeWholeFeminize(){
        int locMax = this.getBodyList().size();
        int tf = -(int)(Math.random()*3);
        for (int i =0;i<locMax;i++){
            this.getBodyPart(i).takeGenderChange(tf);
        }
    }
    public void takeWholeFeminize(String newSpecies){
        int locMax = this.getBodyList().size();
        int tf = -(int)(Math.random()*3);
        for (int i =0;i<locMax;i++){
            this.getBodyPart(i).takeGenderChange(tf);
            this.getBodyPart(i).takeSpeciesChange(newSpecies);
        }
    }
    public void takeRandomMasculine(){
        int locMax = this.getBodyList().size();
        int hitLoc = (int)(Math.random()*locMax);
        // todo, make this an enum or something
        int tf = (int)(Math.random()*3);
        this.getBodyPart(hitLoc).takeGenderChange(tf);
    }
    public void takeWholeMasculine(){
        int locMax = this.getBodyList().size();
        int tf = (int)(Math.random()*3);
        for (int i =0;i<locMax;i++){
            this.getBodyPart(i).takeGenderChange(tf);
        }
    }
    public void takeWholeMasculine(String newSpecies){
        int locMax = this.getBodyList().size();
        int tf = (int)(Math.random()*3);
        for (int i =0;i<locMax;i++){
            this.getBodyPart(i).takeGenderChange(tf);
            this.getBodyPart(i).takeSpeciesChange(newSpecies);
        }
    }




}
