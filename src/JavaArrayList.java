import java.util.ArrayList;

public class JavaArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names= new ArrayList<String>();
		
		names.add("Sadiq");
		names.add("Jafar");
		names.add("Shaik");
		names.add("Suhel");
		names.add("Ahamad");
		
	int count=0;
	
		for (int i=0;i<names.size();i++) {
			String actual= names.get(i);
			if(actual.startsWith("S")) {
				count++;
			}
		}
			System.out.println(count);	
					
	}

	//test
	
	public void streamFilter() {
ArrayList<String> names= new ArrayList<String>();
		
		names.add("Sadiq");
		names.add("Jafar");
		names.add("Shaik");
		names.add("Suhel");
		names.add("Ahamad");
		
		Long c=names.stream().filter(s->s.startsWith("S")).count();
	System.out.println(c);
	}
	
	
	
}
