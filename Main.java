package ödevAboutInheritance;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User ();
		user1.setName("Mert");
		user1.setUserNumber("01");
		user1.setUserColour("Red");
		user1.setId("95e13a");
		
		Instructor ınstructor1 = new Instructor ();
		ınstructor1.setName("Engin");
		ınstructor1.setInstructorNumber("02");
		ınstructor1.setInstructorColour("Blue");
		ınstructor1.setId("95t13e");
		
		Student student1 = new Student ();
		student1.setName("Kök");
		student1.setStudentNumber("03");
		student1.setStudentColour("Yellow");
		student1.setId("95c13l");
		
		InstructorManager ınstructorManager = new InstructorManager ();
		
		UserManager userManager = new UserManager ();
		
		StudentManager studentManager = new StudentManager ();
		
		System.out.println(ınstructor1.getName());
		ınstructorManager.add();
		
		System.out.println(user1.getName());
		userManager.add();
		
		System.out.println(student1.getName());
		studentManager.add();


	}

}
