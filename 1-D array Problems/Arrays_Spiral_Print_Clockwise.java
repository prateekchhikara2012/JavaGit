public class Arrays_Spiral_Print_Clockwise {
    public static void main(String[] args) {
        int arr [] [] ={
            {11 ,12, 13, 14},
            { 21 ,22 ,23 ,24},
            {31 ,32 ,33 ,34},
            {41 ,42, 43 ,44}};


            int min_row=0;
            int min_col=0;
            int max_row=arr.length-1;
            int max_col=arr[0].length-1;

            int count=0;
            
            while(count<(arr[0].length*arr.length))
            {


                for(int i=min_col;i<=max_col && count<(arr[0].length*arr.length);i++)
                {
                    System.out.print(arr[min_row][i]+",");
                    count++;
                }
                min_row++;

                for(int i=min_row;i<=max_row && count<(arr[0].length*arr.length);i++)
                {
                    System.out.print(arr[i][max_col]+",");
                    count++;
                }
                max_col--;

                for(int i=max_col;i>=min_col && count<(arr[0].length*arr.length);i--)
                {
                    System.out.print(arr[max_row][i]+",");
                    count++;
                }
                max_row--;

                for(int i=max_row;i>=min_row && count<(arr[0].length*arr.length);i--)
                {
                    System.out.print(arr[i][min_col]+",");
                    count++;
                }
                min_col++;


            }
            System.out.println("END");

    }
    
}
