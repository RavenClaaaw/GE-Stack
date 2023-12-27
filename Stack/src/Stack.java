public class Stack<T>{
    private LinkedList<T> list;

    public static void main(String[] args) {
        System.out.println("-- STACK --");
        Stack<Integer> stk = new Stack<>();

        stk.push(1);
        stk.push(2);
        stk.push(3);
        
        stk.display();
        System.out.println("\nTOP: "+stk.peak());
        stk.pop();

        stk.display();
        System.out.println("\nTOP: "+stk.peak());
    }

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

    public void display(){
        list.display();
    }
}
