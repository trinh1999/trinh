package BaiTapKt1.BaiTap4;

import java.io.*;
import java.util.*;

public class Main {
    public void randomPoint(Set<Point> s, Point p ,int limitKc, int sizeMax){
        Random rd = new Random();
        while(s.size() < sizeMax){
            Point point = new Point();
            point.setX(rd.nextInt(sizeMax+limitKc+p.getX()));
            point.setY(rd.nextInt(sizeMax+limitKc+p.getY()));
            if(!s.contains(point)){
                if(point.distance(point,p)<limitKc){
                    s.add(point);
                    System.out.println(point);
                }
            }
        }

    }
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        Random random = new Random();
        Point A = new Point(800, 800);
        Point B = new Point(4000, 800);
        Point C = new Point(2400, 2400);

        Set<Point> set1 = new HashSet<>();
        Set<Point> set2 = new HashSet<>();
        Set<Point> set3 = new HashSet<>();
        main.randomPoint(set1,  A, 400, 8000);
        main.randomPoint(set2,  B, 500, 10000);
        main.randomPoint(set3,  C, 600, 12000);

        Set<Point> setsum = new HashSet<>();
        setsum.addAll(set1);
        setsum.addAll(set2);
        setsum.addAll(set3);
//        System.out.println(setsum);

        List<Point> list = new ArrayList<>();
        list.addAll(setsum);
//        System.out.println(list);


        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output4.txt"));
            for (int i = 0; i < setsum.size(); i++) {
                bufferedWriter.write(String.valueOf(list.get(i)));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
    }
}
