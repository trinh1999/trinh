package BaiTapKt1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BaiTap7 {
    public static void main(String[] args) {
        String string ="https://Tiki.vn/dien-thoai-may-tinh-bang/c1789?src=mega-menu";
        Pattern pt = Pattern.compile("(http(s)?)(www)?:\\/\\/[a-zA-Z0-9]{1,}\\.[a-z]{2,6}[a-zA-Z0-9@:%_\\+.~#?&//=-]{1,}");
        System.out.println(pt.matcher(string).matches());

    }
}
