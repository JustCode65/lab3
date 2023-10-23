import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;


public class ListsTests implements StringChecker{
    
    public boolean checkString(String s){
        if(s.charAt(0) == 'a' || s.charAt(0) == 'A'){
            return false;
        }else{
            return true;
        }
    }

    @Test
    public void testFilter(){
        StringChecker sc;
        List<String> input = new ArrayList<>();
        input.add("asdf");
        assertEquals(new ArrayList<String>(), ListExamples.filter(input, sc)); 

    }

    /*@Test
    public void testFilter2(){
        
    }*/

    @Test
    public void merge(){
        
    }

    /*@Test
    public void merge2(){
        
    }*/
}
