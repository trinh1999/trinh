package vn.vccorp.adopt.test;

@FunctionalInterface
public interface Function {
    void display();
}
class Test{
    public static void main(String[] args) {
        Function a= () -> {
            System.out.println("111");
        };
        a.display();
    }
}
