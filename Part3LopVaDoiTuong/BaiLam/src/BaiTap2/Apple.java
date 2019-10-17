package BaiTap2;

public class Apple {
    private int weight = 10;

    public Apple() {
    }

    public Apple(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void decrease(){
        this.weight--;
    }

    public boolean isEmpty(){
        return this.weight <= 0;
    }

    @Override
    public String toString(){
        return "This apple weight " + this.weight;
    }
}
