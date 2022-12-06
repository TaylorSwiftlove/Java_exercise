package Calculator;

public class Calculator_Main {
    public static void main(String[] args) {
        Calculator_Class cc = new Calculator_Class(2, 3);
        System.out.println("plus, minus, multiple, divide : "
                + cc.plus() + " " + cc.minus() + " " + cc.multiple() + " " + cc.divide());
    }
}