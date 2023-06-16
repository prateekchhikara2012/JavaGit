public class b__wave_display {
    public static void main(String[] args) {
        int arr[] []={{10,20,30,40},{50,60,70,80},{90,100,110,120},{130,140,150,160},{170,180,190,200}};
        for(int col=0;col<arr[0].length;col++)
        {
            if(col%2==0)
            {
                int row=0;
                while(row<arr.length)
                {
                    System.out.print(arr[row][col]+ " ");
                    row++;
                }
            }
            else
            {
                int row=arr.length-1;
                while(row>=0)
                {
                    System.out.print(arr[row][col]+ " ");
                    row--;
                }
            }
            

        }


    }
    
}
