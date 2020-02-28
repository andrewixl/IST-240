package Professor;
public class Main 
{
    public static void main(String[] args)
    {    	
    	Professor prof = new Professor("Margaret", "Hamilton");
        //Creates copy of prof.
//        Professor prof2 = new Professor(prof);
        
        Professor prof2 = prof;
        
        System.out.println(prof);
        System.out.println(prof2);

    }
}