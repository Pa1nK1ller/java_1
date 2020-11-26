package lesson1;

public class Main {

    public static void main(String[] args) {
//        printHelloWorld();
//        testVars();
//        testInc();
        int a = 1;
        int b = 2;
        int result = calcSum(a, b);
    }

    public static void printHelloWorld() {
        System.out.println("Hello, world!");
    }

    private static void testVars() {
        int varA;
        varA = 3;
        int varB = 7;
        int result = varB + varA;
        System.out.println(result);

        double doubleVarA = 3.0;
        float doubleVarB1 = 7f;
        double doubleVarB = 7;
        System.out.println(doubleVarB / doubleVarA);

        byte a = 127;

    }

    private static void testInc() {
        int c = 0;
        c++;

    }


    private static int calcSum(int a, int b) {
        return 0;
    }


}
