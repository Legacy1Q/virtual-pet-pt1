package virtual_pet;

public class VirtualPet {
    String hunger;
    String thirst;
    String waste;
    String boredom;
    String sickness;

    public VirtualPet(String hunger, String thirst, String waste, String boredom, String sickness) {
        this.hunger = hunger;
        this.thirst = thirst;
        this.waste = waste;
        this.boredom = boredom;
        this.sickness = sickness;
    }


    public String getHunger() {
        return this.hunger;
    }

    public void setHunger(String hunger) {
        this.hunger = hunger;
    }

    public String getThirst() {
        return this.thirst;
    }

    public void setThirst(String thirst) {
        this.thirst = thirst;
    }

    public String getWaste() {
        return this.waste;
    }

    public void setWaste(String waste) {
        this.waste = waste;
    }

    public String getBoredom() {
        return this.boredom;
    }

    public void setBoredom(String boredom) {
        this.boredom = boredom;
    }

    public String getSickness() {
        return this.sickness;
    }

    public void setSickness(String sickness) {
        this.sickness = sickness;
    }


}
