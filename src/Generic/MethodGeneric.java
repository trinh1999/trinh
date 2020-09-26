package Generic;

public class MethodGeneric {
    public <T> void display(T[] array){
        for (T i: array){
            System.out.println(i);
        }
        System.out.println();
    }


    public static void main(String[] args) {
       Integer[] integers={2,3,4,5};
       String[] strings={"a","b","c"};
       MethodGeneric methodGeneric= new MethodGeneric();
        System.out.println("mang integers: ");
       methodGeneric.display(integers);
        System.out.println("mang string: ");
       methodGeneric.display(strings);
    }
}
