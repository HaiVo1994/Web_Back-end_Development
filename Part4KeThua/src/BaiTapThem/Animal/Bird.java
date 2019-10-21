package BaiTapThem.Animal;

import BaiTapThem.ISpeaking;

public class Bird implements ISpeaking {
    public Bird() {
    }

    @Override
    public void speak(){
        System.out.println("Chim hot");
    }
}
