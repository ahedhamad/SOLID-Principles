package open_closed;

import open_closed.Impements.*;


public class App {
    public static void main(String[] args) {


        Calculator calculator = new Calculator();
        calculator.addNumber(1);
        calculator.addNumber(3);
        calculator.addNumber(5);
        calculator.addNumber(2);
        calculator.addNumber(9);
        calculator.addNumber(1);

        Addition addition= new Addition();
        Count count = new Count();
        Max max =new Max();
        Min min = new Min();
        Multiplication multiplication=new Multiplication();

        System.out.println("Numbers  " + calculator.getNumbers()) ;
        System.out.println("Addition  " + addition.results(calculator.getNumbers())) ;
        System.out.println("Multiplication  " + multiplication.results(calculator.getNumbers()));
        System.out.println("Count  " + count.results(calculator.getNumbers()));
        System.out.println("Max  " +  max.results(calculator.getNumbers()));
        System.out.println("Min  " + min.results(calculator.getNumbers()));
    }
}
