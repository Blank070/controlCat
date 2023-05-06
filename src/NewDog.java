public class NewDog {
    private String nameDog;
    private int choose;
    private int ageDog;
    private int mood;
    private int satiety;
    private int health;

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getChoose() {
        return choose;
    }

    public void setChoose(int choose) {
        this.choose = choose;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAgeDog(int ageDog) {
        this.ageDog = ageDog;
    }

    public void setNameDog(String nameDog) {
        this.nameDog = nameDog;
    }
    public String getNameDog(){
        return nameDog;
    }

    public int getSatiety() {
        return satiety;
    }

    public int getMood() {
        return mood;
    }

    public int getHealth() {
        return health;
    }

    public int getAgeDog() {
        return ageDog;
    }

}
