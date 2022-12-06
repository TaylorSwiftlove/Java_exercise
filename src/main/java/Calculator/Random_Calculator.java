package Calculator;

import java.util.Random;

public class Random_Calculator extends Calculator_Class{
    private int a;
    private int rand;

    Random_Calculator(int a, int b) {
        // 자식 -> 부모생성자 호출
        super(a, b);
        rand = b;
    }

    // 오버로딩
    public int divide(){
        if(rand == 0) throw new ArithmeticException("랜덤 숫자가 0입니다");
        return super.divide();
    }
}