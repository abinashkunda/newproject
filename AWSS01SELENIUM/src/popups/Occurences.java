package popups;

public class Occurences {

	public static void main(String[] args) {
		String str="I love coding and Testing";
		
		
	
                                             
		int count=0;
				for(char ch:str.toCharArray()) {
		if(ch == 'i') {
			count++;
		}

	}
	System.out.println(count);
}
}

