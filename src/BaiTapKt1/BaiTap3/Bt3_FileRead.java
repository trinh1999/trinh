package BaiTapKt1.BaiTap3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.concurrent.Callable;


public class Bt3_FileRead implements Callable<Map> {
    String fileName;

    Bt3_FileRead(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public Map call() throws Exception {
        Map<String, Integer> concurenHM = new HashMap<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.fileName));
            String line = bufferedReader.readLine();
            while (line != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(line, " .,!=+-", false);
                while (stringTokenizer.hasMoreTokens()) {
                    String e = stringTokenizer.nextToken();
                    if (concurenHM.containsKey(e)) {
                        int count = concurenHM.get(e) + 1;
                        concurenHM.put(e, count);
                    } else {
                        concurenHM.put(e, 1);
                    }
                }
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return concurenHM;
    }
}
