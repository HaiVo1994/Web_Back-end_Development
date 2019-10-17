package BaiTap3;

public class SwitchButton {
    private boolean status;
    private ElectricLamp lamp;

    public SwitchButton(boolean status) {
        this.status = status;
        this.lamp = new ElectricLamp(status);
    }

    public void switchOn(){
        this.lamp.turnOn();
        this.status = true;
    }

    public void switchOff(){
        this.lamp.turnOff();
        this.status = false;
    }
    @Override
    public String toString(){
        String status = (this.status? " turn on": " turn off") + " the lamp ";
        return "The switch" + status + this.lamp.toString();
    }
}
