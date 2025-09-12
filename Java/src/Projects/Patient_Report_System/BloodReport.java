package Projects.Patient_Report_System;

public class BloodReport extends PatientReport {
	@Override
	void patientReportBody() {
		System.out.println("HB:13.5");
		System.out.println("WBC:60000");
		System.out.println("Platelets:2.5L");
	}
}