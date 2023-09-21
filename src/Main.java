public class Main {

    public static int main(String[] args) {


        return 0;
    }

    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(12, Main.add(5, 7));
    }

    public static int add(int numOne, int numTwo) {
        return numOne + numTwo;
        int resultOne;
        resultOne = numOne + numTwo;
    }

    public static String Greeting(String name) {

        return "Bonjour1 " + name + "!";
    }

    private static int Greeting() {
        return 0;
    }

    public static int add(int numOne, int numTwo, int numThree, int numFour) {
        return add(add(numOne, numTwo), add(numThree, numFour));
    }

    // calculate the square
    public void square(int num) {
        int result = num * num;
        System.out.println(result);    // prints 576
    }

        Main obj = new Main();
        obj.square(obj.add(15, 9));

    }
}
