import java.util.Arrays;


// Question :- Find the number of the triangles that can be formed by the 3 different elements as a length of three sides of triangle


public class numbers_of_triangle {
    public static void main(String[] args) {

        
        int arr[]={2,4,5,6,7};


     //   unsorted(arr); // if array is unsorted than we have to check every condition

      //  sorted(arr);  // If array is sorted than we have to check if sum of 2 smaller side 
                      // is greater than the third side.....and the array is in sorted order
                      // so we can just do arr[i]+arr[j]>arr[k]

       lesstimecomplexity(arr);

    }
    public static void unsorted(int [] arr) 
    {
        int count=0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    if(arr[i]+arr[j]>arr[k] && arr[j]+arr[k]>arr[i] && arr[i]+arr[k]>arr[j])
                    {
                        //to print the triangle
                        System.out.println(arr[i]+" "+ arr[j]+" "+ arr[k]);
                        count++;
                    }
                }
            }
        }
        System.out.println("count is "+ count);
    }

    public static void sorted(int [] arr)
    {
        Arrays.sort(arr);

        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    if(arr[i]+arr[j]>arr[k])
                    {
                        System.out.println(arr[i]+" "+ arr[j]+" "+ arr[k]);
                        count++;
                    }
                }
            }
        }
        System.out.println("count is "+count);
    }
   
    public static void lesstimecomplexity(int [] arr)
    {
        // prerequisite your array should in sorted order

        Arrays.sort(arr);

        int count=0;

        for(int i=arr.length-1;i>=0;i--)
        {
            int left=0;
            int right=i-1;

            while(left<right)
            {
                if(arr[left]+arr[right]>arr[i])
                {
                    count=count+ (right-left);

                    //if you want to print the subset also than apply the loop from left to right
                    //but the time complexity will increase

                    right--;
                }
                else
                {
                    left++;
                }

            }
        }
        System.out.println(count);
    }

}
