package vn.vccorp.adopt.test;

public class SoSanhBufferAndString {
    public static String string(){
        String a= "a";
        for (int i = 0; i < 10000; i++) {
           a= a+"12";
        }
        return a;
    }
    public static String stringBuffer() {
        StringBuffer stringBuffer = new StringBuffer("a");
        for (int i = 0; i < 10000; i++) {
            stringBuffer.append("12");
            stringBuffer.append("23");
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        string();
        System.out.println("Thời gian nối chuỗi của lớp String: "+
                (System.currentTimeMillis() - start) + "ms");
        start= System.currentTimeMillis();
        stringBuffer();
        System.out.println("Thoi gian nôi chuoi cua lop stringbuffer: "+
                (System.currentTimeMillis()-start)+"ms");
    }

}
