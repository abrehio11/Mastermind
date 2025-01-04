import java.util.ArrayList;
import java.util.Random;
public class Code extends Generate{
    public static ArrayList<String> getCode() {
        ArrayList<String> code = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int randIndex = (random.nextInt(6));
            code.add(colors.get(randIndex));
        }
        return code;
    }
}
