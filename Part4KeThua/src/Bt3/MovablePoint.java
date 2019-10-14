package Bt3;

public class MovablePoint extends Point {
    private float xSpeed = 0f;
    private float ySpeed = 0f;

    public MovablePoint() {
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] result = new float[2];
        result[0] = this.xSpeed;
        result[1] = this.ySpeed;
        return result;
    }
    @Override
    public String toString(){
        return "(" + super.getX() + ", " + super.getY() + "), speed = (" + this.xSpeed + ", " + this.ySpeed + ")";
    }
    public void move(){
        float[] result = super.getXY();
        result[0] += this.xSpeed;
        result[1] += this.ySpeed;
        super.setXY(result[0], result[1]);
    }
}
