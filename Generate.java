import java.util.ArrayList;
import java.util.Random;

public class Generate{
    protected static final ArrayList<String> colors = new ArrayList<>();

    static {
        colors.add("r");
        colors.add("g");
        colors.add("y");
        colors.add("b");
        colors.add("p");
        colors.add("a");
    }
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
