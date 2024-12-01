import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class Basic
{
    public static void main(String[] args) {
        System.out.println("checking collection program");
        List<Integer> x=new ArrayList<>();
        x.add(1);
        x.add(2);
        x.add(3);
        x.add(4);
        x.add(5);
        x.add(3);
        // x.remove(1);
///iterator way traversal
        // Iterator<Integer> y=  x.iterator();
        // while(y.hasNext())
        // {
        //     int a=y.next();
        //     if(a==3) continue;
        //     System.out.println("printing element;"+a);
        // }
 //for each method
//  x.forEach((Integer val)->System.out.println("printing element value:"+ val));       
//foreach loop
for(int it:x) System.out.println("print elements:"+it +"and max value"+ Collections.max(x));


    }
}