import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {
			ArrayList my_list = new ArrayList();
			my_list.add("9");
			my_list.add(8);

			System.out.println(my_list.get(0) + " " + my_list.get(1));
			System.out.println(my_list.get(0).getClass());
			System.out.println(my_list.get(1).getClass());
			
		    int x = (Integer) my_list.get(1);
		    int y = Integer.parseInt((String) my_list.get(0));
		    System.out.println(x + y); 
		    
		    ArrayList<Integer> my_generic_list = new ArrayList<>();
			my_generic_list.add(10);
			my_generic_list.add(11);
		    int x_generic = my_generic_list.get(0);
		    int y_generic = my_generic_list.get(1);
		    System.out.println(x_generic + y_generic);
	}

}
