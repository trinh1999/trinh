package BaiTapKt1.BaiTap3;

import java.io.File;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Bt3_FileReadMain {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(6);
        List<Bt3_FileRead> list = new ArrayList<>();
        //them tep vao danh sach
        String folderPath = "C:\\Users\\DELL\\Desktop\\input_3";
        File file = new File(folderPath);
        File[] listFiles = file.listFiles();
        for (int i = 0; i < listFiles.length; i++) {
            // tra ve duong dan day dau ( filepath + filename) cua file.
            list.add(new Bt3_FileRead(listFiles[i].getAbsolutePath()));
        }
        Map<String, Integer> result = new HashMap<>();
        List<Future<Map>> resultThread = executorService.invokeAll(list);
        resultThread.forEach(stringFuture -> {
            try {
                Map<String, Integer> resulFromFuture = stringFuture.get();
                resulFromFuture.forEach((s, integer) -> {
                    if (result.containsKey(s)) {
                        int count = resulFromFuture.get(s);
                        int plus = result.get(s);
                        result.put(s, count + plus);
                    } else {
                        result.put(s,  resulFromFuture.get(s));
                    }
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });

        List<Map.Entry<String, Integer>> listMap = new ArrayList<>();
        listMap.addAll(result.entrySet());
        Collections.sort(listMap, Comparator.comparing(Map.Entry::getValue));
        System.out.println("top 10 phan tu xuat hien nho nhat: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(listMap.get(i));
        }
        System.out.println("top 10 phan tu xuat hien lon nhat: ");
        for (int i = listMap.size() - 1; i > listMap.size() - 9; i--) {
            System.out.println(listMap.get(i));
        }
    }
}



