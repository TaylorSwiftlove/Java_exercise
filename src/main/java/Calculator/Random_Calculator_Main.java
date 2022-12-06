package Calculator;

public class Random_Calculator_Main {
    public static void main(String[] args) {
        Random_num_gen rng = new Random_num_gen();
        Random_Calculator rc = new Random_Calculator(2, rng.generate_num());
        System.out.println("a+b = " + rc.plus());
        System.out.println("a-b = " + rc.minus());
        System.out.println("a*b = " + rc.multiple());
        System.out.println("a/b = " + rc.divide());

    }
}
