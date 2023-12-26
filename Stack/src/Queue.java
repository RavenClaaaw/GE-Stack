public class Queue<T> {
    private LinkedList<T> list;

    Queue(){
        list = new LinkedList<>();
    }

    public void enqueue(T value){
        list.insertAt(0, value);
    }
}
