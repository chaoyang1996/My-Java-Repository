#Java time difference 
#on adding first Million and Second Million data to array list
import java.util.ArrayList;
public class Test
{
	
	public static void main(String[] args) 
	{
		 ArrayList list0 = new ArrayList<Integer>();
		 long start0 = System.currentTimeMillis();
		 for(int i =0;i<1000000;i++) {
			 list0.add(i);
		 }
    System.out.println(System.currentTimeMillis()-start0);
    
    long start1 = System.currentTimeMillis();
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    for(int i = 1000000;i<2000000;i++) {
    	list1.add(i);
    }
    System.out.println(System.currentTimeMillis()-start1);
}
	
	
}
