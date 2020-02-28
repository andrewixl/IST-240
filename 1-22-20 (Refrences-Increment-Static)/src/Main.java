public class Main 
{
    public static void main(String[] args)
    {
        BankAccount ba1 = new BankAccount();
        BankAccount ba2 = new BankAccount();
    	
        System.out.println(BankAccount.getLastAccountGiven());
    	System.out.println(ba1.getMyBankAccount());
    	System.out.println(ba2.getMyBankAccount());
    	
    	
    	
    	Professor prof = new Professor("Margaret", "Hamilton");
        //Creates copy of prof.
//        Professor prof2 = new Professor(prof);
        
        Professor prof2 = prof;
        
        System.out.println(prof);
        System.out.println(prof2);

    }
}