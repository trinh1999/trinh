package vn.vccorp.adopt.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class properties {
    public static void main(String[] args) throws Exception {
            Properties pr = new Properties();
            pr.load( new FileReader("info.properties"));
            System.out.println(pr.getProperty("ten"));
            System.out.println(pr.getProperty("tuoi"));

            Properties properties = new Properties();
            properties.setProperty("ten", "trinh");
            properties.setProperty("tuoi", "21");
            properties.setProperty("tuoi", "21");
            properties.setProperty("tuoi1", "21");
            properties.store(new FileWriter("info.properties"), "here");
    }
}
