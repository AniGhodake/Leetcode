class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
            int n = edges.length;

        // Distance arrays to store shortest distance from node1 and node2
        int[] distFromNode1 = new int[n];
        int[] distFromNode2 = new int[n];

        // Initialize distances as unvisited (Integer.MAX_VALUE)
        Arrays.fill(distFromNode1, Integer.MAX_VALUE);
        Arrays.fill(distFromNode2, Integer.MAX_VALUE);

        // Perform BFS from both nodes
        bfs(edges, node1, distFromNode1);
        bfs(edges, node2, distFromNode2);

        // Now find the node with minimum max distance from both node1 and node2
        int result = -1;
        int minMaxDistance = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (distFromNode1[i] != Integer.MAX_VALUE && distFromNode2[i] != Integer.MAX_VALUE) {
                int maxDistance = Math.max(distFromNode1[i], distFromNode2[i]);
                if (maxDistance < minMaxDistance) {
                    minMaxDistance = maxDistance;
                    result = i;
                }
            }
        }

        return result;
    }

    // Helper function to perform BFS and     fill distance array
    private void bfs(int[] edges, int startNode, int[] dist) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(startNode);
        dist[startNode] = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            int next = edges[current];

            // Visit next node only if it's valid and not already visited
            if (next != -1 && dist[next] == Integer.MAX_VALUE) {
                dist[next] = dist[current] + 1;
                queue.offer(next);
            }
    }
}
}