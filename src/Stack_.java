import java.util.ArrayList;

public class Stack_ {
    //The list
    public ArrayList<Object> list = new ArrayList<>();

    //is the stack empty?
    public boolean isEmpty(){
        return list.isEmpty();
    }
    // to get size
    public int getSize(){
        return list.size();
    }
    //to know the last (top) element
    public Object peek(){
        if (!list.isEmpty()){
            return "Last item: " + list.get(getSize()-1);
        }else {
            return "Stack empty!";
        }
    }
    //to add new element
    public void push(Object o){
        list.add(o);
    }
    //to remove an element
    public Object pop(){
        if (!list.isEmpty()){
            return "popped last item: " + list.remove(getSize()-1);
        }else{
            return "Stack empty!";
        }
    }
    //find an item (index)
    public Object search(Object o){
        if (!list.isEmpty() && list.contains(o)){
            return o + "'s position: " + list.indexOf(o);
        }else{
            return o + " not found!";
        }
    }
    //to print out
    @Override
    public String toString(){
        if (!list.isEmpty()){
            return "The Stack: " + list.toString();
        }else{
            return "Stack empty!";
        }
    }

    //Test
    public static void main(String[] args) {
        Stack_ stack1 = new Stack_();
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        stack1.push(7);
        stack1.push("peanut");

        System.out.println(stack1.toString());
        System.out.println("Stack size: "+stack1.getSize());
        System.out.println(stack1.peek());
        System.out.println(stack1.pop());
        System.out.println(stack1.toString());
        System.out.println("Stack size: "+stack1.getSize());
        System.out.println(stack1.peek());
        System.out.println(stack1.search("peanut"));
        System.out.println(stack1.search(3));

    }
}
