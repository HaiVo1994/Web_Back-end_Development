package ThAnimalAndInterfaceEdible.Animal;

import ThAnimalAndInterfaceEdible.edible;

public class Chicken extends Animal implements edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
    @Override
    public String howToEat(){
        return "could be fried";
    }
}
