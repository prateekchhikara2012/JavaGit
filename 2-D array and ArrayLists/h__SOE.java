public class h__SOE
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};


        boolean bo[]=new boolean[arr.length+1];




        for(int i=0;i<bo.length;i++)
        {
            bo[i]=true;
        }

        bo[0]=false;
        bo[1]=false;
        
        for(int i=2;i*i<=arr.length;i++)
        {
            if(bo[i]==false)
            continue;
            
            for(int j=2;j*i<=arr.length;j++)
            {
                bo[i*j]=false;
            }
        }

        for(int i=0;i<=bo.length-1;i++)
        {
            if(bo[i]==true)
            System.out.println(i);
        }


    }
}