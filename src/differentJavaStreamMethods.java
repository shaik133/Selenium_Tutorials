import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class differentJavaStreamMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>list=new ArrayList<String>();
		
		list.add("names");
		list.add("tabs");
		list.add("get");
		list.add("system");
		list.add("seperate");
		int count=0;
		for (int i=0;i<list.size();i++) {
			String texts= list.get(i);
			if(texts.startsWith("s")) {
				count++;
			}
			
		}
//--------------------------------------Same above method is done by Java Stream-----------------------
ArrayList<String>list1=new ArrayList<String>();
		
		list1.add("names");
		list1.add("tabs");
		list1.add("get");
		list1.add("system");
		list1.add("seperate");	
		
		//list1.stream().filter(s->s.startsWith("s")).forEach(s->System.out.println(s));
		//list1.stream().filter(s->s.length()>5).forEach(s->System.out.println(s));
		list1.stream().filter(s->s.length()>5).limit(1).forEach(s->System.out.println(s));
		list1.stream().filter(s->s.startsWith("s")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
//Get the unique number from array, sort it and get 3rd number from sorted array.
		Integer[] nu= {1,4,6,5,7,4,8,3,2,3};
		List<Integer> list2= Arrays.asList(nu);
	List<Integer> num= list2.stream().distinct().sorted().collect(Collectors.toList());
	//num.forEach(s->System.out.println(s));
	System.out.println(num.get(3));
	
		
	}

}
