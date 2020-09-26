package Java8;

interface Consumer<T>{
 void chapNhan(T t);
}


public class ConsumerTest {
    static void intGiaTri(String val){
        System.out.println(val);
    }

    public static void main(String[] args) {
        Consumer<String> consumer= new Consumer<String>() {
            @Override
            public void chapNhan(String s) {
                System.out.println("22222, "+ s);
            }
        };
        consumer.chapNhan("baby");

        Consumer<String> consumer1= (String ten) -> System.out.println("22222 theo lambda: "+ ten);
        consumer1.chapNhan("baby1");

        Consumer<String> consumer2= ConsumerTest::intGiaTri;
        consumer2.chapNhan("baby2 theo method reference haha");

    }
}
