package Java8;
import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Integer value1 = null;
        Integer value2 = new Integer(12);
        // Optional.ofNullable - cho phép truyen vào giá tri null.
        Optional<Integer> a = Optional.ofNullable(value1);
        // Optional.of - ném ra loi NullPointerException neu giá tri truyen vào = null
        Optional<Integer> b = Optional.of(value2);
        System.out.println(sum(a, b));
    }
    public static Integer sum(Optional<Integer> a, Optional<Integer> b) {
        // Optional.orElse - tra ve 1 giá tri khác, neu giá tri trong optional class bang null
        Integer value1 = a.orElse(new Integer(0));
        // Optional.get - tra ve giá tri bên trong optional class
        Integer value2 = b.get();
        return value1 + value2;
    }

}
