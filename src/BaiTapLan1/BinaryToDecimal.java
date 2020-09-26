package BaiTapLan1;

public class BinaryToDecimal {
    public static int convertBinaryToDecimal(String binary){
        double de=0;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)== '1'){
                int t=1;
                for (int j = 0; j < binary.length()-1-i; j++) {
                    t*=2;
                }
                de=de+t;
            }

        }
        return (int) de;
    }

    public static void main(String[] args) {
        System.out.println("Decimal la:" + convertBinaryToDecimal("1011001"));
    }
}
