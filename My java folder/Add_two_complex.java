public class AddComplexNumbers {
    private static class Complex {
        double real, imag;

        public Complex(double real, double imag) {
            this.real = real;
            this.imag = imag;
        }

        @Override
        public String toString() {
            return real + " + " + imag + "i";
        }
    }

    public static void main(String[] args) {
        Complex num1 = new Complex(3.0, 2.5);
        Complex num2 = new Complex(1.0, 1.5);
        Complex sum = new Complex(num1.real + num2.real, num1.imag + num2.imag);
        System.out.println("First complex number: " + num1);
        System.out.println("Second complex number: " + num2);
        System.out.println("Sum of complex numbers: " + sum);
    }
}