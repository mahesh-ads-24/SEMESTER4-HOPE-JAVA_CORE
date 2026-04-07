//ArrayList
import java.util.ArrayList;
import java.util.Arrays;


public class ListDuplicRemove {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>(Arrays.asList(1,2,3,4,3,4,5));
        for(int i=0;i<l.size()-1;i++){   
            for(int j=i+1;j<l.size();j++){
                if(l.get(i).equals(l.get(j))){
                    l.remove(j);
                }
            }
        }
        System.out.println(l);
    }
}