public class LinkedList<T>{
    private Node<T> head;

    LinkedList(){
        this.head = new Node<>(null);
    }

    public void add(T value){
        Node<T> node = new Node<>(value);

        Node<T> current = head;
        while(current.next != null) current = current.next;
        current.next = node;
    }

    public void insertAt(int index, T value){
        Node<T> node = new Node<>(value);
        
        if(index == -1) index = this.size();
        if(index < 0 || index > this.size()){
            System.out.println("ERROR POSITION");
            return;
        }

        Node<T> current = head;
        for(int i=0; i<index; i++) current = current.next;
        
        node.next = current.next;
        current.next = node;
    }

    public void delete(int index){
        if(index == -1) index = this.size() - 1;
        if(index < 0 || index > this.size()){
            System.out.println("ERROR POSITION");
            return;
        }

        Node<T> current = head;
        for(int i=0; i<index; i++) current = current.next;
    }

    public int search(T value){
        int index = -1;
        
        Node<T> current = head;
        while(current != null){
            if(current.value == value) return index;

            current = current.next; 
            index += 1; 
        }

        return -1;
    }

    public void display(){
        Node<T> current = head.next;
        System.out.print("\nOUTPUT: ");
        while(current != null){
            System.out.print(current.value + " "); 
            current = current.next; 
        }
    }

    public int size(){
        int size = 0;

        Node<T> current = head.next;
        while(current != null){
            size += 1;
            current = current.next; 
        }

        return size;
    }
}
