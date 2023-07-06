public class n__count_palindrome_substring_n_square {
    public static void main(String[] args) {
        String s="nitinn";

        //odd substring length
        int count_odd=0;
        for(int i=0;i<s.length();i++)
        {
            int left=i;
            int right=i;

            while(left>=0 && right<s.length())
            {
                if(s.charAt(left)==s.charAt(right))
                {
                    count_odd++;
                    // System.out.println(right-left+1);  //to find the individual substring length
                }
                else
                {
                    break;
                }
                left--;
                right++;
            }
        }
         
        //even substring length

        int count_even=0;
        for(double i=0.5 ;i<s.length();i++)
        {
            double left=i-0.5;
            double right=i+0.5;

            while(left>=0 && right<s.length())
            {
                if(s.charAt((int)(left))==s.charAt(((int)right)))
                {
                    count_even++;
                   // System.out.println((int)(right-left+1)); to find the individual substring length of even case
                }
                else
                {
                    break;
                }
                left--;
                right++;
            }

        }

         System.out.println(count_odd+count_even);
        
    }
    
}
