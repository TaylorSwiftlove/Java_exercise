package Calculator;
import java.util.Random;

public class Random_num_gen implements NumberGenerator{
    @Override
    public int generate_num() {
        Random random = new Random();
        int rand = random.nextInt(10);
        return rand;
    }
}
