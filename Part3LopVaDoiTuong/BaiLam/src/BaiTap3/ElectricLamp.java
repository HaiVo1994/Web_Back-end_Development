package BaiTap3;

public class ElectricLamp {
    private boolean status;

    public ElectricLamp(boolean status) {
        this.status = status;
    }
    public void turnOn(){
        this.status = true;
    }
    public void turnOff(){
        this.status = false;
    }
    @Override
    public String toString(){
        String status = this.status? " is on": " is off";
        return "This lamp" + status;
    }
}
