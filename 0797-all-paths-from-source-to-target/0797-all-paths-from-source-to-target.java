class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int target = graph.length - 1; 
        List<List<Integer>> allPaths = new ArrayList<>();
        
        dfs(graph, 0, target, new ArrayList<>(), allPaths);
        
        return allPaths;
    }

    private void dfs(int[][] graph, int curr, int target, List<Integer> currentPath, List<List<Integer>> allPaths) {
        currentPath.add(curr);
        if (curr == target) {
            allPaths.add(new ArrayList<>(currentPath));
        } else {
            for (int neighbor : graph[curr]) {
                dfs(graph, neighbor, target, currentPath, allPaths);
            }
        }

        currentPath.remove(currentPath.size() - 1);
    }
}