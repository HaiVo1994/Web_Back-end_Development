package BaiTapThem.Animal;

import BaiTapThem.ISpeaking;

public abstract class Pet implements ISpeaking {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
