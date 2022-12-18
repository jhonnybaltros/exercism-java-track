import java.util.Objects;

public class Twofer {
    public String twofer(String name) {
        if (Objects.nonNull(name)) {
            return "One for " + name + ", one for me.";
        }
        return "One for you, one for me.";
    }
}
