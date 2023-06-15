public class Alex_Goes_Shopping
{
    public static void main(String[] args) 
    {
        
            int arr[]={100,200,400,100};
    
            int items[]={100,200,500,600,800,1200};
            int type[]={2,3,4,4,4,1};
    
            for(int i=0;i<items.length;i++)//
            {
                int count=0;
                for(int j=0;j<arr.length;j++)
                {
                    if(items[i]%arr[j]==0)
                    {
                        count++;
                    }
    
                }
    
                if(type[i]<=count)
                {
                    System.out.println("Yes");
                }
                else
                {
                    System.out.println("No");
                }
            }
        
    }
}

// //       -----Second methord----(with making a new array)
// //public class Alex_Goes_Shopping {
//     public static void main(String[] args) {
//         int arr[]={100,200,400,100};
//         int money[]={100,200,500,600,800,1200};
//         int chosse[]={2,3,4,4,4,1};

//         String out[]=new String [chosse.length];


//         for(int i=0;i<money.length;i++)
//         {
//             int count=0;
//             for(int j=0;j<arr.length;j++)
//             {
//                 if(money[i]%arr[j]==0)
//                 {
//                     count++;//4
                    
//                     if(chosse[i]<=count)
//                     {
//                         out[i]="Yes";
//                     }

//                     else
//                     {
//                         out[i]="No";
//                     }

//                 }
//             }




//         }
//         for(String i :out)
//         {
//             System.out.println(i);
//         }

        

//     }
    
// }




