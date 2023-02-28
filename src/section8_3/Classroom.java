package section8_3;

public class Classroom {
	
	public static void main(String[] args) {
		
		Teacher teacher1 = new Teacher();
		Student student1 = new Student();
		
		
		teacher1.name = "John"; //School(parent/super)
		teacher1.id = 777; //School(parent/super)
		teacher1.major = "Geography"; //Teacher(child/sub)
		teacher1.assignedClass = "B"; //Teacher(child/sub)
		
		student1.name = "Kate";
		student1.id = 9001;
		student1.homework = "Java Exercises"; 
		student1.avarageGrade = 9;
		
		
		AssistantTeacher at = new AssistantTeacher();
		at.name = "Fred";
		at.id = 601;
		at.major = "Physics";
		at.assignedClass = "C";
		at.trainingTopics = "Gravity"; 
		
	}
	

}
