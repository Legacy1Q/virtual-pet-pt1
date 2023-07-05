package virtual_pet;

public class VirtualPet {
    private String name;
    private int hunger;
    private int thirst;
    private int waste;
    private int boredom;
    private int sickness;

    public VirtualPet(String name, int hunger, int thirst, int waste, int boredom, int sickness) {
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
        this.waste = waste;
        this.boredom = boredom;
        this.sickness = sickness;
    }

    public void tick() {
        hunger += 1;
        thirst += 1;
        waste += 1;
        boredom += 1;
        sickness += 1;
    }

    public void feed() {
        hunger -= 5;
        thirst += 1;
        waste += 2;
        boredom += 1;
        sickness += 1;
    }

    public void water() {
        hunger += 1;
        thirst -= 5;
        waste += 2;
        boredom += 1;
        sickness += 1;
    }

    public void clean() {
        hunger += 1;
        thirst += 1;
        waste -= 5;
        boredom += 1;
    }

    public void play() {
        hunger += 1;
        thirst += 1;
        boredom -= 5;
        sickness += 1;
    }

    public void vet() {
        hunger += 1;
        thirst += 1;
        waste += 1;
        sickness -= 5;
    }

    public void nothing() {
        hunger += 1;
        thirst += 1;
        waste += 1;
        boredom += 2;
        sickness += 1;
    }

    public String getName() {
        return this.name;
    }

    // public void setName(String name) {
    //     this.name = name;
    // }

    public int getHunger() {
        return this.hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return this.thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getWaste() {
        return this.waste;
    }

    public void setWaste(int waste) {
        this.waste = waste;
    }

    public int getBoredom() {
        return this.boredom;
    }

    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }

    public int getSickness() {
        return this.sickness;
    }

    public void setSickness(int sickness) {
        this.sickness = sickness;
    }

}
