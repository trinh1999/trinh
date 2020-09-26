package BaiTapKt1.BaiTap8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class DocFile {
    public static Map<String, Country> map1 = new HashMap<>();
    public static Map<Integer, City> map2 = new HashMap<>();

    public static void readFileCities() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\DELL\\Desktop\\input_8\\cities.dat"));
            String line = reader.readLine();
            while (line != null) {
                City city = conversToCity(line);
                map2.put(city.getId(), city);
                line = reader.readLine();

            }
//            System.out.println(map2);
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void readFileCountries() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\DELL\\Desktop\\input_8\\countries.dat"));
            String line = reader.readLine();
            while (line != null) {
                Country country = conversToCountry(line);
                map1.put(country.getCode(), country);
                line = reader.readLine();

            }
            System.out.println(map1);
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static Country conversToCountry(String line) {
        Country country = new Country();
        Pattern pattern = Pattern.compile("([a-zA-Z]+)=([a-zA-Z_0-9 .]+)");

        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            String fieldGroup = matcher.group(1);
            String valueGroup = matcher.group(2);
            switch (fieldGroup) {
                case "code":
                    country.setCode(valueGroup);
                    break;
                case "name":
                    country.setName(valueGroup);
                    break;
                case "continent":
                    country.setContinent(valueGroup);
                    break;
                case "surfaceArea":
                    country.setSurfaceArea(Double.parseDouble(valueGroup));
                    break;
                case "population":
                    country.setPopulation(Integer.parseInt(valueGroup));
                    break;
                case "gnp":
                    country.setGnp(Double.parseDouble(valueGroup));
                    break;
                case "capital":
                    country.setCapital(Integer.parseInt(valueGroup));
                    break;
            }
        }

        return country;

    }

    public static City conversToCity(String line) {
        City city = new City();
        Pattern pattern = Pattern.compile("([a-zA-Z]+)=([a-zA-Z_0-9 .]+)");

        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            String fieldGroup = matcher.group(1);
            String valueGroup = matcher.group(2);
            switch (fieldGroup) {
                case "id":
                    city.setId(Integer.parseInt(valueGroup));
                    break;
                case "name":
                    city.setName(valueGroup);
                    break;
                case "population":
                    city.setPopulation(Integer.parseInt(valueGroup));
                    break;
                case "countryCode":
                    city.setCountrycode(valueGroup);
                    break;
            }
        }

        return city;

    }



}
