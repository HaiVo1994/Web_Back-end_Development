package BaiTapThem;

import BaiTapThem.Animal.Bird;
import BaiTapThem.Animal.Cat;
import BaiTapThem.Animal.Dog;
import BaiTapThem.License.License;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("milu", new License());
        Cat cat = new Cat("Meo");
        Bird bird = new Bird();
        Retriever retriever = new Retriever("asa",new License());
//        dog.speak();
//        cat.speak();
//        retriever.speak();
//        bird.speak();

        ISpeaking[] test = new ISpeaking[4];
        test[0] = dog;
        test[1] = bird;
        test[2] = retriever;
        test[3] = cat;
        for (int i=0; i<test.length; i++){
            test[i].speak();
        }
    }
}
