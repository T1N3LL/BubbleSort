

import java.util.ArrayList;
import java.util.List;

public class BubbleStart {
    public static void main(String[] args){
        List<Integer> ints = new ArrayList<>();
        ints.add(12);
        ints.add(7);
        ints.add(52);
        ints.add(2);
        ints.add(19);
        ints.add(12);

        for(int i=0;i<ints.size()-1;i++){
            for(int j=0;j<ints.size()-1-i ;j++){
                int first = ints.get(j);
                int second  = ints.get(j+1);
                if (first>second){
                    int temp = first;
                    ints.set(j,second);
                    ints.set(j+1,temp);
                    System.out.println("Sorted");
                }
                else {System.out.println("No sorting needed");
                }


            }
        }ints.forEach(System.out::println);
    }
}
