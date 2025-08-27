package inheritance;

class Employ {
	protected int id;
	protected String name;
	protected String dept;

	public void setEmployee(int id, String name, String dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		System.out.println("Emp added Sucessfully");
	}

	public String getEmployee() {
		return "Employ [id=" + id + ", name=" + name + "dept=" + dept + "]";
	}

	public void Workdetails() {
		System.out.println("name is working in" + dept + " with id " + id);
	}

	@Override
	public String toString() {
		return "Employ [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

}

class HR extends Employ {
	protected String region;

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public void conductInterview() {
		System.out.println(name + " is responsible for conducting interview for" + getRegion());
	}

	public void handleRecruiment() {
		System.out.println(name + " is responsible for recruiting process for " + getRegion() + " Location");

	}
}

class SeniorHR extends HR {

	@Override
	public String toString() {
		return "SeniorHR [id=" + id + ", region=" + region + ", name=" + name + ", dept=" + dept + ", yearOfExe="
				+ yearOfExe + ", isHeadofdept=" + isHeadofdept + "]";
	}

	protected int yearOfExe;
	protected boolean isHeadofdept;

	public void approveLeave() {
		System.out.println("iam senior hr and my name is" + name + " and i can approve leav for the manager");
	}

	public int getYearOfExe() {
		return yearOfExe;
	}

	public void setYearOfExe(int yearOfExe) {
		this.yearOfExe = yearOfExe;
		if (yearOfExe > 2)
			isHeadofdept = true;
		else
			isHeadofdept = false;

	}

	public void setHeadofdept(boolean isHeadofdept) {

		this.isHeadofdept = isHeadofdept;
	}

}

public class MultilevelInheritance {

	public static void main(String[] args) {

		SeniorHR obj1 = new SeniorHR();
		obj1.setEmployee(101, "Devansh", "Finance");
		obj1.setRegion("Chennai DC");
		obj1.setYearOfExe(5);
		obj1.approveLeave();
		System.out.println(obj1);
	}
}