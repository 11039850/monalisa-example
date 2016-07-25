package test.mlines;


public class MultiLines {
	
	public static void main(String[] args) {
		String name="zzg";
		   
		System.out.println(""+/**~!{*/""
			+ "Hello " +(name)+ "!"
		+ "\r\n"/**}*/); 
   
		System.out.println(""+/**~!{*/""
			+ "Hello " +("$")+ " " +("$")+ "1 " +(name)+ "!"
		+ "\r\n"/**}*/); 
		
		System.out.println(""+/**~!{*/""
			+ "Hello \"" +(name)+ "\"!"
		+ "\r\n"/**}*/);
		 
		System.out.println(""+/**~!{*/""
			+ "Hello " +((name==null?("a"+name):("b"+name)))+ "!"
		+ "\r\n"/**}*/);
	}

}
