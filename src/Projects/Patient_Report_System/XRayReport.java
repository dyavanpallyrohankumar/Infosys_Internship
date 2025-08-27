package Projects.Patient_Report_System;

public class XRayReport extends PatientReport {

	@Override
	void patientReportBody() {
		System.out.println("Chest XRAY: No abnormal detedted");
		System.out.println("Impression:normal Study");
	}
}