package Java8;
@FunctionalInterface
interface Tong{
      int tongHaiSo(int a, int b);
}
class Tongg implements Tong{

    public Tongg(int i, int i1) {
        System.out.println("bala tong: "+(i+i1));
    }

    @Override
    public int tongHaiSo(int a, int b) {
        return a+b;
    }
}
public class Lambda {
    public static void main(String[] args) {
        Tong tong= ((a, b) ->{
            return a+b;
        }) ;
        System.out.println(tong.tongHaiSo(12,3));

        Tong tong1= ((a, b) ->(a+b));
        System.out.println("tong la: "+ tong1.tongHaiSo(12,3));


    }
}
