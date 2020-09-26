package Java8;

//interface Supplier<T>{
//    T get();
//}
//
//
interface Predicate<T>{
    boolean test(T t);
}
public class Supplier_Predicate_Test {
    public static void main(String[] args) {
//        Supplier<String> supplier= ()-> String.valueOf(Math.random());
//        System.out.println(supplier.get());

        Predicate<String> predicate= s -> {
            return s.equals("2222");
        };
        System.out.println(predicate.test("2222"));
        System.out.println(predicate.test("asdd"));
  }
}
