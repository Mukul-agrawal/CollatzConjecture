package collatzconjecture;

import java.util.ArrayList;

public class Collatz {
    public ArrayList<Integer> getCollatzString(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        if (num == 1) {
            return list;
        } else if (num > 0) {
            while (num != 1) {
                if (num % 2 == 0) {
                    num = num / 2;
                    list.add(num);
                } else {
                    num = 3 * num + 1;

                }
            }
        }
        return list;
    }
}
