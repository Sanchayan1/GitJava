public class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

public class Pig extends Animal {
    public void makeSound() {
        System.out.println("The pig says: wee wee");
    }
}