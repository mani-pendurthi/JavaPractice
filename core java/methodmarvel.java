javaclass employee
{

	String details (int emp_id,String emp_name,String emp_desig,String emp_loc)
	{
		System.out.println("\n"+"EMPLOYEE ID-"+emp_id+"\n"+"EMPLOYEE NAME-"+emp_name+"\n"+"EMPLOYEE DESIGNATION-"+emp_desig+"\n"+"EMPLOYEE LOCATION-"+emp_loc);
		String company="MARVEL STUDIOS";
	return company;
	}

	public static void main(String [] args)
	{
		employee obj=new employee ();
		System.out.println("COMPANY  NAME-"+obj.details(1,"TONY STARK","IRONMAN","NEW YORK"));
		System.out.println("COMPANY  NAME-"+obj.details(2,"BUCKY","WINTER SOLDIER","USA"));
		System.out.println("COMPANY  NAME-"+obj.details(3,"SAM WILSON","FALCON","NEW YORK"));
		System.out.println("COMPANY  NAME-"+obj.details(4,"BRUCE BANNER","HULK","USA"));
		System.out.println("COMPANY  NAME-"+obj.details(5,"JAMES RHODES","WAR MACHINE","NEW YORK"));
		System.out.println("COMPANY  NAME-"+obj.details(6,"STEPHEN","DOCTOR STRANGE","KAMARTAJ"));
		System.out.println("COMPANY  NAME-"+obj.details(7,"WONG","SORCERER SUPREME","KAMARTAJ"));
		System.out.println("COMPANY  NAME-"+obj.details(8,"NATASHA","BLACK WIDOW","NEW YORK"));
		System.out.println("COMPANY  NAME-"+obj.details(9,"WANDA","SCARLET WITCH","WEST VIEW"));
		System.out.println("COMPANY  NAME-"+obj.details(10,"BRIE LARSON","CAPTAIN MARVEL","SPACE"));
		System.out.println("COMPANY  NAME-"+obj.details(11,"THOR","GOD OF THUNDER","ASGARD"));
		System.out.println("COMPANY  NAME-"+obj.details(12,"LOKI","GOD OF MISCHIEF","ASGARD"));
		System.out.println("COMPANY  NAME-"+obj.details(13,"STEVE ROGERS","CAPTAIN AMERICA","USA"));
		System.out.println("COMPANY  NAME-"+obj.details(14,"CLINT BARTON","HAWKEYE","USA"));
		System.out.println("COMPANY  NAME-"+obj.details(15,"SHANG CHI","LEGEND OF 10 RINGS","SHANGHAI"));
		System.out.println("COMPANY  NAME-"+obj.details(16,"QUILL","STAR LORD","GALAXY"));
		System.out.println("COMPANY  NAME-"+obj.details(17,"PETER PARKER","SPIDERMAN","USA"));
		System.out.println("COMPANY  NAME-"+obj.details(18,"TCHELLA","BLACK PANTHER","WAKANDA"));
		System.out.println("COMPANY  NAME-"+obj.details(19,"SCOTT LANG","ANT MAN","USA"));
		System.out.println("COMPANY  NAME-"+obj.details(20,"VISION","AI ROBOT","MIND STONE"));
	
	}

}	