package Graph;

import java.util.*;

public class Dijkstra {

    static class Pair {
        int dis;
        int parent;

        Pair(int dis, int parent) {
            this.dis = dis;
            this.parent = parent;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[m][3];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] a : grid) {
            int u = a[0];
            int v = a[1];
            int w = a[2];
            adj.get(u).add(new int[]{v, w});
            adj.get(v).add(new int[]{u, w});
        }

        Pair[] dist = new Pair[n + 1];

        for (int i = 0; i < dist.length; i++) {
            dist[i] = new Pair(Integer.MAX_VALUE, 0);
        }

        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        q.add(new int[]{1, 0});


        while (!q.isEmpty()) {
            int[] arr = q.poll();


            int node = arr[0];
            int wt = arr[1];
            if (wt > dist[node].dis) continue;


            for (int[] it : adj.get(node)) {

                int node2 = it[0];
                int wt2 = it[1];

                if (dist[node2].dis > wt2 + wt) {
                    dist[node2].dis = wt2 + wt;
                    dist[node2].parent = node;
                    q.add(new int[]{node2, wt2 + wt});
                }

            }
        }

        int node = n;

        if (dist[n].dis == Integer.MAX_VALUE) {
            System.out.println(-1);
            return;
        }

        ArrayList<Integer> path = new ArrayList<>();
        path.add(n);
        while (node != 1) {

            node = dist[node].parent;
            path.add(node);
        }

        Collections.reverse(path);

        for (int it : path) {
            System.out.print(it + " ");
        }

    }

}