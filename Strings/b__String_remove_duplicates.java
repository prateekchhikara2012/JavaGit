import java.util.*;

public class b__String_remove_duplicates
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String a=sc.next();

        ArrayList <Character> list=new ArrayList <> ();

        for(int i=0;i<a.length()-1;i++)
        {
            if(a.charAt(i)==a.charAt(i+1));
            else
            {
                list.add(a.charAt(i));
            }
        }

        list.add(a.charAt(a.length()-1));
        System.out.println(list.size());
        
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i));    
        }

        sc.close();
    }
}