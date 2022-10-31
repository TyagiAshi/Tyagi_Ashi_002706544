HOSPITAL MANAGEMENT SYSTEM

Hospital Management System using Java Swing. 

--------------------------------------------------------------------------------------------------------------------

Need to work on:
 
• Implement an application based on the given model with Java swing.  
o Patients are able to look for a doctor under the near hospitals 
o Doctors are able to diagnose and leave encounter record based on vital signs 
o Community admins are able to modify the information under a community 
o System admin should have all access(CRUD) to all resources in this application 
• You’re free to have extension design based on the given model, but you’re not allowed 
to delete any element in the model. 
• Your application is required to manage user data(CRUD). 
 FYI:https://www.codecademy.com/articles/what-is-crud 
• UI&UX will be considered as a part of grade. 
• Data validation(Non-null check, basic data type check) 
• Design different roles of users in this application:(System administrator, patient, 
hospital administrator, community administrator, etc)  
• Draw a class diagram and sequence diagram and write the description of your project. 
Put them in your README file.

--------------------------------------------------------------------------------------------------------------------

Prerequisites

1. Install NetBeans application.
2. Have all dependencies and packages installed.

--------------------------------------------------------------------------------------------------------------------

Sequence Diagram-

<p align="center">
	<img src=./Diagram/Sequence_diagram.jpeg">
	<img src=/Diagram/Class_diagram.jpeg">
</p>

-------------------------------------------------------------------------------------------------------------------
Created Files 

Have created 15 classes and more than 3 attributes in some of them.

path location for classes is - Hosptial -> Hospital Database

I've created 6 directories as follow:

1. Patient Direcotry
2. Doctor Directory
3. Community Directory 
4. Hospital Directory
5. Person Directory

------------------------------------------------------------------------------------------------------------------

Inheritance 

City have been extended to Community.
Community has been extended to Houses.
Houses have been extended to Hospital.
Person has been extended to Patient and Doctor.
Community has been extended to hopsital.

-------------------------------------------------------------------------------------------------------------------

Steps to run the project in your machine

Install NetBeans application.
Open a project by going into Files option -> Open Project -> right click -> Run File.

-------------------------------------------------------------------------------------------------------------------

Getting into the Project

Hospital Management System in NetBeans using Java Swing application. The Home page of the project give login option for each user.
(System admin, Community admin, Hospital admin, Doctor, Patient).

Home page consists 5 modules.
1. System Admin - 
	a. System admin logs in 
	b. Create person and his credentials - could be admin, doctor, patient
		Can CRUD Hospitals
		Can CRUD Encounters

2. Community Admin - 
	a. Community admin logs in 
	b. Adds City, Community, and House in the system

3. Hospital Admin - 
	a. Hospital admin logs in
	b. Creates Hospital to a hospital direcotry for a city
	c. Links a hospital to the community 
	
4. Patient Admin - 
	a. Patient looks for a hospitals and doctors.
	b. Patient can access his encounter history
	c. EDIT personal details and encounter

5. Doctor Admin - 
	a. Manages Patient Encounter information
	b. Manages Vital Signs for encounter

6. Patient can view Encounter with a Doctor

7. System admin can view all the changes that have happened so far
 
----------------------------------------------------------------------------------------------------------------------

If you want to contact with me you can reach me at gadge.d@northeastern.edu

Thanks

Ashi Tyagi NU ID : 002706544

