import java.util.Random;
import java.util.ArrayList;

public class BubbleSort {
    public static ArrayList<BubbleSort> list = new ArrayList<BubbleSort>();
    int num;

    public BubbleSort() {
        num = Math.abs(new Random().nextInt() % 100);
    
    }
    public static void printArray(){
        System.out.println(list);
    }
    @Override
    public String toString() {
        return num + "";
    }
    public static void bubbleSort(){
        int counter = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i; j < list.size(); j++) {
                if(list.get(i).num < list.get(j).num){
                    swap(i,j);
                    printArray();
                    counter++;
                }
            }
        }
        System.out.println("swaps made:{" + counter + "}");
    }

    public static void swap(int i, int j) {
        BubbleSort iBubble = list.get(i);
        BubbleSort jBubble = list.get(j);
        list.add(j, iBubble);
        list.add(i, jBubble);
        list.remove(i+1);
        list.remove(j+1);
    }
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            list.add(new BubbleSort());
        }
        BubbleSort.printArray();
        bubbleSort();
    }
}
