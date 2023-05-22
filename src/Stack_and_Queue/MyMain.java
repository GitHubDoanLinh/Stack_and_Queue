package Stack_and_Queue;

public class MyMain {
    public static void main(String[] args) {
//        MyArrayStack myStack = new MyArrayStack(3);
////        myStack.push(1);
////        myStack.push(2);
////        myStack.push(3);
////        myStack.push(4);
////        myStack.show();
////
////        myStack.pop();
////        myStack.show();
////        myStack.pop();
////        myStack.show();
////        myStack.pop();
////        myStack.show();
//
//        System.out.println(myStack.push(1));
//        System.out.println(myStack.push(2));
//        System.out.println(myStack.push(3));
//        System.out.println(myStack.push(4));
//        myStack.show();
//
//        System.out.println(myStack.pop());
//        myStack.show(); // tra ve 1 va 2
//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());
//        myStack.show(); // Xuat ra thong bao stack í empty
//        System.out.println(myStack.pop());
//        myStack.show();

        MyArrayQueue queue = new MyArrayQueue(3);
//        queue.push(1);
//        queue.push(2);
//        queue.push(3);
//        queue.push(4);
        System.out.println(queue.push(1));
        System.out.println(queue.count());
        System.out.println(queue.push(2));
        System.out.println(queue.count());
        System.out.println(queue.push(3));
        System.out.println(queue.count());
        System.out.println(queue.push(4));
        System.out.println(queue.count());
        queue.show();
        System.out.println(queue.pop());
        System.out.println(queue.count());
        queue.show();
        System.out.println(queue.pop());
        System.out.println(queue.count());
        queue.show();
        System.out.println(queue.pop());
        System.out.println(queue.count());
        queue.show();
        System.out.println(queue.pop());
        System.out.println(queue.count());
        queue.show();
    }
}
