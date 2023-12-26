public class Stack<T>{
    private LinkedList<T> list;

    Stack(){
        list = new LinkedList<>();
    }

    public void push(T value){
        list.add(value);
    }
}
