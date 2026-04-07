//ArrayList
import java.util.ArrayList;
import java.util.Arrays;
// remove add number
public class List1 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,2,2,2,3,4,5,6));
        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0){
                list.remove(list.get(i));
                i--;
            }
        }
        System.out.println(list);

    }
}