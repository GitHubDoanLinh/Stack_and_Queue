package Stack_and_Queue;

public class MyMainForLinkedListStack {
    public static void main(String[] args) {
        MyLinkedListStack stack = new MyLinkedListStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.show();

        System.out.println(stack.pop());
        stack.show();
        System.out.println(stack.pop());
        stack.show();
        System.out.println(stack.pop());
        stack.show();
        System.out.println(stack.pop());
        stack.show();

    }
}
