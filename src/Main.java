import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers=new ArrayList<>();
        Random random=new Random();
        ArrayList<Integer>jupSandar=new ArrayList<>();
        ArrayList<Integer>takSandar=new ArrayList<>();
        for (int i = 0; i <= 50; i++) {
            integers.add(i, random.nextInt(100));
            if(integers.get(i)%2==0){
               jupSandar.add(integers.get(i)) ;
            }else if(integers.get(i)%2==1){
                takSandar.add(integers.get(i));
            }
        }
        System.out.print("jup sandar: "+jupSandar+" ");
        System.out.println();
        System.out.print("tak sandar: "+takSandar+" ");
    }
}