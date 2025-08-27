package Projects.Patient_Report_System;

public class Main {

	public static void main(String[] args) {
		PatientReport bloodReport = new BloodReport();
		System.out.println();
		bloodReport.patientReportBody();
		System.out.println();

		bloodReport.printFullReport("Deepesh", 47);
		System.out.println();
		System.out.println();
		PatientReport xrayReport = new XRayReport();
		xrayReport.printFullReport("JP", 60);
	}
}