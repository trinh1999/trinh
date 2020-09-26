package DocTLxml__CSV;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Doc_XML {
    public static void main(String[] args) {
        List<SinhVien> listStudents = Doc_XML.readListSv();
        for (SinhVien student : listStudents) {
            System.out.println(student.toString());
        }
    }

    public static List<SinhVien> readListSv() {
        List<SinhVien> listStudents = new ArrayList<>();
        SinhVien sinhvien = null;

        try {
            // doc file input.xml
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document document = dBuilder.parse(new File("vaora.xml"));
            document.getDocumentElement().normalize();

            // in phan tu goc ra màn hình
            System.out.println("phan tu goc:"
                    + document.getDocumentElement().getNodeName());

            // doc all ptu co ten svien
            NodeList nodeListSv = document.getElementsByTagName("sinhvien");

            // duyet cac ptu sv
            for (int i = 0; i < nodeListSv.getLength(); i++) {
                sinhvien = new SinhVien();
                // doc cac thuoc tinh cua sv
                Node nNode = nodeListSv.item(i);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    sinhvien.setId(eElement.getAttribute("id"));
                    sinhvien.setFirstName(eElement.getElementsByTagName("firstname")
                            .item(0).getTextContent());
                    sinhvien.setLastName(eElement.getElementsByTagName("lastname")
                            .item(0).getTextContent());
                    sinhvien.setMarks(eElement.getElementsByTagName("marks")
                            .item(0).getTextContent());
                }
                // add sinh vien vào listStudents
                listStudents.add(sinhvien);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listStudents;
    }
}
