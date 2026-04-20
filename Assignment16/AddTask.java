package Assignment16;

import java.util.concurrent.*;
import java.util.*;

class AddTask implements Callable<Integer> {
    int a, b, c;

    AddTask(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Integer call() {
        return a + b + c;
    }
}

