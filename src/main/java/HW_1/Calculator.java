package HW_1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Calculator {

    public static void main(String[] args) throws ArithmeticException {

        double purchaseAmount = -1000;
        int discountAmount = 10;
        System.out.println(calculatingDiscount(purchaseAmount,discountAmount));
    }
    // Метод возвращает сумму покупки со скидкой
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) throws ArithmeticException {
        if (purchaseAmount <= 0){
            throw new ArithmeticException("Отрицательная цена");}
        if (discountAmount < 0){
            throw new ArithmeticException("Отрицательная скидка");
        }
        else if (discountAmount > 100){
            throw new ArithmeticException("Скидка больше 100%");
        }
        return purchaseAmount / 100 * (100 - discountAmount);
    }

}

class ArithmeticException extends Exception {
    public ArithmeticException(String message) {super(message);
    }
}