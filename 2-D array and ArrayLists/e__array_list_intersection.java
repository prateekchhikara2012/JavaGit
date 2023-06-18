import java.util.ArrayList;

public class e__array_list_intersection {
    public static void main(String[] args) {
        
        // arrays should be in sorted order and as the elements come 
        // store them in the array list and return the arraylist.

        int one[]={5,7,10,10,10,20,30,30,50,60,60,60,80};
        int two[]={10,10,15,20,30,30,30,60,70,80,80,90};

        ArrayList<Integer> list=intersection(one,two);

        System.out.println(list);
    }
    public static ArrayList <Integer> intersection(int []one ,int [] two)
    {
        ArrayList<Integer> list=new ArrayList<>();

        int i=0,j=0;
        while(i<one.length && j<two.length)
        {
            if(one[i]<two[j])
            {
                i++;
            }
            
            else if(one[i]>two[j])
            {
                j++;
            }

            else
            {
                list.add(one[i]);
                i++;
                j++;

            }

        }
        
        return list;


    }
    
}
