import java.util.ArrayList;
import java.util.List;

public class Main 
{
    public static void main(String[] args)
    {
        List<String> stringList = new ArrayList<>();
        
        stringList.add("Hello");
        stringList.add("How are you?");
        stringList.get(0);
        
        for (String s : stringList) {
        	System.out.println(s);
        }
    }
}