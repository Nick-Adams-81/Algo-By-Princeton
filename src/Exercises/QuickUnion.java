package Exercises;

public class QuickUnion {

    private int[] id;

    // tc: O(n) linear, too slow for large trees
    public QuickUnion(int n) {
        id = new int[n];
        for(int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    private int root(int i ) {
        while(i != id[i]) {
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}
