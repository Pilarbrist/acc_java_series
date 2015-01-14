import java.util.ArrayList;

public class Cast {

	public static void main(String[] args) {
	    //ArrayList<Integer> a = new ArrayList<>(); // don't need to cast generics
	    ArrayList a = new ArrayList(); // raw ArrayList doesn't know types inside
	    a.add("3");
	    a.add(8);
        System.out.println("element 0 is " + a.get(0).getClass() 
        		+ " with value " + a.get(0));
        System.out.println("element 1 is " + a.get(1).getClass() 
        		+ " with value " + a.get(1));
        Integer x = (Integer) a.get(1); // have to cast to get out (even though Java
                                        // knows what type it is!)
	}

}
