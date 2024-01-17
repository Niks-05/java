import java.util.Scanner; 
 class LoopsProgram 
{ 
    public static void main (String [] args) 
    { 
        Scanner sc = new Scanner (System.in); 
        System.out.println ("What is your name?"); 

        String name = sc.nextLine();
        System.out.println("Name : "+name+" & length : "+name.length());

        System.out.println(name); 
        int length = name.length (); 
        String result = "";

        for (int i = length-1; i >= 0; i--)
        { 
            result+=name.charAt(i);
        } 
                  System.out.println(result); 

    }
}




