package project;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Formats extends DB_CODE{
public static void AdminWelcomePanel() {
		System.out.println("\t\t\tWelcome Admin\n");
	System.out.println("1.User Condrol Panel\n2.Other's\n3.Back\n");
	System.out.println("Please Enter Your Choice");}
public static void AddingUserPanel(){
System.out.println("1.Add Staff\n2.Add Accound Team\n3.Add Admiision Team\n4.Back\n");
System.out.println("Please Enter Your Choice");}	
public static void AskingNewUserName(){
System.out.println("\t\tEnter new username: ");}
public static void AskingNewPassword(){
System.out.println("\t\tEnter new Password: ");
System.out.println("Please Enter The Password at least 1 uppercase letter, 1 special character, 1 number, and is at least 8 characters long.\n");
}
public static void AskingUserName(){
System.out.println("\t\tEnter the Username : ");}
public static void AskingPassword(){
System.out.println("\n\t\tEnter the Password : ");}
public static void AskingRegno(){
System.out.println("\t\tEnter Reg no");}
public static void AddStudentWecomePanel() {
System.out.println("\n\tTo Add Students details\n");
}
public static void AskingStudentNameforadd() {
	System.out.println("\t\tEnter Student name: ");}
public static void AskingDateOfBirthforadd() {
	System.out.println("\t\tEnter Date of Birth: ");
	LocalDate currentDate=LocalDate.now();
    DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
	System.out.println("Enter the Date In this format---> ");
    String formattedDate = currentDate.format(customFormatter);
	System.out.print("Today's Date : "+currentDate+" to "+formattedDate);
	System.out.println();
}
public static void AskingStartDate() {
	System.out.println("\t\tEnter Start Date: ");
	LocalDate currentDate=LocalDate.now();
    DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
	System.out.println("Enter the Date In this format---> ");
    String formattedDate = currentDate.format(customFormatter);
	System.out.print("Today's Date : "+currentDate+" to "+formattedDate);
	System.out.println();
}
public static void AskingEndDate() {
	System.out.println("\t\tEnter END Date: ");
}
public static void AskingGenderforadd() {
	System.out.println("\t\tEnter The Choice For Gender : \n");
	System.out.println("\t1.Male\t\t2.Female\t3.Others or Not Preferrd to Say");
}
public static void AskingCourseforadd() {
	System.out.println("\t\tEnter The Choice For course : \n");
	System.out.println("\t1.BE-ECE\t2.BE-MECH\t3.BE-CSC\t4.B.Tech-IT\t5.BE-EEE");}
public static void AskingFeesforadd() {
	System.out.println("\t\tPlease Enter Choice for Fees Quota\n");
	System.out.println("\t1.GOVT Quota\t2.MAGT Quota");
	}
public static void AskingContactNumberforadd() {
	System.out.println("\tEnter contact_no: ");
}
public static void AskingAlternateContactNumberforadd() {
	System.out.println("\tEnter Alternate contact no: ");
}
public static void AskingAddressforadd() {
	System.out.println("\t\tEnter address: ");
}
public static void AskingPasswordforadd() {
	System.out.println("\t\tEnter Student Password: \n");
    System.out.println("Please Enter The Password at least 1 uppercase letter, 1 special character, 1 number, and is at least 8 characters long.");
}
public static void AskingStudentNameforEdit() {
	System.out.println("\t\tEnter Student New name: ");
}
public static void AskingDateOfBirthforEdit() {
	System.out.println("\t\tEnter Student New Date of Birth: \n");
	LocalDate currentDate=LocalDate.now();
    DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
	System.out.println("Enter the Date In this format---> ");
    String formattedDate = currentDate.format(customFormatter);
	System.out.print("Today's Date : "+currentDate+" to "+formattedDate);
	System.out.println();
}
public static void AskingGenderforEdit() {
	System.out.println("\t\tEnter Student New gender : \n");
	System.out.println("\t1.Male\t\t2.Female\t3.Others or Not Preferrd to Say");
}
public static void AskingCourseforEdit() {
	System.out.println("\t\tEnter Student New course : \n");
	System.out.println("\t1.BE-ECE\t2.BE-MECH\t3.BE-CSC\t4.B.Tech-IT\t5.BE-EEE");
}
public static void AskingFeesforEdit() {
	System.out.println("\t\tEnter Student New fees:\n ");
	System.out.println("\t1.GOVT Guota\t2.MAGT Guota");
}
public static void AskingContactNumberforEdit() {
	System.out.println("\t\tEnter Student New contact_no: \n");
}
public static void AskingAddressforEdit() {
	System.out.println("\t\tEnter Student New address: \n");
	 System.out.println("Please Enter Address Fully");}
public static void AskingPasswordforEdit() {
	System.out.println("\t\tEnter Student New Password: \n");
    System.out.println("Please Enter The Password at least 1 uppercase letter, 1 special character, 1 number, and is at least 8 characters long.");
}
public static void AskParentName() {
	System.out.println("Enter Your Parent or Guardian Name ");
}
public static void Askname() {
	System.out.println("Enter Your Name ");
}
public static void AskStar() {
	System.out.println("Enter The Star Value Out Of Five");
}
public static void AskOther() {
	System.out.println("If You Want Write Anything About Our college \n");
	System.out.println("Write it...");

}
public static void AskingSSLCBoard() {
	System.out.println("\t\tChoose SSLC Board Exam Type : \n");
	System.out.println("\t1.CBSE\t2.CISCE\t3.NIOS\t4.STATE BOARD OF TAMIL NADU\t5.Others");
}
public static void AskingHSCBoard() {
	System.out.println("\t\tChoose HSC Board Exam Type : \n");
	System.out.println("\t1.CBSE\t2.CISCE\t3.NIOS\t4.STATE BOARD OF TAMIL NADU\t5.Others");
}
public static void AskingSSLCSchoolName(){
System.out.println("\t\tEnter Your SSLC School Name");}
public static void AskingHSCSchoolName(){
System.out.println("\t\tEnter Your HSC School Name");}
public static void AskingDiplomoUniName(){
System.out.println("\t\tEnter Your Diplomo University Name");}
public static void AskingSSLCGrade(){
System.out.println("\t\tEnter Your SSLC Grade In Percentage");}
public static void AskingHSCGrade(){
	System.out.println("\t\tEnter Your HSC Grade In Percentage");}
public static void AskingDiplomoUniGrade(){
		System.out.println("\t\tEnter Diplomo Grade In Percentage");}
public static void AddStudentconfirmPanel(long a,String b,String c,String d,String e,double f,long g,String h,String i) {
	System.out.println("\tReg No                  : "+a);
	System.out.println("\tStudent Name            : "+b);
	System.out.println("\tDate of Birth           : "+c);
	System.out.println("\tGender                  : "+d);
	System.out.println("\tCourse                  : "+e);
	System.out.println("\tFees                    : "+f);
	System.out.println("\tContact Number          : "+g);
	System.out.println("\tAddress                 : "+h);
	System.out.println("\tPassword                : "+i);}
public  void AddStudentconfirmPanelDB(long a,String b,String c,String d,String e,double f,long g,String h,String i) {
	System.out.println("\tName                    : "+a);
	System.out.println("\tStudent Name            : "+b);
	System.out.println("\tDate of Birth           : "+c);
	System.out.println("\tGender                  : "+d);
	System.out.println("\tCourse                  : "+e);
	System.out.println("\tFees                    : "+f);
	System.out.println("\tContact Number          : "+g);
	System.out.println("\tAddress                 : "+h);
	System.out.println("\tPassword                : "+i);}
public static void AskApplicationId() {
	System.out.println("Enter Application Id Number : ");
}
public static int Asking_Int() {
	int a=0;
	 try {
  Scanner sc = new Scanner(System.in);
  a=sc.nextInt();}
	catch(InputMismatchException e) {
		System.out.println("Invalid Input...!!!\n");
		System.out.println("\tEnter Again");
		return Asking_Int();
	}
	return a;
}
public static void AccountHistoryFormat() {
	System.out.println();
	System.out.println();
	System.out.printf("%-40s %-15s %-15s %-30s %-40s %-15s %-15s%n",
			"Username", "Date", "Time", "Student REG No", "Student Name", "Dept", "Amount Of Paid");}
public static void FeesUpdateHistoryFormat() {
	System.out.println();
	System.out.println();
	System.out.printf("%-40s %-15s %-15s %-30s %-40s %-15s %-20s %-20s%n",
			"Username", "Date", "Time", "Student REG No", "Student Name", "Dept", "Before Total Fees","Updated Total Fees");}
public static String Asking_String() {
	 Scanner sc = new Scanner(System.in);
	    return sc.nextLine();
}
public static void AddStudentWecomePan() {
	Scanner sc=new Scanner(System.in);
	int i=sc.nextInt();
}
public static String Asking_Dob(){
	 String a="";
 Scanner sc = new Scanner(System.in);
 a=sc.nextLine();
 if(a.matches("^[0-9]*$")&&a.length()==8) {
	  LocalDate currentDate=LocalDate.now();
	    DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
	    String formattedDate = currentDate.format(customFormatter);
        int yearsToSubtract = 17;
        LocalDate date = LocalDate.parse(formattedDate, customFormatter);
        LocalDate resultDate = date.minusYears(yearsToSubtract);
        String result = resultDate.format(customFormatter);
	if(0>=a.compareTo(result)) {
		  return a;
	}
	else
		  System.out.println("Minimum Age Limt Is 17 Year's \n");
 }
 else 		
		  System.out.println("your entering invalid input \n");
 		  System.out.println("Please Enter Again");
 		return  Asking_Dob();
 }
public static String Asking_Date(){
	 String a="";
Scanner sc = new Scanner(System.in);
a=sc.nextLine();
if(a.matches("^[0-9]*$")&&a.length()==8) {
	  LocalDate currentDate=LocalDate.now();
	    DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
	    String formattedDate = currentDate.format(customFormatter);
	if(0>=a.compareTo(formattedDate)) {
		  return a;
	}
	else
		  System.out.println("Entering Invalid Date\n");
}
else 		
		  System.out.println("your entering invalid input \n");
		  System.out.println("Please Enter Again");
		return  Asking_Date();
}
public static String Asking_Dob(String SD) {
	 String a="";
Scanner sc = new Scanner(System.in);
a=sc.nextLine();
if(a.matches("^[0-9]*$")&&a.length()==8) {
	  LocalDate currentDate=LocalDate.now();
	    DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
	    String formattedDate = currentDate.format(customFormatter);
	if(0>=a.compareTo(formattedDate)&& (0<=a.compareTo(SD))) {
		  return a;
	}
	  System.out.println("your entering invalid Date ");
}
else 		
		  System.out.println("your entering invalid input \n");
		  System.out.println("Please Enter Again");
		return  Asking_Dob(SD);
}
public static void ASaStaffPanelForAdmin(){ 
System.out.println("1.Add Students details\n2.Edit Students fees\n3.View Students details\n4.Delete Students details\n5.Back\n");
System.out.println("Please Enter Your Choice");}
public static void AsaAccountTeamChoicePanel(){
	System.out.println();
System.out.println("1.View Fees Details Of Student\n2.Account History\n3.View Fees Update History\n4.Back\n");
System.out.println("Please Enter Your Choice");}
public static void AsaAdmissionTeamChoicePanel(){
	System.out.println("\n\n1.View Application\n2.Reject Application\n3.Admission Entry\n4.Back\n");
System.out.println("Please Enter Your Choice");}
public String LiveDate(){
	LocalDate currentDate=LocalDate.now();
    DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
    String formattedDate = currentDate.format(customFormatter);
    return formattedDate;
}
public String LiveTime() {
    LocalTime currentTime = LocalTime.now();
    DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("HHmmss");
    String formattedTime = currentTime.format(customFormatter);
    return formattedTime;
}
public static Long Asking_Long(int j) {
	 long a=0;
	 if(j==3) {
		 System.out.println("\t\t\tToo Many Attempts ...!!!");
		 System.out.println("\t\t\tDo You Want To Continue...?");
		 boolean b=AskConfirmation();
		 if(b) {
			 j=0;
			  System.out.println("Please Enter Again");
			return Asking_Long(j);
		 }
		 else if(!b) {
			 System.out.println("\t\t\t Exiting....");
			 return 0l;
		 }
	 }
	 	 try {
		 Scanner sc = new Scanner(System.in);
		 a=sc.nextLong();}
	catch(InputMismatchException e) {
		System.out.println("Reg No Should only Number's\n");
		  System.out.println("Please Enter Again");
		  j++;
		return Asking_Long(j);
	}
	 	if(a==0) {
			  j++;
				return Asking_Long(j);
		 }

	return a;
}
public static Long Asking_Long() {
	 long a=0;
	 try {
		 Scanner sc = new Scanner(System.in);
		 a=sc.nextLong();}
	catch(InputMismatchException e) {
		System.out.println("Reg No Should only Number's\n");
		  System.out.println("Please Enter Again");
		return Asking_Long();
	}
	return a;
}
public static double Asking_Double() {
	int a=0;
	 try {
 Scanner sc = new Scanner(System.in);
 a=sc.nextInt();}
	catch(InputMismatchException e) {
		System.out.println("your entering invalid input \n");
	}
	 if (a==0) {
			System.out.println("Please Enter Again\n");
			return Asking_Double();
		}
	 else if(a==1) {
		 return 25000.00;
	 }
	 else if(a==2) {
		 return 50000.00;
	 }
	 else 
	 {	 System.out.println("Your Entering Out of The Choice..!!!\n");
		 System.out.println("Please Enter Again");
			return Asking_Double();
	 }
}
public static Long Asking_LongIncheck() {
	DB_CODE cr=new DB_CODE();	
	 long a=0;
	 try {
		 Scanner sc = new Scanner(System.in);
		 a=sc.nextLong();}
	catch(InputMismatchException e) {
		System.out.println("Reg No Should only Number's\n");
		  System.out.println("Please Enter Again\n");
		return Asking_LongIncheck();
	}			 
	return a;
}
public static boolean AskConfirmation() { 
	confirmdeleteoptionpanel();
	int a=Asking_Int();
	if(a==1) {
		return true;
	}
	else if (a==2){
		return false;
	}
	else System.out.println("Your Choosing Wrong Option \n");
	System.out.println("Please Enter Again");
	return AskConfirmation();
	}
public  boolean AskConfirmationfe() {
	confirmdeleteoptionpanel();
	int a=Asking_Int();
	if(a==1) {
		return true;
	}
	else if (a==2){
		return false;
	}
	else System.out.println("Your Choosing Wrong Option \n");
	System.out.println("Please Enter Again");
	return AskConfirmation();
	}
public static boolean AskConfirmationrej() {
	int a=Asking_Int();
	if(a==1) {
		return true;
	}
	else if (a==2){
		return false;
	}
	else System.out.println("Your Choosing Wrong Option \n");
	System.out.println("Please Enter Again");
	return AskConfirmation();
	}
public static void AskEmailid(){
System.out.println("Enter Your Email ID");}
public static void ApplicationFormWelcomePanel(){
	System.out.println("\t\t\t\tApplication Form\n");
	System.out.println("\t\tPlease input your accurate details...!!!\n");
}
public static void ApplicationconfirmPanel(String a,String b,String c,String d,long e,long f,String g,String h,String i,String j,String k,double l,String m,String n,double o,String p,double q) {
	System.out.println();
	System.out.println("\tStudent Name            : "+a);
	System.out.println("\tParent  Name            : "+b);
	System.out.println("\tDate Of Birth           : "+c);
	System.out.println("\tGender                  : "+d);
	System.out.println("\tContact Number          : "+e);
	System.out.println("\tAlternatecotact Number  : "+f);
	System.out.println("\tEmailid                 : "+g);
	System.out.println("\tAddress                 : "+h);
	System.out.println("\tCourse                  : "+i);
	System.out.println("\tSSLC Board Name         : "+j);
	System.out.println("\tSSLC School Name        : "+k);
	System.out.println("\tSSLC Mark               : "+l);
	System.out.println("\tHSC Board Name          : "+m);
	System.out.println("\tHSC School Name         : "+n);
	System.out.println("\tHSC Mark                : "+o);
	System.out.println("\tDiploma University Name : "+p);
	System.out.println("\tDiploma Grade           : "+q+"\n\n");
}
public static void AdmissionPanel(){
	System.out.println("\t\t\t\t Welcome Student And Parent's\n\n");
	System.out.println("\t\t2023-2024 Admission Going On Process\n\n");}
public static boolean ApplicationASK() {
	 Scanner sc = new Scanner(System.in);
System.out.println("\t\t\tDo You Want To Apply...?\n");
System.out.println("\t\tPress 1 for YES \t\t\t Press 2 for No");
int a=Asking_Int();
if (a==1) {
    return true;
}
else if(a==2) {
	 return false;
}
else 
	 System.out.println("\t\tWrong Input ...!!!\n");
	 return ApplicationASK();}
public static boolean AdmissionEntryPanel() {
	 Scanner sc = new Scanner(System.in);
System.out.println("\t\t\tDo You Want Entry The Admission For The Applicant Details ...?\n");
System.out.println("\t\tPress 1 for YES \t\t\t Press 2 for No");
int a=Asking_Int();
if (a==1) {
   return true;
}
else if(a==2) {
	 return false;
}
else 
	 System.out.println("\t\tWrong Input ...!!!");
	 return AdmissionEntryPanel();}
public static void Applicationviewformat() {
	System.out.printf("%-15s %-30s %-30s %-12s %-20s %-20s %-20s %-50s %-75s %-15s %-35s %-75s %-10s %-35s %-75s %-10s %-75s %-10s%n",
	"Application id", "Name", "Parent name", "DOB", "Gender", "Contact_no", "Alternate Contact no", "Gmail Id", "Address", "Course",
	        "SSLC Borad Name", "SSLC School Name", "SSLC Mark", "HSC Borad Name", "HSC School Name", "HSC Mark", "Dipolomo College Name", "Diplomo Grade");
}
public static void AcccountHistoryChoicePanel() {
	System.out.println("\t\t\tView Account History \n");
System.out.println("1.Specific Date History\n2.Specific User History\n3.Specific Student History\n4.Full History\n5.Back\n");
System.out.println("Please Enter Your Choice");}
public static void confirmdeleteoptionpanel() {
	System.out.println("1.Yes \t\t 2.No");
}
public static long checkExit() {
	 Scanner sc = new Scanner(System.in);
  System.out.println("Do You want to Exit? (Enter 'Exit' to Exit or any Other Key to Continue)\n");
  String userInput = sc.nextLine();
  if (userInput.equalsIgnoreCase("exit")) {
      return 10;
  }
  else return 1;
}
public static boolean ConfirmHSC() {
	 Scanner sc = new Scanner(System.in);
 System.out.println("\t\t\tDid You Complete HSC?\n");
 System.out.println("\t\tPress 1 for YES \t\t\t Press 2 for No");
 int a=Asking_Int();
 if (a==1) {
     return true;
 }
 else if(a==2) {
	 return false;
 }
 else 
	 System.out.println("\t\tWrong Input ...!!!\n");
	 return ConfirmHSC();}
public static boolean ConfirmDIP() {
	 Scanner sc = new Scanner(System.in);
System.out.println("\t\t\tDid You Complete Diplomo?\n");
System.out.println("\t\tPress 1 for YES \t\t\t Press 2 for No");
int a=Asking_Int();
if (a==1) {
    return true;
}
else if(a==2) {
	 return false;
}
else 
	 System.out.println("\t\tWrong Input...!!!\n");
	 return ConfirmDIP();}
public static boolean ConfirmAdmision() {
	 Scanner sc = new Scanner(System.in);
System.out.println("\t\t\tDo You Want To Submit The Application...?\n");
System.out.println("\t\tPress 1 for YES \t\t\t Press 2 for No");
int a=Asking_Int();
if (a==1) {
   return true;
}
else if(a==2) {
	 return false;
}
else 
	 System.out.println("\t\tWrong Input ...!!!\n");
	 return ConfirmAdmision();}
public static boolean ConfirmAddStudent() {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("\t\t\tKindly Check the Above Informations\n");
System.out.println("\t\t\tDo You Want To Add The Student Details...?\n");
System.out.println("\t\tPress 1 for YES \t\t\t Press 2 for No");
int a=Asking_Int();
if (a==1) {
   return true;
}
else if(a==2) {
	 return false;
}
else 
	 System.out.println("\t\tWrong Input ...!!!");
	 return ConfirmAdmision();}
public  boolean ConfirmAddStudentDB() {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("\t\t\tKindly Check the Above Informations\n");
System.out.println("\t\t\tDo You Want To Add The Student Details...?\n");
System.out.println("\t\tPress 1 for YES \t\t\t Press 2 for No");
int a=Asking_Int();
if (a==1) {
  return true;
}
else if(a==2) {
	 return false;
}
else 
	 System.out.println("\t\tWrong Input ...!!!\n");
	 return ConfirmAdmision();}
public static void CreateAdminorPasswordChangePanel(){
	System.out.println();
System.out.println("1.Create Admin\n2.Edit password For Admin\n3.View Admin Details\n4.Delete Admin\n5.Back\n");
System.out.println("Please Enter Your Choice");}
public static void confirmationppanelforaccesssuperadmin(String i){
System.out.println();
System.out.println("Do You Want To Access For "+i+" Admin To Super Admin...?");
System.out.println();
}
public static void DeleteUsersListCondrolPanel() {
	System.out.println("\t\t\tView User's List\n");
System.out.println("1.Delete Staff User's Details\n2.Delete Account Team User's Details\n3.Delete Admission Team User's Details\n4.Back\n");
System.out.println("Please Enter Your Choice");}
public static void DeleteStaffAccessPanel() {
System.out.println("\t\t\tDelete Staff Access Page\n");}
public static void DeleteAdminAccessPanel() {
System.out.println("\t\t\tDelete Admin Access Page\n");}
public static void DeleteAccountTeamAccessPanel() {
System.out.println("\t\t\tDelete Account Team Access Page\n");}
public static void DeleteAdmissionTeamAccessPanel() {
System.out.println("\t\t\tDelete Admission Team Access Page\n");}
public static void DeleteReviewpanel(){
	System.out.println("\t\t\tReview Delete Section\n");
}
public static void EndofREC() {
System.out.println("\t\t\t--------End of the Records--------\n");}
public static void ExitingStaffChoicePanel(){
	System.out.println("\t\t\tWelcome Staff\n");
System.out.println("1.Add Students details\n2.Edit Students fees\n3.View Students details\n4.Delete Students details\n5.Back\n");
System.out.println("Please Enter Your Choice");}
public static void ExitingAdmissionTeamChoicePanel(){
	System.out.println("\t\t\tWelcome Admission Team\n");
System.out.println("1.View Application\n2.Reject Application\n3.Admission Entry\n4.Back\n");
System.out.println("Please Enter Your Choice");}
public static void ExitingAccountTeamChoicePanel(){ 
	System.out.println("\t\t\tWelcome Account Team\n");
System.out.println("1.Pay Fees\n2.Update Fees For Student\n3.View Fees Details Of Student\n4.Account History\n5.View Fees Update History\n6.Back\n");
System.out.println("Please Enter Your Choice");}  
public static void EditChoicePanel(){
System.out.println("\n\tTo Edit Students details\n");
System.out.println("1.Edit Student Name \n2.Edit Student DOB \n3.Edit Student Gender \n4.Edit Student Course \n6.Edit Student Contact number\n7.Address\n8.Password\n9.Back\n");
System.out.println("\t\tPlease Enter Your Choice ");}
public static void FeesUptadefromAccountTeamChoicePanel(){
	System.out.println("\t\t\tWelcome Account Team\n");
	System.out.println("1.Uptade Fess For Student\n2.Back\n");
	System.out.println("Please Enter Your Choice");}
public static void exitcondrol() {
	System.out.println("...Exiting !!!\n");
	System.out.println("\t Thank You!!!");}
public static String GetString() {
	Scanner sc=new Scanner (System.in);
	String value =sc.nextLine();
	if(value.matches("^[a-zA-Z ]*$") ) {
		return value;
	}
	else {
		System.out.println("Your Input Wrong Please Enter Alphabets Only...!!!\n");
		System.out.println("Please Enter Again");
		return GetString();
	}
	}
public static String GetGender() {
	Scanner sc=new Scanner (System.in);
	String value =sc.nextLine();
	if(!value.matches("^[a-zA-Z ]*$") ) {
		if(value.equals("1")) {
			return "Male";
		}
		else if(value.equals("2")) {
			return "Female";
		}
		else if (value.equals("3")) {
			return "Others or Not Preferrd to Say";
		}
		else {
			System.out.println("Your Entering Out of The Choice..!!!\n");
			System.out.println("Please Enter Again\n");
			return GetGender();
		}
	}
	else {
		System.out.println("Your Input Wrong Three of the Above Choice Only...!!!\n");
		System.out.println("Please Enter Again");
		return GetGender();
	}
	}
public static String GetCourse() {
	Scanner sc=new Scanner (System.in);
	String value =sc.nextLine();
	if(!value.matches("^[a-zA-Z]*$") ) {
		if(value.equals("1")) {
			return "BE-ECE";
		}
		else if(value.equals("2")) {
			return "BE-MECH";
		}
		else if (value.equals("3")) {
			return "BE-CSC";
		}
		else if(value.equals("4")) {
			return "B.Tech-IT";}
		else if(value.equals("5")) {
			return "BE-EEE";}
	
		else {
			System.out.println("Your Entering Out of The Choice..!!!\n");
			System.out.println("Please Enter Again");
			return GetCourse();
		}
	}
	else {
		System.out.println("Your Input Wrong ...!!!\n");
		System.out.println("Please Enter Again");
		return GetCourse();
	}
	}
public static long GetCn() {
	long a=0;
	 try {
  Scanner sc = new Scanner(System.in);
  a=sc.nextLong();}
	catch(InputMismatchException e) {
		System.out.println("your entering invalid input\n");
		return GetCn();
		}
	 if (a>5999999999l && a<10000000000l) {
			return a;
			}
	 else if(a<=5999999999l &&a>1000000000l) 
		 {	System.out.println("Your Mobile Number First Number Should be 6 or above 6...!!!\n");
		 System.out.println("Please Enter Again");
		 return GetCn();
	 }
	 else if(a<=999999999l || a>=10000000000l) 
	 {	System.out.println("Your Mobile Number Should be only 10 number...!!!\n");
	 System.out.println("Please Enter Again");
	 	return GetCn(); }
	 else 
	 {	 System.out.println("Please Enter your number correctly!!!\n");
		 System.out.println("Please Enter Again");
			return GetCn();
	 }
}
public static String GetAdd() {
	Scanner sc=new Scanner (System.in);
	String value =sc.nextLine();
		return value;
	}
public static String GetPass(){
	Scanner sc=new Scanner (System.in);
	String password =sc.nextLine();
	if (password.length() < 8) {
        System.out.println("Your password must be Atleast 8 value\n");
        System.out.println("Please Enter Again");
		return GetPass();
    }
	else if (isPasswordValid(password)) {
		return password;
	} 
	else {
        System.out.println("Password is invalid. Please make sure it contains at least 1 uppercase letter, 1 special character, 1 number, and is at least 8 characters long\n");
        System.out.println("Please Enter Again");
        return GetPass();	
	}
	}
public static String GetStringUsername() {
	Scanner sc=new Scanner (System.in);
	String value =sc.nextLine();
	if(value.matches("^[a-zA-Z]*$") ) {
		return value;
	}
	else {
		System.out.println("Your Input Wrong Please Enter Alphabets Only WithOut Space or Special character...!!!\n");
		System.out.println("Please Enter Again");
		return GetStringUsername();
	}
	}
public static int Getstar() {
	int a=0;
	 try {
  Scanner sc = new Scanner(System.in);
  a=sc.nextInt();}
	catch(InputMismatchException e) {
		System.out.println("Enter only Number...!!!\n");
		System.out.println("please Enter Again\n");
		return Getstar();
	}
	if(a<=5&&a>=1) {
		return a;}
	 else if (a==0) {
			System.out.println("Minimum Choice is 1 star\n");
			System.out.println("please Enter Again\n");
			return Getstar();
	 }
	 else 		
		 System.out.println("Your Entering Out Of Choice ...\n");
	 	 System.out.println("Enter 1-5 value\n");
	 	 System.out.println("please Enter Again\n");
	 	 return Getstar();
}
public static boolean validateEmail(String email) {
	String EMAIL_PATTERN = "^[\\w.-]+@[\\w.-]+\\.[\\w]+$";
	Pattern pattern = Pattern.compile(EMAIL_PATTERN);
    Matcher matcher = pattern.matcher(email);
    return matcher.matches();
}
public static String GetEmailId() {
	Scanner sc=new Scanner (System.in);
	String value =sc.nextLine();
	if(validateEmail(value)) {		
		return value;
	}
	else {
		System.out.println("Your Input Wrong Please Enter Email Id...!!!\n");
		System.out.println("Please Enter Again");
		return GetEmailId();
	}
	}
public static String GetBoard() {
	Scanner sc=new Scanner (System.in);
	String value =sc.nextLine();
	if(!value.matches("^[a-zA-Z]*$") ) {
		if(value.equals("1")) {
			return "CBSE";
		}
		else if(value.equals("2")) {
			return "CISCE";
		}
		else if (value.equals("3")) {
			return "NIOS";
		}
		else if(value.equals("4")) {
			return "STATE BOARD OF TAMIL NADU";}
		else if(value.equals("5")) {
			System.out.println("\t\tEnter Board Exam Type : ");
			return sc.nextLine();}
	
		else {
			System.out.println("Your Entering Out of The Choice..!!!\n");
			System.out.println("Please Enter Again");
			return GetBoard();
		}
	}
	else {
		System.out.println("Your Input Wrong Please Five of the Above Choice Only...!!!\n");
		System.out.println("Please Enter Again");
		return GetBoard();
	}
	}
public static double GetGrade() {
	double a=0;
	 try {
  Scanner sc = new Scanner(System.in);
  a=sc.nextDouble();}
	catch(InputMismatchException e) {
		System.out.println("Enter only Number...!!!\n");
		System.out.println("please Enter Again");
		return GetGrade();
	}
	if(a<=100&&a>=0.1) {
		return a;}
	 else 		
		 System.out.println("Your Input is Wrong...!!!\n");
	 	 System.out.println("please Enter Again");
	 	 return GetGrade();
}
public double GetDouble(double r) {
	System.out.println("\t\t\t\tEnter The Amount");
	  Scanner sc = new Scanner(System.in);
	double d=0;
	while (true) {
	 try {
  d=sc.nextDouble();
	 if(d==0) {
			System.out.println("Please Enter Some Amount 0 Is Not Applicable As A amount...\n");
		return  GetDouble(r);}
	 else if(d<0) {
			System.out.println("Your Entering Negative Amount Of value ... \nIts Could Negative Amount Of The paid fees For The Student\n");
			System.out.println("Are You Sure You Want To Update This\n");
			boolean a=AskConfirmation();
			if(a) { return d;}
			else if(!a) {
				System.out.println("\tEnter Again");
				return GetDouble(r);}}
	 else if(d>r) {
		 System.out.println("Your Entering Amount is Greater Then PendingFees ... \nIts Could Negative Amount Of The Pending fees For The Student\n");
			System.out.println("The Differnce Amount Is : Rs "+(d-r));
			System.out.println("\nAre You Sure You Want To Update This \n");
			boolean b=AskConfirmation();
			if(b) { return d;}
			else if(!b) {
				System.out.println("\tEnter Again");
				return GetDouble(r);}
	 }
	  else {
                return d;
            }}
	 catch(InputMismatchException e) {
			System.out.println("Invalid Input...!!!");
			System.out.println("\tEnter Again");
            sc.nextLine(); 
            }
	 }}
public double GetDoubleForUptadeFessForParticularStudent() {
	System.out.println("\t\t\t\tEnter The Amount");
	  Scanner sc = new Scanner(System.in);
	double d=0;
	while (true) {
	 try {
  d=sc.nextDouble();
	 if(d==0) {
			System.out.println("Please Enter Some Amount 0 Is Not Applicable As A amount...\n");
		return  GetDoubleForUptadeFessForParticularStudent();}
	 else if(d<0) {
			System.out.println("Your Entering Negative Amount Of value ... \nIts Could Reducing Amount of fees For The Student\n");
			System.out.println("Are You Sure You Want To Update This \n");
			boolean a=AskConfirmation();
			if(a) { return d;}
			else if(!a) {
				System.out.println("\tEnter Again");
				return GetDoubleForUptadeFessForParticularStudent();}}
	  else {
                return d;
            }}
	 catch(InputMismatchException e) {
			System.out.println("Invalid Input...!!!\n");
			System.out.println("\tEnter Again");
            sc.nextLine(); 
            }
	 }}
public static void handleIncorrectLogin() {
	System.out.println("Incorrect username or password. Please try again or contact support.\n"); }
public static void handleIncorrectLoginAdmin() {
System.out.println("Incorrect Usercode or password. Please try again...!!!\n"); }
public static void handleIncorrectLoginstu() {
System.out.println("Incorrect password. Please try again or contact Staff.\n"); }
public static void invalite_operator() {
	System.out.println("Invalid operator Please Try Again\n");}
public static boolean isPasswordValid(String password) {
    boolean hasUppercase = false;
    boolean hasDigit = false;
    boolean hasSpecial = false;
    for (char ch : password.toCharArray()) {
        if (Character.isUpperCase(ch)) {
            hasUppercase = true;
        } else if (Character.isDigit(ch)) {
            hasDigit = true;
        } else if (isSpecialCharacter(ch)) {
            hasSpecial = true;
        }
    }
    return hasUppercase && hasDigit && hasSpecial;
}
private static boolean isSpecialCharacter(char ch) {
    String specialCharacters = "!@#$%^&=-_/|*()-+";
    if(specialCharacters.indexOf(ch)!=-1) {
    	return true;
    }
    else return false;
}
public  void instructionPanelForUptadeFessForParticularStudent() {
	System.out.println("\t\t\tPlease Note This ...!!!\n");
	System.out.println("\t\t\tYour Amount Willbe Added To the Total Fees of Student Not Replace The Amount ...!!!\n");
}
public static void NumberFormat() {
	System.out.println("Your Input Wrong Please Enter Number Only...!!!\n");
}
public static void OtherusingPanel(){
System.out.println("1.Work As a Staff\n2.Work As a Account Team\n3.Work As a Admission Team\n4.Other's\n5.Back\n");
System.out.println("Please Enter Your Choice");}
public static void OperationCancelled() {
	System.out.println("Operation Cancelled ...!\n");
}
public static void PublicReviewPanel() {
	System.out.printf("%-30s %-10s %-75s",
			"Name","Star","Writed Review");
	System.out.println();
}
public static void PayFeesPanel() {
	System.out.println("Do You Want To Pay Fees For Student...?\n");
}
public void PayFeesConfirmationREGPanel(String n) {
	System.out.println("Do You Want To Pay Fees For Student Name : "+n+"...?\n");
}
public static void RejectApplicationPanel() {
	System.out.println("\t\t\t\tApplication Reject Panel\n");
	System.out.println("\t\t\t1.Reject Application\t2.Back");
}
public static void ReviewPanel(){
System.out.println("\t\t\t\t\tWelcome To Review Section\n");
System.out.println("1.See Public Review's\n2.Write Your Own Review\n3.Back\n");
System.out.println("Please Enter Your Choice");}
public static void ResetPasswordUserPanel(){
System.out.println("1.Reset Staff Password\n2.Reset Accound Team Password\n3.Reset Admiision Team Password\n4.Back\n");
System.out.println("Please Enter Your Choice");}
public static void RequestForVerifyDetails() {
	 System.out.println();
	 System.out.println("Kindly Check The Details Of The Applicant Above");
	 System.out.println();
}
public static void ResetPasswordAdminPanel() { 
	System.out.println("\t\t\tChange Admin Password Or Access \n");
System.out.println("1.Change password For Admin\n2.Grand The Access For Admin to Super Admin\n3.Back\n");
System.out.println("Please Enter Your Choice");}
public static void OtherLoginChoicePanel(){
System.out.println("\n\n1.View Reviews\n2.Delete Review\n3.Create Admin Or Password Change For Admin's\n4.Back\n");
System.out.println("Please Enter Your Choice");}
public static void Studentdetailsviewformat() {
	System.out.printf("%-15s %-30s %-12s %-10s %-10s %-10s %-10s %-10s %-12s %-75s %-15s%n",
            "Regno", "Name", "DOB", "Gender", "Course", "Total_Fees", "Paid_Fees", "Pending_Fees", "Contact_no", "Address", "Password");
}
public static void Studentdetailsviewformatforstu() { 
	System.out.printf("%-15s %-30s %-12s %-10s %-10s %-12s %-75s %n",
            "Regno", "Name", "DOB", "Gender", "Course","Contact_no", "Address");
}
public static void Studentdetailsviewfees() { 
	System.out.printf("%-15s %-30s %-15s %-10s %-10s %-12s%n",
			"Regno", "Name","Coure","Total_Fees", "Paid_Fees", "Pending_Fees");
}
public static void StudentNameAlphabets() { 
	System.out.println("Student Name Should be Alphabets Only...!!!\n");		
}
public static void Statementofexitaddstu() { 
System.out.println("\t\t\tAdd Student Task Is UnSuccessful...!!!\n");
System.out.println("\t\t\tExiting....!!!");
}
public static void SeeFessDetailsChoicePanel() { 
	System.out.println("\t\t\tView Student Fees Details\n");
System.out.println("1.Particular Student Fees Details\n2.Particular Department Student Fees Details\n3.All Student Fees Details\n4.Back\n");
System.out.println("Please Enter Your Choice");}
public static void StringFormat() { 
	System.out.println("Your Input Wrong Please Enter Alphabets Only...!!!\nn");
}
public static void StarValuepanel() {  
	System.out.print("\t\t\t\tPublic Review : ");
}
public static void SeeFeesUpdateHistoryChoicePanel() { 
	System.out.println("\t\t\tView Fees Update History \n");
System.out.println("1.Specific Date Fees Update History\n2.Specific User Fees Update History\n3.Specific Student Fees Update History\n4.Full Fees Update History\n5.Back\n");
System.out.println("Please Enter Your Choice");}
public static void UsersViewFormat() { 
	System.out.printf("%-30s %-30s%n",
			"Username", "Password");}
public static void UsersViewFormatForAdmin() { 
	System.out.printf("%-30s %-30s- %-30s%n",
			"Username", "Password","Access");}
public static void UsersCondrolPanel() { 
	System.out.println("\t\t\tUser's Panel\n");
System.out.println("1.Adding User's\n2.Password Reset For User's\n3.View User's List\n4.Delete User's List\n5.Back\n");
System.out.println("Please Enter Your Choice");}
public static void UptadeFessForParticularStudentPanel() { 
	System.out.println("Do You Want To Update Fees For Student...?");}
public static void UptadeFessForParticularDEPTStudentPanel() { 
	System.out.println("Do You Want To Update Fees For Particular Department Students...?");}
public void UptadeFessForParticularStudentPanelREG(String n) { 
	System.out.println("Do You Want To Update Fees For Student Name : "+n+"...?\n");
}
public void UptadeFessForParticularDeptPanelREG(String n) { 
	System.out.println("Do You Want To Update Fees For All "+n+" Student's...?\n");
}
public static void ViewUsersListCondrolPanel() {
	System.out.println("\t\t\tView User's List\n");
System.out.println("1.View Staff User's Details\n2.View Account Team User's Details\n3.View Admission Team User's Details\n4.Back\n");
System.out.println("Please Enter Your Choice");}
public static void ViewStaffUsersListCondrolPanel() { 
	System.out.println("\t\t\tView Staff User's List\n");
System.out.println("1.View Particular Staff User's Details\n2.View All Staff User's Details\n3.Back\n");
System.out.println("Please Enter Your Choice");}
public static void ViewAccountTeamUsersListCondrolPanel() { 
	System.out.println("\t\t\tView Account Team User's List\n");
System.out.println("1.View Particular Account Team User's Details\n2.View All Account Team User's Details\n3.Back\n");
System.out.println("Please Enter Your Choice");}
public static void ViewAdmissionTeamUsersListCondrolPanel() {
	System.out.println("\t\t\tView Admission Team User's List\n");
System.out.println("1.View Particular Admission Team User's Details\n2.View All Admission Team User's Details\n3.Back\n");
System.out.println("Please Enter Your Choice");}
public static void ViewStudentdetailsPanel(){ 
System.out.println("\n1.View a Particular Student Details\n2.View a Particular Department Students Details\n3.View All Student Details\n4.Back\n");
System.out.println("\t\tPlease Enter Your Choice ");
}
public static void ViewApplicationChoosePanel() {
System.out.println("\n1.View a Particular Application \n2.View All Application \n3.Back\n");
System.out.println("\t\tPlease Enter Your Choice ");
}
public static void ViewReviewsPanelforAdmin() {
	System.out.printf("%-20s %-30s %-50s %-10s %-75s %n",
			"Review Number","Name","Email Id","Star","Writed Review");
	System.out.println();
}
public static void WelcomePanelforLoginPage(){ 
System.out.println("\t1.Staff\t\t2.Students \t\t3.Admin\t\t4.Admission Team\t\t5.Account Team\t\t6.Back\n");
System.out.println("\t\tPlease Enter Your Choice ");
}
public static void WelcomePanelforPublicPage(){ 
	System.out.println("\t1.About Us\t\t2.Admission Page \t\t3.Review\t\t4.Contact Us\t\t5.Back\n");
	System.out.println("\t\tPlease Enter Your Choice ");}
public static void WelcomePanel(){ 
System.out.println("\t\t\tWelcome to ABC Engineering College\n");
System.out.println("\t1.Public User's (As a Guest)\t\t2.Login Page \t\t3.Exit");
}
public static void WelcomeStudentPanel(){ 
	System.out.println("1.View your Personal details\n2.View Your Fees Details\n3.Back\n");	
	System.out.println("\t\tEnter the Choice : ");	
}
public static void WriteReviewPanel() {
	System.out.println("\t\t\t\tWrite a Review About Our College");
}
}