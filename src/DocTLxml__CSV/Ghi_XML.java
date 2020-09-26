package DocTLxml__CSV;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.*;

public class Ghi_XML {
    public static void main(String arg[]) {

        try {
            DocumentBuilderFactory dbFactory =
                    DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();

            // tao phan tu goc có tên class
            Element rootElement = doc.createElement("class");
            // thêm thuoc tính totalStudents vào the class
            doc.appendChild(rootElement);
            Attr totalSv = doc.createAttribute("totalStudents");
            totalSv.setValue("2");
            rootElement.setAttributeNode(totalSv);

            // tao sv1
            Element sinhvien1 = doc.createElement("sinhvien");
            rootElement.appendChild(sinhvien1);
            // tao thuoc tính cho sv1
            Attr attr1 = doc.createAttribute("stt");
            attr1.setValue("1");
            sinhvien1.setAttributeNode(attr1);
            //tao the firstname
            Element firstname = doc.createElement("firstname");
            firstname.appendChild(doc.createTextNode("Vinh"));
            sinhvien1.appendChild(firstname);
            // tao the lastname
            Element lastname = doc.createElement("lastname");
            lastname.appendChild(doc.createTextNode("Phan"));
            sinhvien1.appendChild(lastname);

            // tao sv2
            Element sinhvien2 = doc.createElement("sinhvien");
            rootElement.appendChild(sinhvien2);
            // tao thuoc tính cho sv2
            Attr attr2 = doc.createAttribute("stt");
            attr2.setValue("2");
            sinhvien2.setAttributeNode(attr2);
            //tao the firstname
            Element firstname2 = doc.createElement("firstname");
            firstname2.appendChild(doc.createTextNode("Hoa"));
            sinhvien2.appendChild(firstname2);
            // tao the lastname
            Element lastname2 = doc.createElement("lastname");
            lastname2.appendChild(doc.createTextNode("Thi"));
            sinhvien2.appendChild(lastname2);

            // ghi noi dung vào file XML
            TransformerFactory transformerFactory =
                    TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(
                    new File("sinhvien.xml"));
            transformer.transform(source, result);

            // ghi ket qua ra man hinh de kiem tra
            StreamResult consoleResult = new StreamResult(System.out);
            transformer.transform(source, consoleResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}