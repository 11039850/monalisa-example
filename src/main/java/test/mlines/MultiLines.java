package test.mlines;

public class MultiLines {

	public static void main(String[] args) {
		String lines = ""+/**~ {*/""
			+ "SELECT * "
			+ "\r\n	FROM user"
			+ "\r\n	WHERE name=\"zzg\""
		+ "\r\n"/**}*/;
		System.out.println(lines);
		
		
		System.out.println("------------------------------------------------------");
		String name="zzg";
		System.out.println(""+/**~!{*/""
			+ "This is an example with var" +("$")+ ":"
			+ "\r\nname=\"" +(name)+ "\" OR name=" +((name))+ " OR " +(("zzgA".equals(name)?"A":"B"))+ ""
		+ "\r\n"/**}*/);
		
		System.out.println("------------------------------------------------------");
		String regex=""+/**~!{*/""
			+ "^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$"
		+ "\r\n"/**}*/.trim();
		String[] emails={"zzg.zhou@qq.com","zzg.zhouqqq.com"};
		for(String m:emails){
			boolean valid=m.matches(regex);
			System.out.println("email is "+(valid?"valid":"invalid")+": "+m);
		}
		
		System.out.println("------------------------------------------------------");
		System.out.println("    "+/**~{*/""
			+ "SELECT * "
			+ "\r\nFROM user"
			+ "\r\nWHERE name=\"zzg\""
		+ "\r\n"/**}*/);
		
		
		System.out.println("------------------------------------------------------");
		lines = "H"+/**~ {*/""
			+ "ello */"
			+ "\r\n{\"World!\"}  \\r\\n"
		+ "\r\n"/**}*/;
		System.out.println(lines);
		
		
		System.out.println("------------------------------------------------------");
		lines = "H"+/**= {*/""
+ "\r\n			ello */"
+ "\r\n			\"World!\""
+ "\r\n		"/**}*/;
		System.out.println(lines);
	}

}
