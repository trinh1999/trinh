package BaiTapLan1;

public class DecimalToHexa {
    public static String convertDecimalToHexa(int decimal){
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F'};
        // kt chuoi bđ
        String hex = "";
        while (decimal != 0) {
            int i = decimal % 16;
            hex = hexDigits[i] + hex;
            decimal = decimal / 16;
        }
        return hex;
    }

    public static void main(String[] args) {
        System.out.println("Heax la:"+ convertDecimalToHexa(462));
    }
}
