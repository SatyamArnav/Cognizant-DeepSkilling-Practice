
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("Satyam", 101, "B");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.show();
        controller.updateGrade("A+");
        controller.show();

	}

}
