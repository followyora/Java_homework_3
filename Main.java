import static java.lang.Integer.sum;

public class Main {
    public static void main(String[] args) {

        String simpleString = new String("I study Basic Java!");
        System.out.println(simpleString);
        System.out.println(simpleString.length());

        System.out.println(simpleString.charAt(18));

        System.out.println(simpleString.contains("Java"));

        System.out.println(simpleString.replace('a', 'o'));

        System.out.println(simpleString.toUpperCase());

        System.out.println(simpleString.toLowerCase());

        System.out.println(simpleString.substring(0, 13) + "!");


        /** int index = simpleString.indexOf("Java");
         System.out.println(simpleString.substring(index)); **/

        System.out.println();
        System.out.println();

        System.out.println("_____________#2____________");
        System.out.println();
        System.out.println();

        System.out.println(sum(50, 5));

        System.out.println(substraction(15, 5));

        System.out.println(multiplication(60, 60));

        System.out.println(divison(80, 5));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int substraction (int a, int b) {
        return a-b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int divison(int a, int b) {
        return a / b;
    }


}
