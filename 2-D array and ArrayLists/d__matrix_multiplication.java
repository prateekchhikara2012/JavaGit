public class d__matrix_multiplication {
    public static void main(String[] args) {
        int one [][]={
            // {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}
            {1,2,3},{4,5,6}
        };

        int two [] []={
            // {1,2},{3,4},{5,6},{7,8}
            
        };

        int arr[][]=new int [one.length][two[0].length];

        for(int i=0;i<one.length;i++)
        {
            for(int j=0;j<two[0].length;j++)
            {
                for(int k=0;k<one[0].length;k++)
                {
                   arr[i][j]=one[i][k]*two[k][j]+arr[i][j];
                 
                } 
            }
        }
        for(int i=0;i<one.length;i++)
        {
            for(int j=0;j<two[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
