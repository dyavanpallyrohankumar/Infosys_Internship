Intern Guide: Hospital Management System (Java Project)

This project will help you practice OOP concepts, custom exceptions, try–catch, and collection framework using a menu-driven console application.
________________________________________
🔹 1. Project Setup
1.	Put all .java files (classes) in one folder.
2.	Open your terminal/command prompt in that folder.
3.	Compile all files together.
4.	Run the main program (HMSApp class).
5.	You will see a menu on the screen.
________________________________________
🔹 2. Menu Options
When the program starts, the menu will look like this:
1. Add Patient
2. Add Doctor
3. Assign Patient to Doctor
4. View All Patients
5. View All Doctors
6. Exit
You need to type the number (1–6) and press Enter. The program will then perform that action.
________________________________________
🔹 3. How Each Option Works
3.1 Add Patient
•	Enter Patient ID (must be unique).
•	Enter Patient Name.
•	Enter Age (between 0 and 120).
•	Enter Disease.
✅ If all inputs are valid → Patient is stored.
❌ If age is invalid → program shows "Invalid age".
❌ If ID already exists → program shows "Duplicate ID".
________________________________________
3.2 Add Doctor
•	Enter Doctor ID (must be unique).
•	Enter Doctor Name.
•	Enter Age (0–120).
•	Enter Specialization.
✅ On success → Doctor is stored.
❌ On error → same validations as above.
________________________________________
3.3 Assign Patient to Doctor
•	Enter Patient ID.
•	Enter Doctor ID.
✅ If both exist → Patient is assigned to the Doctor.
❌ If ID is wrong → program shows "Invalid doctor or patient ID".
________________________________________
3.4 View All Patients
•	Shows list of all patients with ID, Name, Age, and Disease.
•	If no patients → shows "No patients found".
________________________________________
3.5 View All Doctors
•	Shows list of all doctors with ID, Name, Age, Specialization.
•	Can also display assigned patients for each doctor.
•	If no doctors → shows "No doctors found".
________________________________________
3.6 Exit
•	Stops the program safely.
________________________________________
🔹 4. Error Handling You Must Test
•	InvalidAgeException → Try adding patient/doctor with age <0 or >120.
•	DuplicateIdException → Try adding patient/doctor with the same ID twice.
•	Wrong Input Type → Example: enter text when asked for an integer. Program should not crash, it should show an error and return to menu.
________________________________________
🔹 5. Collections in Use
•	ArrayList → Stores all Patients and Doctors.
•	HashMap → Maps each Doctor to their list of Patients.
👉 After adding patients and doctors, check the lists.
👉 After assigning, check that the mapping is updated.
________________________________________
🔹 6. Test Cases (You Must Try)
1.	Add Patient → ID=101, Name=John, Age=30, Disease=Flu.
2.	Add Doctor → ID=201, Name=Dr.Smith, Age=45, Specialization=Cardiology.
3.	Assign Patient 101 to Doctor 201 → should show success.
4.	View Patients → shows John.
5.	View Doctors → shows Dr.Smith and his patient John.
6.	Try adding a patient with age -5 → should show error.
7.	Try adding another doctor with ID=201 → should show Duplicate ID error.
8.	Try typing "abc" when asked for ID → program should handle and not crash.
________________________________________
🔹 7. Bonus Practice (Optional)
•	Add Delete Patient/Doctor option.
•	Add Search by ID option.
•	Add Sort Patients by Age/Name option.
________________________________________
🔹 8. Learning Goals
By completing this project, you will practice:
•	Encapsulation → using private fields + constructors.
•	Inheritance & Polymorphism → Person class as parent, Doctor/Patient as child.
•	Abstraction → abstract method showDetails().
•	Association → Patient ↔ Doctor.
•	Aggregation → Hospital has many Doctors and Patients.
•	Composition → (extra demo: Human → Heart).
•	Collections → ArrayList and HashMap.
•	Custom Exceptions → InvalidAgeException, DuplicateIdException.
•	Try–Catch → handling invalid input safely.
________________________________________
👉 Your Task: Follow these instructions step by step, run the program, test all cases, and note down the output you see for each case.