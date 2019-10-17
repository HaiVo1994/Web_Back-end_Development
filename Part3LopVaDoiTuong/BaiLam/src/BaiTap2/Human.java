package BaiTap2;

public class Human {
    private String name;
    private boolean gender;
    private int weight;

    public Human(String name, boolean gender, int weight) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void eat(Apple apple){
        if (this.checkApple(apple)){
            apple.decrease();
            this.weight ++;
        }
    }
    private boolean checkApple(Apple apple){
        return !apple.isEmpty();
    }

    @Override
    public String toString(){
        String isMale = this.isMale()? " is male ": "is female ";
        return this.name + " weight " + this.weight + isMale;
    }

    public String say(String messenger){
        return this.name + " say: " + messenger;
    }
}
