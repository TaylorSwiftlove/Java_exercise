package Calculator;

public class Calculator_Class {
    private int a, b;
    Calculator_Class(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int plus(){
        return a+b;
    }
    public int minus(){
        return a-b;
    }
    public int multiple(){
        return a*b;
    }
    public int divide(){
        return a/b;
    }
}
