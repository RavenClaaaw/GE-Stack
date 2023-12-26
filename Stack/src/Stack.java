public class Stack<T>{
    private LinkedList<T> list;

    Stack(){
        list = new LinkedList<>();
    }

    public void push(T value){
        list.insertAt(0, value);
    }

    public T peak(){
        return (list.head.next.value);
    }

    public T pop(){
        T value = (list.head.next.value);
        list.delete(0);
        
        return value;
    }
}
