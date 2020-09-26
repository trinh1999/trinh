package vn.vccorp.adopt.test;

public class DemKiTu {
    public final String FINAL_VARIABLE ="abc";
    public static String STATIC_STR = "123";

    public static void main(String[] args) {
//        String s = "32";
//        int a = Integer.parseInt(s);
//        System.out.println(s+123);
//        System.out.println(s);

       // int a=2;
        String abc ="djfeiie9237hdnvnnkk;080'20302222";
        int dem[] = new int [255];
        char array[] = abc.toCharArray();
        for(int i= 0 ;i< array.length;i++){
            dem[array[i]]++;
        }
        for(int i = 0 ;i<dem.length;i++){
            if(dem[i] != 0){
                System.out.println("Phan tu "+ (char) i +"="+dem[i]);
            }
        }
//        System.out.println(a);
//       System.out.println(a+12);

    }
}
