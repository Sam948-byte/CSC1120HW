import java.util.LinkedList;

public class Last8{
    private LinkedList<Integer> list = new LinkedList<Integer>();

    public void add(int a){
        list.add(a);
        if(list.size() > 8){
            list.removeFirst();
        }
    }

    public int[] last(){
        return new int[]{list.get(0), list.get(1), list.get(2), list.get(3), list.get(4), list.get(5), list.get(6), list.get(7)};
    }
}