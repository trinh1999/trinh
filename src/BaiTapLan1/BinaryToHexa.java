package BaiTapLan1;

public class BinaryToHexa {
        public static String convertBinaryToHexa (String binary) {
            long de = 0;
            for (int i = 0; i < binary.length(); i++) {
                if (binary.charAt(i) == '1') {
                    int t = 1;
                    for (int j = 0; j < binary.length() - 1 - i; j++) {
                        t *= 2;
                    }
                    de = (de + t);
                }

            }
            int t = (int) de;
            char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                    'A', 'B', 'C', 'D', 'E', 'F'};
            // kt chuoi bđ
            String hex = "";
            while (t != 0) {
                int i = (t % 16);
                hex = hexDigits[i] + hex;
                t = t / 16;
            }
            return hex;
        }
    public static void main(String[] args) {

        System.out.println(convertBinaryToHexa("0011101100101001"));
    }
}