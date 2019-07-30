import org.junit.Test;

import java.util.function.Function;

import static java.util.Calendar.*;

public class FeatureTest {
    @Test
    public void testCommon() {

    }

    @Test
    public void testStringTransform() {
        System.out.println("hello".transform(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.hashCode();
            }
        }));
    }

    @Test
    public void testStringIndent() {
        System.out.println("hello".indent(3));
    }

    @Test
    public void testSwitch() {
        int day = 2;
        switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> System.out.println(6);
            case TUESDAY -> System.out.println(7);
            case THURSDAY, SATURDAY -> System.out.println(8);
            case WEDNESDAY -> System.out.println(9);
        }


        int numLetters = switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY -> 7;
            case THURSDAY, SATURDAY -> 8;
            case WEDNESDAY -> 9;
            default -> throw new IllegalStateException("Unexpected value: " + day);
        };
    }
}
