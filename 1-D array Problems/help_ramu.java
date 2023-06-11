public class help_ramu {
    public static void main(String[] args) {

        int  deals [] = {2,3,7,19}; // money

        int rick[] ={2,5};

        int cab[]={4,3,5};


        int min_rick=Integer.MAX_VALUE;
        int min_cab=Integer.MAX_VALUE;


        int total=0;


        for(int i=0;i<deals.length;i++)
        {
            // for deal=1;
            int rickshaw=0;
            int cab_sum=0;

            
            if(i==0)
            {   
                //for rickshaw

                for(int j=0;j<rick.length;j++)//0--1
                {
                    rickshaw=rickshaw+(deals[i]*rick[j]);
                }
                min_rick=Math.min(rickshaw,min_rick);

                // for cab
                for(int j=0;j<cab.length;j++)//0--2
                {
                    cab_sum=cab_sum+(deals[i]*cab[j]);
                }
                min_cab=Math.min(cab_sum,min_cab);

            }

           else if(i==1)
            {   
                //for rickshaw
                int count=0;
                for(int j=0;j<rick.length;j++)//0--1
                {
                    count++;    
                }
                rickshaw=deals[i]*count;

                min_rick=Math.min(rickshaw,min_rick);



                // for cab
                count=0;
                for(int j=0;j<cab.length;j++)//0--1
                {
                    count++;    
                }
                cab_sum=deals[i]*count;

                min_cab=Math.min(cab_sum,min_cab);


            }

            else if(i==2)
            {
                min_rick=Math.min(min_rick,deals[i]);

                min_cab=Math.min(min_cab,deals[i]);
            }

            else
            {

                total=Math.min(deals[i], min_rick+min_cab);
            }


        }

        System.out.println(total);




    }
    
}
