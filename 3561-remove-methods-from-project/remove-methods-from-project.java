class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            graph.add(new ArrayList<>());
        }
        for(int []edge:invocations)
        {
            graph.get(edge[0]).add(edge[1]);
        }
        boolean []sus=new boolean[n];
        dfs(k,graph,sus);
        for(int[] edge:invocations)
        {
            int u=edge[0];
            int v=edge[1];
            if(!sus[u] && sus[v])
            {
                List<Integer> ans=new ArrayList<>();
                for(int i=0;i<n;i++)
                {
                    ans.add(i);
                }
                 return ans;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(!sus[i])
            ans.add(i);
        }
        return ans;
    }
    void dfs(int node,List<List<Integer>> graph,boolean sus[])
    {
    sus[node]=true;
    for(int next:graph.get(node))
    {
        if(!sus[next])
        {
            dfs(next,graph,sus);
        }
    }
    }
}
