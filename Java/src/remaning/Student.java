package remaning;

class StudentTest {
	int id;
	String name;
	char gender;// only "M" or "F"

	public void updateProfileName(String Newname) {
		name = Newname;
		System.out.println("the id of the student " + name + " is " + id);
		System.out.println("the gender is " + gender);
	}

	public void updateProfile(int i, String newName, char gender) {
		this.id = i;
		this.name = newName;
		this.gender = gender;
		System.out.println("updated full profile");
		System.out.println("the id of the student " + name + " is " + id);
		System.out.println("the gender is " + gender);
	}

}

public class Student {
	public static void main(String[] args) {

		StudentTest obj = new StudentTest();
		obj.name = "Rohan";
		obj.id = 102;
		obj.gender = 'M';
		// obj.updateProfile(432876,"Rohankumar.D",'M');
		obj.updateProfileName("Rohan Kumar");

		System.out.println("updated name is" + obj.name);
	}
}