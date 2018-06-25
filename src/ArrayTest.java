import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayList<Integer> names = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int inputInt;
        System.out.println("Wprowadz liczby całkowite.");

        try {
            while (!check) {
                inputInt = input.nextInt();
                if (inputInt < 0) {
                    check = true;
                    System.out.println("Wprowadziłeś liczbę mniejszą od zera!");
                } else {
                    names.add(inputInt);
                }
            }
            System.out.println(names.toString());
            System.out.println(ArrayMethods.revert(names));
            System.out.println(ArrayMethods.sumP(names));
            System.out.println("Największy element wynosi: " + ArrayMethods.max(names));
            System.out.println("Najmniejszy element wynosi: " + ArrayMethods.min(names));

        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}
