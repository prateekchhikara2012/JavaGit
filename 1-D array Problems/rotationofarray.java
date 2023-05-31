public class rotationofarray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        int temp=0;



        //  only one rotation is done you can do many rotation according to 
       //   yourself by aplpying the outer for loop 
        temp=arr[arr.length-1];

        for(int i=arr.length-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }

        arr[0]=temp; 

        for(int i: arr)
        {
            System.out.println(i);
        }



    }
    
}
