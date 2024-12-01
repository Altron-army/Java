import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class TestCompare implements Comparator<Test>
{
@Override
public int compare(Test a,Test b)
{
    return a.s1.compareTo(b.s1);
}
}
class Test
{
    String s1;
    String s2;
    public Test(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

} 
public class ComparatorExample {
    public static void main(String[] args) {
        System.out.println("checking for comparator");
        // Integer[] arr = {2, 7, 3, 9, 4, 6};

        // Sorting in descending order using lambda comparator
        // Arrays.sort(arr, (Integer val1, Integer val2) -> val1 - val2);

        // Test [] arr =new Test[3];
        // arr[0]=new Test("pq","cd");
        // arr[1]=new Test("ef","gh");
        // arr[2]=new Test("gf", "kl");
        // Arrays.sort(arr,(Test a,Test b)->a.s1.compareTo(b.s1));

        // for (Test it : arr) {
        //     System.out.println("printing element: " + it.s1 + "  "+ it.s2);
        // }
        List<Test> x=new ArrayList<>();
        x.add(new Test("pq","cd"));
        x.add(new Test("ef","gdkf"));
        x.add(new Test("gf","kl"));
        //method1
        Collections.sort(x,(Test a,Test b)-> a.s1.compareTo(b.s1));
        //method 2
        Collections.sort(x,new TestCompare());
        for (Test it : x) {
            System.out.println("printing element: " + it.s1 + "  "+ it.s2);
        }



    }
}
