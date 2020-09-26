package DocTLxml__CSV;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ghi_CSV {
    // Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    // CSV file header
    private static final String FILE_HEADER = "id,firstName,lastName,marks";

    public static void main(String[] args) {

        String fileName = "sinhvien1.csv";
        writeCsvFile(fileName);
    }

    public static void writeCsvFile(String fileName) {
        // Create new Countrys objects
        SinhVien sinhVien1 = new SinhVien("1", "US", "United States","1");
        SinhVien sinhVien2 = new SinhVien("2", "VN", "Viet Nam","2");
        SinhVien sinhVien3 = new SinhVien("3", "AU", "Australia","3");

        // Create a new list of Country objects
        List<SinhVien> sinhVienList = new ArrayList<>();
        sinhVienList.add(sinhVien1);
        sinhVienList.add(sinhVien2);
        sinhVienList.add(sinhVien3);

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);

            // Write the CSV file header
            fileWriter.append(FILE_HEADER);

            // Add a new line separator after the header
            fileWriter.append(NEW_LINE_SEPARATOR);

            // Write a new Country object list to the CSV file
            for (SinhVien sinhVien : sinhVienList) {
                fileWriter.append(sinhVien.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(sinhVien.getFirstName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(sinhVien.getLastName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(sinhVien.getMarks());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

            System.out.println("CSV file was created successfully !!!");

        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }
}
