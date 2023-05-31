public class reversearrayindifferentarray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};//arrlneght=6
        int abc[]=new int[arr.length];


        
        for(int i=arr.length-1;i>=0;i--)
        {
            abc[(arr.length-1)-i]=arr[i];
        }


        for(int i:abc)
        {
            System.out.println(i);
        }
    }
    
}
