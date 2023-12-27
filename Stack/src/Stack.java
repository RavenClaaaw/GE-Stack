public class Stack<T>{
    private LinkedList<T> list;

    Stack(){
        list = new LinkedList<>();
    }

    public void push(T value){
        list.insertAt(0, value);
    }

    public T peak(){
        if(list.size() > 0) return (list.head.next.value);
        else return null;
    }

    public T pop(){
        T value = null;

        if(list.size() > 0) value = (list.head.next.value);
        list.delete(0);
        
        return value;
    }
}
