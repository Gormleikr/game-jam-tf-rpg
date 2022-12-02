package gorm;

import gorm.body.Body;

public class Player {
    // create up to 3 or 4 beings?
    String name = "Refugee";
    Body body = new Body();
    Player(){

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Body getBody() {
        return body;
    }
    public void setBody(Body body) {
        this.body = body;
    }
}
