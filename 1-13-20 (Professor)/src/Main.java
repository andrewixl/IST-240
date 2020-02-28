public class Main 
{
    public static void main(String[] args)
    {
        Professor prof = new Professor("Fred", "Fonseca");
        // prof.givenName = "Fred";
        System.out.println(prof.givenName);

        Professor prof2 = new Professor("Shawn", "Smith");
        // prof.givenName = "Shawn";
        System.out.println(prof2.givenName);

        // List<String> stringList = new ArrayList<>();
        // stringList.add("Rock");
        // stringList.add("Scissors");
        // stringList.add("Paper");

        // for(int i = 0; i< stringList.size(); i++)
        // {
        //     System.out.println(stringList.get(i));
        // }

        // for(String s : stringList)
        // {
        //     if(s.equals("Scissors"))
        //     {
        //         System.out.println(s);
        //     }
        // }
    }
}