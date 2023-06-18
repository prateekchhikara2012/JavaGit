public class c__spiral {
    public static void main(String[] args) {
        int arr[] []={{10,20,30,40},{50,60,70,80},{90,100,110,120},{130,140,150,160},{170,180,190,200}};
        
        int min_row=0 , min_col=0,max_row=arr.length-1 , max_col=arr[0].length-1;

        int total=(arr[0].length*arr.length);
        int count=0;
        while(count<total)
        {
            for(int i=min_row;i<=max_row && count<total;i++   )
            {
                System.out.print(arr[i][min_col]+" ");
                count++;
            }
            min_col++;

            for(int i=min_col;i<=max_col && count<total;i++)
            {
                System.out.print(arr[max_row][i]+" ");
                count++;
            }
            max_row--;

            for(int i=max_row;i>=min_row && count<total;i--)
            {
                System.out.print(arr[i][max_col]+" ");
                count++;
            }
            max_col--;

            for(int i=max_col;i>=min_col && count<total;i--)
            {
                System.out.print(arr[min_row][i]+" ");
                count++;
            }
            min_row++;
        }


    }
    
}
