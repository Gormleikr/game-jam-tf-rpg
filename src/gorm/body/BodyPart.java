package gorm.body;

public class BodyPart {
    String limbName;
    String type; //enum would be better...
        // spinal, hip, limb, head, carapace_Segment
    int HP;
    int MaxHP;
    int str;
    int agl;
    int mass;
    int muscle;
    int slimMuscle;
    int leanMuscle;
    int bulkMuscle;
    int gender;
    int humanity;
    int beastType; //should be enum, todo
    // 0=human,1=wolf,2=cat,3=sheep,4=goat,5=horse,6=deer
    // 7=lizard, 8=rodent(rabbit,squirrel,wip), 9=bird
    String description;
    boolean isCrippled;


    /*
    texture/covering
    masculinity
    structure...
    size
    muscle tone
     */
    // METHODS

    //SETTERS_GETTERS
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getHP() {
        return HP;
    }
    public void setHP(int HP) {
        this.HP = HP;
    }
    public int getMaxHP() {
        return MaxHP;
    }
    public void setMaxHP(int maxHP) {
        MaxHP = maxHP;
    }
    public int getStr() {
        return str;
    }
    public void setStr(int str) {
        this.str = str;
    }
    public int getAgl() {
        return agl;
    }
    public void setAgl(int agl) {
        this.agl = agl;
    }
    public int getMass() {
        return mass;
    }
    public void setMass(int mass) {
        this.mass = mass;
    }
    public int getMuscle() {
        return muscle;
    }
    public void setMuscle(int muscle) {
        this.muscle = muscle;
    }
    public int getSlimMuscle() {
        return slimMuscle;
    }
    public void setSlimMuscle(int slimMuscle) {
        this.slimMuscle = slimMuscle;
    }
    public int getLeanMuscle() {
        return leanMuscle;
    }
    public void setLeanMuscle(int leanMuscle) {
        this.leanMuscle = leanMuscle;
    }
    public int getBulkMuscle() {
        return bulkMuscle;
    }
    public void setBulkMuscle(int bulkMuscle) {
        this.bulkMuscle = bulkMuscle;
    }
    public int getGender() {
        return gender;
    }
    public void setGender(int gender) {
        this.gender = gender;
    }
    public int getHumanity() {
        return humanity;
    }
    public void setHumanity(int humanity) {
        this.humanity = humanity;
    }
    public int getBeastType() {
        return beastType;
    }
    public void setBeastType(int beastType) {
        this.beastType = beastType;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isCrippled() {
        return isCrippled;
    }
    public void setCrippled(boolean crippled) {
        isCrippled = crippled;
    }
    public String getLimbName() {
        return limbName;
    }
    public void setLimbName(String limbName) {
        this.limbName = limbName;
    }
    //METHODS

    public void recalculateStats(){
        //setStrength
        int s = 0;
        s=s+3*getBulkMuscle();
        s=s+2*getLeanMuscle();
        s=s+1*getSlimMuscle();
        this.setStr(s);
        //set agility
        int a = 0;
        a=a+1*getBulkMuscle();
        a=a+2*getLeanMuscle();
        a=a+3*getSlimMuscle();
        this.setStr(s);
        // check mass
        if (this.getMass()<=0){
            this.setMass(1);
        }
        // max muscle is 3/4 body mass
        else if (this.getMass()<(int)(this.getMuscle()*.75)) {
            this.setMass((int) (this.getMuscle()*1.25));
        }
        // set health
        this.setMaxHP(this.getMass());
        if(this.getHP()>this.getMaxHP()){
            setHP(this.getMaxHP());
        }
        if(this.getHP()<=0){
            this.setHP(0);
            this.setCrippled(true);
        }
        else if(this.getHP()>0){
            this.setCrippled(false);
        }
    }

    //WIP fixme here
    public void takeChange(){
        // mass, muscle mass(type), muscle type,
        // humanity
        // beast type
        // gender
        //descriptions...

    }
    public void takeGenderChange(int inMasculinity){ //plus for more male tf
        //get more male
        if (inMasculinity>0){
            do{
                if(this.getGender()<10){
                    this.setGender(this.getGender()+1);
                    this.setBulkMuscle(
                            this.getBulkMuscle()+(
                                    (int)(this.getMass()*.1)
                            )
                    );
                    if(this.getSlimMuscle()>(int)(this.getMass()*.05)){
                        this.setSlimMuscle(this.getSlimMuscle()-(int)(this.getMass()*.05));
                    } else {
                        int mChange= (this.getSlimMuscle()-(int)(this.getMass()*.05));
                        mChange = -mChange;
                         this.setSlimMuscle(0);
                         if (this.getLeanMuscle()<mChange) {
                             this.setLeanMuscle(0);
                         } else {this.setLeanMuscle(this.getLeanMuscle()-mChange);}
                    }
                    this.setMass((int)(this.getMass()*1.05));
                    System.out.println(this.getLimbName()+" has grown in muscle and size");
                }
                inMasculinity--;
            } while (inMasculinity>0);
            //get more female
        } else if (inMasculinity<0) { //wip, fixme, feminize
            do{
                //lose bulk muscle
                if(this.getGender()>-10){
                    this.setGender(this.getGender()-1);
                    this.setBulkMuscle(
                            this.getBulkMuscle()-(
                                    (int)(this.getMass()*.1)
                            )
                    );
                    //if not enough bulk, reduce from lean
                    if(this.getBulkMuscle()<0){
                        int fChange = this.getBulkMuscle();
                        fChange = -fChange;

                        this.setLeanMuscle(this.getLeanMuscle()+fChange);
                        if (this.getLeanMuscle()<0){ //if not enough lean
                            fChange=this.getLeanMuscle();
                            fChange=-fChange; //should now be positive
                            //set slim- currently fChange muscle is lost on top of 5%
                this.setSlimMuscle(this.getSlimMuscle()+(int)(this.getMass()*1.05));
                            setLeanMuscle(0); //cleanup lean
                        }
                        setBulkMuscle(0);// cleanup bulk
                    } else {
                        //grow slim muscle
                        this.setSlimMuscle(this.getSlimMuscle()+(int)(this.getMass()*1.05));
                        //bulk was set in while loop
                    }
                    //mass effect
                    this.setMass((int)(this.getMass()*.95));
                    System.out.println(this.getLimbName()+" has lost muscle and shrunken in size");

                }
                inMasculinity++;
            } while (inMasculinity<0);
        }
    } //this should be cannibalized so I can use the muscle tf in its own function
    public void takeSpeciesChange(int newSpecies){
        //todo focus on mass changes for different species
        //todo, also need descriptions... might rely on bodypart.type...
        int currentSpecies = this.getBeastType();
        if (currentSpecies==newSpecies){
            this.takeHumanityChange(1);
        }
        else {
            //todo...sysout here
            this.setBeastType(newSpecies);
            // TODO: 11/25/2022 different values for species ...
        }
        //todo, figure out if I can get 2 species at once... maybe for next game

    }
    public void takeHumanityChange(int change){//+->more beastial

    }


    public void takeDmg(int incoming){
        //will also use to heal for now?
        this.setHP(this.getHP()-incoming);
        this.recalculateStats();
    }

    // may not use this method...todo
    public void displayMuscle(){ //fat not implemented... but gender is
        // well muscled... how much muscle per mass
        if(this.getMuscle()/this.getMass()<.3){
            // todo
        }

            //todo, might want to change advectives for this...
        // bulkiness of muscle
        if(this.getStr()<((int)(this.getMuscle()*1.2))){
            System.out.println("You have weak, slender muscles");
        }
        else if(this.getStr()<((int)(this.getMuscle()*1.6))){
            System.out.println("You have relatively weak, slender muscles");
        }
        else if(this.getStr()<((int)(this.getMuscle()*2))){
            System.out.println("You have slender muscles");
        }
        else if(this.getStr()<((int)(this.getMuscle()*2.4))){
            System.out.println("You have lean, durable muscles");
        }
        else if(this.getStr()<((int)(this.getMuscle()*2.8))){
            System.out.println("You have lean, powerful muscles");
        }
        else if(this.getStr()<((int)(this.getMuscle()*3))){
            System.out.println("You have bulky, powerful muscles");
        }
        else if(this.getStr()==((int)(this.getMuscle()*3))){
            System.out.println("Your massive muscles leave you panting for breath with reduced stamina");
        }

        System.out.println("Your strength stat is "+this.getStr());
        System.out.println("Your agility stat is "+this.getAgl());

    }



    //todo, remove muscle mass?
}

/*
    String type; //enum would be better...
        // spinal, hip, limb, head, carapace_Segment
    int HP;
    int MaxHP;
    int str;
    int agl;
    int mass;
    int muscle;
    int slimMuscle;
    int leanMuscle;
    int bulkMuscle;
    int gender;
    int humanity;
    int beastType; //should be enum, todo
    // 0=human,1=wolf,2=cat,3=sheep,4=goat,5=horse,6=deer
    // 7=lizard, 8=rodent(rabbit,squirrel,wip), 9=bird
    String description;
    boolean isCrippled;
wip-
LIMBS
 - arm, leg, wing
digits
 - hand, hoof,
 ...
 hand, x-like-hand, half-hand-half-x, hand-like-x, xxx
 1-5...
 ...what should be the digit things revert to before changing?
 --->
 - remove half?
 ...
 2 stats? handlike value and beast value?
 ...means not paw to hoof tf...

 hand, paw tipped hand, pawed hand, paw with fingerpaws..
    paw with fingers,
 hand, winglike hand, handlike wing, wing
 */