package gorm.body;

public class Limb extends BodyPart{

// perhaps input with target bodypart and allow change there...


    public int attack1(){ //light attack
        //todo, should depend on type
        // light attack uses limb stats to cause dmg
        return 0;
    }
    public int attack2(){ //heavy attack
        //todo, should depend on type
        return 0;
    }
    public int attack3(){ //...spell
        //todo, should depend on type
        //wip... might make only heads cast spells...
        return 0;
    }
    public int guard(){ //reduces dmg
        //todo, should depend on type
        return 0;
    }

}
