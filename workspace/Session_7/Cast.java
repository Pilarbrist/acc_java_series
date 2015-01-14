import java.util.ArrayList;

public class Cast {

	public static void main(String[] args) {
	    ArrayList<Integer> a = new ArrayList<>();
	    a.add(3);
	    a.add(8);
        System.out.println("element 0 is " + a.get(0).getClass() 
        		+ " with value " + a.get(0));
        System.out.println("element 1 is " + a.get(1).getClass() 
        		+ " with value " + a.get(1));
        Integer x = (Integer) a.get(1);
	}

}
