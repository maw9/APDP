package quiz_oop_p1;

public class Division {

    public void displayRemainder(int dend, int der) {
        int quo = dend / der;
        int rem = dend % der;
        System.out.printf("quotient = %5d and remainder = %5d of dividing %5d with %5d.", quo, rem, dend, der);
    }

    public static void main(String[] args) {
        Division program = new Division();
        program.displayRemainder(1000, 3);
    }

}
