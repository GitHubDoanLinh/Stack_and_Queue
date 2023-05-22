package Stack_and_Queue;

public class MyArrayStack implements I_Stack_Queue{

    private int[] array;
    private int sise;
    private int topIndex;

    MyArrayStack(int size){
        this.sise  = size;
        array = new int[size];
        topIndex = -1;
    }

    @Override
    public boolean push(int value) {
        if(!isFull()){
            topIndex++;
            array[topIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if(!isEmpty()){
            int value = array[topIndex];
            topIndex--;
            return value;
        }
        return -1;
    }

    @Override
    public boolean isFull() {
        return topIndex == sise-1;
    }

    @Override
    public boolean isEmpty() {
        return topIndex<0;
    }

    @Override
    public void show() {
        if(isEmpty()){
            System.out.println("Stack is empty!");
        }
        else {
            for(int i=0; i<=topIndex;i++){
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }
    }
}
