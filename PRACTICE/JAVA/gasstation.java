class gasstation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int startindex=-1;
        int ans=-1;
        for(int i=0;i<gas.length;i++)
        {
            if(gas[i]>cost[i])
            {
                ans=i;
                startindex=i;
                break;
            }
        
        }
        if(ans==-1)
          return -1;
        int i=0;
        int tank=0;
       while(ans!=startindex)
       {
           if(i==0)
           {
               tank=gas[startindex];
               startindex=startindex+1 %gas.length;
               continue;
           }
            if(tank<cost[startindex+1%gas.length])
           {
              return -1;
           }
           tank=tank-cost[startindex-1%gas.length]+gas[startindex%gas.length];
           i++;
           startindex=startindex+1%gas.length;  
       }

       return ans;
    }
    public static void main(String[] args) {
        int[] gas={2,3,4};
        int[] cost={3,4,3};
    
        System.out.println(canCompleteCircuit(gas, cost));
    }
} 
