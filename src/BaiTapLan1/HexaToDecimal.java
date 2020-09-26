package BaiTapLan1;

public class HexaToDecimal {
    public static int convertHexaToDecimal(String hexa) {
        int d = 0;
        int n = 0;

        for (int i = 0; i < hexa.length(); i++) {
            char ch = hexa.charAt(i);
            boolean valid = false;
            switch (ch) {
                case '1':
                    n = 1;
                    break;
                case '2':
                    n = 2;
                    break;
                case '3':
                    n = 3;
                    break;
                case '4':
                    n = 4;
                    break;
                case '5':
                    n = 5;
                    break;
                case '6':
                    n = 6;
                    break;
                case '7':
                    n = 7;
                    break;
                case '8':
                    n = 8;
                    break;
                case '9':
                    n = 9;
                    break;
                case 'A':
                    n = 10;
                    break;
                case 'B':
                    n = 11;
                    break;
                case 'C':
                    n = 12;
                    break;
                case 'D':
                    n = 13;
                    break;
                case 'E':
                    n = 14;
                    break;
                case 'F':
                    n = 15;
                    break;
                default:
                    valid = true;
            }
            if (valid) {
                System.out.println("Nhap sai");
                break;
            }
            d = 16 * d + n;

        }
        return d;
    }

    public static void main(String args[]) {

        System.out.println("Decimal la: " + convertHexaToDecimal("2A"));
    }

}