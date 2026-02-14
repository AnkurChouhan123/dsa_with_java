package Greedy;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.HashSet;
public class JobSequencing {
    static class Pair{
        private int profit;
        private int deadLine;
        Pair(int profit,int deadLine){
            this.profit=profit;
            this.deadLine=deadLine;
        }
    }
   static public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        PriorityQueue<Pair>q=new PriorityQueue<>((a,b)->b.profit-a.profit);
        ArrayList<Integer>list=new ArrayList<>();
        boolean slot[]=new boolean[max(deadline)+1];
        int job=0;
        int maxProfit=0;


        for(int i=0;i<deadline.length;i++){
            q.add(new Pair(profit[i],deadline[i]));
        }

        while(!q.isEmpty()) {
            Pair p = q.poll();
            int dl = p.deadLine;
            for (int i = dl; i > 0; i--) {
                if (!slot[i]) {
                    slot[i]=true;
                    maxProfit += p.profit;
                    job++;
                    break;
                }
            }
            //System.out.println(maxProfit + "...." + job);

        }
        list.add(job);
        list.add(maxProfit);
        return list;
    }
   static int max(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int num:arr){
            max=Math.max(max,num);
        }

        return max;
    }

    public static void main(String[] args) {
       int deadline[] = {3, 1, 2, 2}, profit[] = {50, 10, 20, 30};
        System.out.println(jobSequencing(deadline,profit));
    }
}
