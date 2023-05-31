public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        // Ошибка возникала по причине попытки деления на ноль
        // Вариант решения - реализовать проверку в математической операции деления
        int c = calc.devide.apply(a, b);

        calc.println.accept(c);
    }
}