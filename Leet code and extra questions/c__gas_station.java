public class c__gas_station
{
    public static void main(String[] args) {
        int [] gas={1,2,3,4,5};
        int []cost={3,4,5,1,2};

        
       System.out.println(check(gas, cost) ); 


    }
    public static int check(int [] gas, int [] cost)
    {
        int start=0;

        int curr=0;


        int res=0;

        for(int i=0;i<gas.length;i++)
        {
            res=res+ (gas[i]-cost[i]);
            curr=curr+(gas[i]-cost[i]);

            if(curr<0)
            {
                start=i+1;
                curr=0;
            }
        }

    

        if(res<0)
        {
           return -1;
        }
        
        else
        {
           return start;
            
        }

        
        /*
          int res=0;

        for(int i=0;i<gas.length;i++)
        {
            res=res+ (gas[i]-cost[i]);

            
        }
        if(res<0)
        {
            return -1;
        }

        else
        {
            for(int i=0;i<gas.length;i++)
            {

                if(gas[i]>cost[i])
                {
                    int sum=0;
                    int j=0;
                    for( j=i;j<gas.length;j++)
                    {
                        sum=sum+(gas[j]-cost[j]);
                        if(sum>=0);
                        else
                        {
                            break;
                        }
                    }
                    if(j==gas.length)
                    {
                        return i;
                    }
                }
            }
        }
        return 0;

         */

    }
}