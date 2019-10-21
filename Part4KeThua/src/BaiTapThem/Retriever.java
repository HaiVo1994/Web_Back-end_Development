package BaiTapThem;

import BaiTapThem.Animal.Bird;
import BaiTapThem.Animal.Dog;
import BaiTapThem.License.License;

public class Retriever extends Dog {
    public Retriever(String name, License license) {
        super(name, license);
    }

    @Override
    public void speak(){
        System.out.println(getName() + " : Khong co");
    }

    public Bird retrieve(){
        return new Bird();
    }
}
