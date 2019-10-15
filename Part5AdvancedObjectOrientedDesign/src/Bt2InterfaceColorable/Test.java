package Bt2InterfaceColorable;

public class Test {
    public static void main(String[] args) {
        int length = 20;
        Shape[] shapes = new Shape[length];
        for (int i=0; i<length; i++){
            int random = (int) (Math.random() * 3) + 1;
            switch (random){
                case 1:
                    shapes[i] = new Circle("Gold", true,Math.random()*length);
                    break;
                case 2:
                    shapes[i] = new Rectangle(Math.random()*length, Math.random()*length, "Gold", true);
                    break;
                case 3:
                    shapes[i] = new Square(Math.random()*length,"Gold", true);
                    break;
            }
        }
        for (int i=0; i<length; i++){
            if (shapes[i] instanceof Colorable){
                ((Square)shapes[i]).howToColor();
            }
            else {
                System.out.println(shapes[i].toString());
            }
        }
    }
}
