package Greedy;

import java.util.PriorityQueue;

public class FractionalKnapsack {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {

        // index , profit
        PriorityQueue<double[]> pq = new PriorityQueue<>(
                (a,b) ->Double.compare(b[1] , a[1]));

        for(int i = 0;i<val.length;i++){
            pq.add(new double[]{i,(double)val[i]/(double)wt[i]});
        }

        double profit = 0;

        while(capacity > 0 && !pq.isEmpty()){
            double[]  temp = pq.poll();
            int idx = (int)temp[0];
            double amount = temp[1];

            if(wt[idx]<=capacity){
                profit += wt[idx] * amount;
                capacity -= wt[idx];
            }
            else{
                profit += amount * capacity;
                capacity = 0;
            }
        }

        return profit;

    }
}



//
//Given two arrays, val[] and wt[] , representing the values and weights of items,
// and an integer capacity representing the maximum weight a knapsack can hold,
// determine the maximum total value that can be achieved by putting items in the knapsack.
// You are allowed to break items into fractions if necessary.
//Return the maximum value as a double, rounded to 6 decimal places.
//
//Examples :
//
//Input: val[] = [60, 100, 120], wt[] = [10, 20, 30], capacity = 50
//Output: 240.000000
//Explanation: By taking items of weight 10 and 20 kg and 2/3 fraction of 30 kg.
// Hence total price will be 60+100+(2/3)(120) = 240
