import java.util.*;

class Solution {
    public long weightedSum(int[] parent, int[] nums) {

        int n = parent.length;

        // int[] malviretho = parent;

        ArrayList<Integer>[] children = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            children[i] = new ArrayList<>();
        }

        for (int i = 1; i < n; i++) {
            children[parent[i]].add(i);
        }

        int[] depth = new int[n];

        Queue<Integer> q = new LinkedList<>();

        depth[0] = 1;
        q.add(0);

        int totHeight = 1;

        while (!q.isEmpty()) {

            int node = q.poll();

            for (int child : children[node]) {

                depth[child] = depth[node] + 1;

                totHeight = Math.max(totHeight, depth[child]);

                q.add(child);
            }
        }

        long ans = 0;

        for (int i = 0; i < n; i++) {
            ans += (long) nums[i] * (totHeight - depth[i] + 1);
        }

        return ans;
    }
}