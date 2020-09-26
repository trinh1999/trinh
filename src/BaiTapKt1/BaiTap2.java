package BaiTapKt1;

import java.io.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class BaiTap2 {

    public static void addPhanTu(Map<String,Integer> map, String e){
        if(map.containsKey(e)){
            int count = map.get(e)+1;
            map.put(e,count);
        }else {
            map.put(e,1);
        }
    }


    public static void main(String[] args) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\DELL\\Desktop\\input_2\\01.txt"));
            String line = bufferedReader.readLine();
            List<String> list= new ArrayList<>();
            while (line!=null){
                StringTokenizer stringTokenizer= new StringTokenizer(line," .,!=+-", false);
                while (stringTokenizer.hasMoreTokens()){
                    String tu = stringTokenizer.nextToken();
//                    System.out.println(tu);
                    list.add(tu);
                }
                line= bufferedReader.readLine();
            }
            bufferedReader.close();
            System.out.println(list);
//            Map<String,Integer> concurenHM = new ConcurrentHashMap<>();
            Map<String,Integer> map = new HashMap<>();
            for (int i = 0; i < list.size() ; i++) {
                addPhanTu(map,list.get(i));
            }
            System.out.println(map);


//            ObjectOutputStream objectOutputStream= new ObjectOutputStream(new FileOutputStream("output.txt"));
//            objectOutputStream.writeObject(map);
//            objectOutputStream.close();

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output2.txt"));
            map.forEach((s, integer) -> {
                try {
                    bufferedWriter.append(s+" so lan xuat hien: "+integer+"\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

