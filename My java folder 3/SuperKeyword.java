public class Parent {
    public int x = 10;
}

public class Child extends Parent {
    public int x = 20;

    public void printX() {
        System.out.println(super.x);
    }
}