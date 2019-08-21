import java.util.ArrayList;

public class Queue_ {
    //custom list
    ArrayList<Object> qList = new ArrayList<>();

    //check if lis is empty
    public boolean isEmpty(){
        return qList.isEmpty();
    }

    //check the length
    public int len(){
        return qList.size();
    }

    //add element
    public void enqueue(Object o){
        qList.add(o);
    }
    //remove FIRST element (FIFO)
    public Object dequeue() {
        if (!qList.isEmpty()) {
            return "Dequeued: " + qList.remove(0);
        } else {
            return "Queue empty!";
        }
    }
    public Object dequeueAll() {
        if (!qList.isEmpty()) {
            return "Dequeued All: " + qList.removeAll(qList);
        } else {
            return "Queue empty!";
        }
    }
    //show first element
    public Object first(){
        if (!qList.isEmpty()){
            return "First element: " + qList.get(0);
        }else{
            return "Queue empty!";
        }
    }
    //print stuff
    @Override
    public String toString(){
        return "Queue: " + qList.toString();
    }
    //TEST
    public static void main(String[] args) {
        Queue_ q1 = new Queue_();
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(23);
        q1.enqueue(25);
        q1.enqueue(26);
        q1.enqueue(32);
        q1.enqueue(222);
        q1.enqueue(2456);

        System.out.println(q1.toString());
        System.out.println("Queue length: "+ q1.len());
        System.out.println(q1.first());
        System.out.println(q1.dequeue());
        System.out.println(q1.first());
        System.out.println("Queue length: "+ q1.len());
        System.out.println(q1.toString());
        System.out.println("Queue empty?: "+ q1.isEmpty());
        System.out.println(q1.dequeue());
        System.out.println(q1.first());
        System.out.println(q1.dequeue());
        System.out.println(q1.toString());
        System.out.println(q1.dequeueAll());
        System.out.println("Queue empty?: "+q1.isEmpty());
        System.out.println(q1.dequeue());
        System.out.println("Queue length: "+ q1.len());

    }
}
