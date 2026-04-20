package Assignment16;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorDemo {
    public static void main(String[] args) throws Exception {

        ExecutorService service = Executors.newFixedThreadPool(5);
        List<Future<Integer>> list = new ArrayList<>();

        int[] numbers = new int[51];

        for (int i = 0; i < 51; i++) {
            numbers[i] = i + 1;
        }

        for (int i = 0; i < 51; i += 3) {
            int a = numbers[i];
            int b = (i + 1 < 51) ? numbers[i + 1] : 0;
            int c = (i + 2 < 51) ? numbers[i + 2] : 0;

            AddTask task = new AddTask(a, b, c);
            list.add(service.submit(task));
        }

        int total = 0;

        for (Future<Integer> f : list) {
            total += f.get();
        }

        System.out.println("Total Sum = " + total);

        service.shutdown();
    }
}

