public class Queue<T> {
    private LinkedList<T> list;

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
