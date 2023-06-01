import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    //Добавлен вывод сообщения о невозможности делить на ноль,
    // в качестве результата возращаем Integer.MIN_VALUE
    BinaryOperator<Integer> devide = (x, y) -> {
        if (y == 0) {
            System.out.println("Ошибка! Делить на ноль нельзя");
            return Integer.MIN_VALUE;
        }
        return x / y;
    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
