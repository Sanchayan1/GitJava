public class Main {
    // Static method
    public static void myStaticMethod() {
        System.out.println("This is a static method.");
    }

    // Non-static method
    public void myNonStaticMethod() {
        System.out.println("This is a non-static method.");
    }

    public static void main(String[] args) {
        // Call static method
        myStaticMethod();

        // Create an object to call non-static method
        Main obj = new Main();
        obj.myNonStaticMethod();
    }
}