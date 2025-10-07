package remaning;

import java.util.Scanner;

class Course {

	public static int id;
	String courseName;
	double courseAmount;

	public void setCourse(String course, double amount) {
		id++;
		this.courseName = course;
		this.courseAmount = amount;
		System.out.println("course added sucessfully by the setter");
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", courseAmount=" + courseAmount + "]";
	}
}

public class N_objects {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Course course[] = new Course[10];
		// course[1] = new Course();
		// course[2] = new Course("VLSI", 1000000);
		// course[3] = new Course(course[2]);
		// course[4] = new Course("Embedded Systems", 643822);
		// for (int i = 1; i < 6; i++) {
		// System.out.println(course[i]);
		// }

		char input = 'y';
		int i = 1;

		do {

			System.out.println("do you want to add more course y or n");
			input = sc.nextLine().charAt(0);

			if (input == 'y') {

				System.out.println("enter the course ");
				String name = sc.nextLine();

				System.out.println("enter the amount");
				double amount = sc.nextDouble();
				sc.nextLine(); // Consume leftover newline

				course[i] = new Course();
				course[i].setCourse(name, amount);
				i++;
			} else {
				System.out.println("the details are \n");

				for (int j = 1; j < 10; j++) {
					System.out.println(course[j]);
				}
				break;

			}
		} while (input == 'y');
		sc.close();
	}
}