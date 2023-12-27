public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("-- STACK --");
        // Stack<Integer> stk = new Stack<>();

        // stk.push(1);
        // stk.push(2);
        // stk.push(3);
        
        // System.out.println(stk.peak());

        System.out.println("-- QUEUE --");
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("\nFRONT:- " + queue.front());
        queue.display();
        queue.dequeue();
        System.out.println("\nFRONT:- " + queue.front());
        queue.display();
    }
}
