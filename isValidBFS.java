import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class isValidBFS {
    public static void main(String[] args) {
      int V=4;
      int[][] edge={
              {1,2},
              {1,3},
              {2,4}
      };
      int[] arr={1,3,2,4};
      ArrayList<ArrayList<Integer>>list=new ArrayList<>();

      for(int i=0;i<=V;i++){
          list.add(new ArrayList<>());
      }

      for(int[] a:edge){
          int u=a[0];
          int v=a[1];
          list.get(u).add(v);
      }

      visited=new boolean[V+1];
      boolean valid=isValid(list,arr);

      if(valid) System.out.println("valid bfs");
      else System.out.println("invalid bfs");
    }
    static boolean[] visited;
    static boolean isValid(ArrayList<ArrayList<Integer>>list,int[]arr){
        Queue<Integer>q=new LinkedList<>();
        q.add(1);
        int[] ans=new int[arr.length];
        int i=0;
        while(!q.isEmpty()){

            int node=q.poll();
            ans[i++]=node;

            ArrayList<Integer>tempList=list.get(node);

            for(int it:tempList){
                if(!visited[it]){
                    q.add(it);
                    visited[it]=true;
                }

            }
        }
//        for(boolean num:visited){
//            if(!num) return false;
//        }
        for(int it=0;it<arr.length;it++){
            int num1=arr[it];
            int num2=ans[it];
            if(num1!=num2) return false;
        }

        return true;
    }
}
