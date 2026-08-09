import java.util.*;

class Pair {
    int value;
    int index;

    Pair(int value, int index) {
        this.value = value;
        this.index = index;
    }
}

class MyComparator implements Comparator<Pair> {

    public int compare(Pair a, Pair b) {

        if (a.value != b.value) {
            return Integer.compare(a.value, b.value);
        }

        return Integer.compare(a.index, b.index);
    }
}

class Solution {
    public int[] getFinalState(int[] arr, int k, int mul) {

        PriorityQueue<Pair> q = new PriorityQueue<>(new MyComparator());

        for (int i = 0; i < arr.length; i++) {
            q.add(new Pair(arr[i], i));
        }

        while (k > 0) {

            Pair t = q.poll();

            t.value = t.value * mul;

            q.add(t);

            k--;
        }

        int[] ans = new int[arr.length];

        while (!q.isEmpty()) {

            Pair t = q.poll();

            ans[t.index] = t.value;
        }

        return ans;
    }
}