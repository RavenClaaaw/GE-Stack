public class Queue<T> {
    private LinkedList<T> list;

    public static void main(String[] args) {
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

    Queue(){
        list = new LinkedList<>();
    }

    public void enqueue(T value){
        list.insertAt(-1, value);
    }

    public T front(){
        T value = null;

        if(list.size() > 0) value = (list.head.next.value);
        return value;
    }

    public void dequeue(){
        list.delete(0);
    }

    public void display(){
        list.display();
    }
}
