public class reversearrayinsamearray {
    public static void main(String[] args) {


        int [] arr={10,20,15,40,25,60};


        for(int i=0;i<arr.length/2;i++)//arr.legnth=6;elemtns=0-5
        {
            int temp=arr[i];
            arr[i]=arr[(arr.length-1)-i];
            arr[(arr.length-1)-i]=temp;

        }


        for(int i:arr)
        {
            System.out.println(i);
        }
    }
    
}
