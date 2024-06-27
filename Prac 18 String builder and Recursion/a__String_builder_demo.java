public class a__String_builder_demo {

    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder ("Hello");

        System.out.println(sb);//print

        System.out.println(sb.length());//length

        System.out.println(sb.charAt(2));// printing at a spceific char location

        
        sb.setCharAt(1,'z'); // setting at a specific char location
        System.out.println(sb);

        sb.insert(1,"bye"); // inserting a string in a array of characters
        System.out.println(sb+" "+ sb.length()); 


        sb.append("hi"); // inserting at a last of the string
        System.out.println(sb+" "+ sb.length());

        sb.deleteCharAt(2); // deleting at a specific char location
        System.out.println(sb);

        sb.delete(1,3); // delete a whole string from starting and ending point
        System.out.println(sb);

        System.out.println(sb.substring(1,3)); // printing a substring 
        System.out.println(sb.substring(2)); // 2 index included and goes till the sb.length()-1;
        


    }
    
}
