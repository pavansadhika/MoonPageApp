package sample.intercls;

/**
 * Created by vinodkammara on 12/01/2023.
 */
public interface ICalculator {
    int sum(int a, int b);

    int subtraction(int a, int b);

    int multiplication(int a, int b);

    int divison(int a, int b) throws Exception;

    boolean equalIntegers(int a, int b);
}
