package patientreportsystem;

public abstract class PatientReport {
	void printCompanyHeader() {
		System.out.println("DIAGNOSIS CENTER");
	}

	void printPatientHeader(String patientName, int age) {
		System.out.println("Patient:" + patientName + "Age:" + age);
	}

	abstract void patientReportBody();

// abstract void Report();
	void printFooter() {
		System.out.println("Report Generatede on " + java.time.LocalDateTime.now());
	}

	void printFullReport(String patientName, int age) {
		printCompanyHeader();
		printPatientHeader(patientName, age);
		patientReportBody();
		printFooter();
	}
}