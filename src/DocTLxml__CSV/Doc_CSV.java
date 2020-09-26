package DocTLxml__CSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Doc_CSV {

    private static final String COMMA_DELIMITER = ","; // Split by comma

    public static void main(String[] args) {

        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("sinhvien1.csv"));

            // How to read file in java line by line?
            while ((line = br.readLine()) != null) {
                printSV(parseCsvLine(line));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    private static void printSV(List<String> sinhvien) {
        System.out.println(
                "SinhVien [id= "
                        + sinhvien.get(0)
                        + ", firstname= " + sinhvien.get(1)
                        + " , lastname=" + sinhvien.get(2)
                        + " , marks=" + sinhvien.get(2)
                        + "]");
    }
}
