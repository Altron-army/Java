import java.util.PriorityQueue;

public class Pq {
    public static void main(String[] args) {
        System.out.println("checking priorty queue");
        //min pq
        // PriorityQueue<Integer> x=new PriorityQueue<>();
        //max pq
        PriorityQueue<Integer> x=new PriorityQueue< >((Integer a, Integer b)-> b-a);
        x.add(1);
        x.add(12);
        x.add(23);
        x.add(14);
        x.add(50);
        x.add(17);
        while(!x.isEmpty())
        {
            int val=x.poll();
            System.out.println("element:"+ val +" "+ x.peek());
        }
    }
}
