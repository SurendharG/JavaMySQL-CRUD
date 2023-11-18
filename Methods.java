package project;
import java.util.Scanner;
public class Methods extends Formats{
public static void PUBLICPAGE() {
		Scanner sc=new Scanner(System.in);
		boolean exit=true;
		if(exit==true){
	while(exit) {
		WelcomePanelforPublicPage();
		int option=Asking_Int();
	if(option==1)
	{
	Aboutus();
	}
	else if (option==2) 
	{
	Admission();
	}
	else if (option==3) 
	{
	Review();
	}
	else if(option==4)
	{	
	Contactus();	
	}
	else if(option==5)
	{	
		break;
	}
	else 	
		invalite_operator();
	}}
	}	
public static void LOGINPAGE() {
	Scanner sc=new Scanner(System.in);
	boolean exit=true;
	if(exit==true)
{
while(exit) {
	WelcomePanelforLoginPage();
	int option=Asking_Int();
if(option==1)
{
ExitingStaff();
}
else if (option==2) 
{
	Student();
}
else if (option==3) 
{
	Admin();
}
else if (option==4) 
{
	ExitingAdmissionTeam();
}
else if (option==5) 
{
	ExitingAccountTeam();
}
else if(option==6)
{	
	break;
}
else 	
	invalite_operator();
}}
}	
public static void Admin() {
	Scanner sc=new Scanner(System.in);
	DB_CODE cr=new DB_CODE();
	System.out.println("\n\t ADMIN LOGIN PAGE ");
	System.out.print("Enter UserName : ");
	String un=sc.nextLine();
	System.out.print("Enter Password : ");
	String pa=sc.nextLine();
	boolean rest=cr.loginstaffadmin(un,pa);
	if(rest) {
	while(rest) {
		AdminWelcomePanel();
		 int c=Asking_Int();
			if(c==1) {UsersCondrol();}
			else if(c==2) {Others(un);}
			else if(c==3) { break;}
			else 	invalite_operator();}}
	else {handleIncorrectLogin();}
}
public static void Addusers() { 
	boolean de=true;
	while(de) {
		AddingUserPanel();
	int d=Asking_Int();
	if(d==1) {AddStaff();}
	else if(d==2) {
		AddAccountTeamUser();
		}
	else if(d==3) {
		AddAdmissionTeamUser();	
		}
	else if(d==4) { break;
	}
	else 	invalite_operator();
	}}
public static void AccountHistory() {
	boolean res=true;
while(res)
{	AcccountHistoryChoicePanel();
 int ch=Asking_Int();
if(ch==1) 
{SeeSpecificDateHistory();}
else if(ch==2) {SeeSpecificUserHistory();}
else if(ch==3) {SeeSpecificStudentHistory();}
else if(ch==4) {SeeTotalHistory();}
else if(ch==5) {break;}
else invalite_operator();
}}
public static void Admissionteampasswordchange() {
	DB_CODE cr=new DB_CODE();	
	AskingUserName();
	String i=CheckusernameifAdmission();
	AskingNewPassword();
	String s=GetPass();
int r=cr.updatepasswordforadmission(i,s);
System.out.println((r>=1)?"New Password Updated":"Not Updated");}
public static void Accountteampasswordchange() {
	DB_CODE cr=new DB_CODE();	
	AskingUserName();
	String i=CheckusernameifAccount();
	AskingNewPassword();
	String s=GetPass();
int r=cr.updatepasswordforaccount(i,s);
System.out.println((r>=1)?"New Password Updated":"Not Updated");}
public static void AddStaff() {
		DB_CODE cr=new DB_CODE();	
		System.out.println("\n\t Add Account For Staff\n");
			AskingNewUserName();
			String un=Checkusername();
			AskingNewPassword();
			String pw=GetPass();	
			int r=cr.insert(un,pw);
				System.out.println((r>=1)?"New User Added":"New User Not Added");
				}
public static void AddAccountTeamUser() {
	DB_CODE cr=new DB_CODE();	
	System.out.println("\n\t Add Account For Account Team\n");
		AskingNewUserName();
		String un=Checkusernameaccount();
		AskingNewPassword();
		String pw=GetPass();
		int r=cr.inserttoaccountteam(un,pw);
			System.out.println((r>=1)?"New User Added":"New User Not Added Please tey again");
			}
public static void AddAdmissionTeamUser() {
	DB_CODE cr=new DB_CODE();	
	System.out.println("\n\t Add Account For Admission Team\n");
		AskingNewUserName();
		String un=CheckusernameAdmission();
		AskingNewPassword();
		String pw=GetPass();
		int r=cr.inserttoadmissionteam(un,pw);
			System.out.println((r>=1)?"New User Added":"New User Not Added Please tey again");
			}
public static void AddStudent() { 
	DB_CODE cr=new DB_CODE();
	boolean e=true;
	while(e)
		{AddStudentWecomePanel();
	AskingRegno();
	long rn=Checkregnoifnotmy();
	if(rn==0) {
		break;}
	AskingStudentNameforadd();
	String n=GetString();
	AskingDateOfBirthforadd();
	String d=Asking_Dob();
	AskingGenderforadd();
	String g=GetGender();
	AskingCourseforadd();
	String c=GetCourse();
	AskingFeesforadd();
	double f= Asking_Double();
	AskingContactNumberforadd();
	long cn=GetCn();
	AskingAddressforadd();
	String a=GetAdd();
	AskingPasswordforadd();
	String pw=GetPass();
	AddStudentconfirmPanel(rn,n,d,g,c,f,cn,a,pw);
	boolean conadmis=ConfirmAddStudent();
	if(conadmis) {
	int r=cr.insert(rn,n,d,g,c,f,cn,a,pw);
	System.out.println((r>=1)?" Added Students details":"Students details Not Added");
	break;}
	else{System.out.println("Student Details Is Not Added");break;}
		}
}
public static void ApplicationForm() {
	DB_CODE cr=new DB_CODE();	
	ApplicationFormWelcomePanel();
	Askname();
	String a=GetString();
	AskParentName();
	String b=GetString();
	AskingDateOfBirthforadd();
	String c=Asking_Dob();
	AskingGenderforadd();
	String d=GetGender();
	AskingContactNumberforadd();
	long e=GetCn();
	AskingAlternateContactNumberforadd();
	long f=GetCn();
	AskEmailid();
	String g=GetEmailId();
	AskingAddressforadd();
	String h=GetAdd();
	AskingCourseforadd();
	String i=GetCourse();
	AskingSSLCBoard();
	String j=GetBoard();
	AskingSSLCSchoolName();
	String k=GetAdd();
	AskingSSLCGrade();
	double l=GetGrade();
	String m="NA";
	String n="NA";
	double o=0;
	boolean conHSC=ConfirmHSC();
	if(conHSC) {
	AskingHSCBoard();
	 m=GetBoard();
	AskingHSCSchoolName();
	 n=GetAdd();
	AskingHSCGrade();
	 o=GetGrade();}
	String p="NA";
	double q=0;
	boolean conDIP=ConfirmDIP();
	if(conDIP) {
	AskingDiplomoUniName();
	 p=GetAdd();
	AskingDiplomoUniGrade();
	 q=GetGrade();}
	ApplicationconfirmPanel(a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q);
	boolean conadmis=ConfirmAdmision();
	if(conadmis) {
	int r=cr.ApplyAdmission(a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q);
	System.out.println((r>=1)?"Your Application Was Successfully Submitted ":"Something Went Wroung Your Application Is Not Submitted");
	cr.GetApplicationNumber(a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q);
	}
	else{System.out.println(" Your Application Is Not Submitted");		}
	}
public static void Admission() {
	boolean b=true;
	while(b){
	AdmissionPanel();
	boolean appask=ApplicationASK();
	if(appask) {
		ApplicationForm();	}
	else{break;}} }
public static void AdmissionEntry(){
	DB_CODE cr=new DB_CODE();
	boolean d =true;
	while(d) {
	boolean a=AdmissionEntryPanel();
	if(a) {
	AskApplicationId();
	int no=CheckApplicationId();
	Applicationviewformat();
	cr.ViewApplicatioParticularId(no);
	 EndofREC();
	 RequestForVerifyDetails();
	boolean c=AdmissionEntryPanel();
	if(c) {
		AskingRegno();
		long rn=Checkregnoifnot();
		AskingFeesforadd();
		double f= Asking_Double();
		AskingPasswordforadd();
		String pw=GetPass();	
	cr.AdmissionEntryDB(no,rn,f,pw);
	}
	else if(!c){OperationCancelled();}}
	else if(!a) {break;}}
}
public static void AsaStaff() {
	boolean de=true;
	while(de) {
	ASaStaffPanelForAdmin();
	int d=Asking_Int();
	if(d==1) 	  {AddStudent();}
	else if(d==2) {EditStudentDetails();}
	else if(d==3) {StudentviewbyStaff();}
	else if(d==4) {DeleteStudent();}
	else if(d==5) { break;}
	else  invalite_operator(); 
	}}
public static void AsaAccountTeam() {
	boolean res=true;
	while(res)
	{	AsaAccountTeamChoicePanel();
	 int ch=Asking_Int();
if(ch==1) {SeeFessDetails();}
else if(ch==2){AccountHistory();}
else if(ch==3){SeeFeesUpdateHistory();}
else if(ch==4) {break;}
else invalite_operator();
	}}
public static void AsaAdmissionTeam(){
	boolean res=true;
	while(res)
		{AsaAdmissionTeamChoicePanel();
		 int ch=Asking_Int();
	if(ch==1) 
		{ViewApplication();}
	else if(ch==2) 
		{RejectApplication();}
	else if(ch==3) {AdmissionEntry();}
	else if(ch==4)
		{break;}
	else invalite_operator();
		}}
public static void ChangeAdminToSuperAdmin() {
	DB_CODE cr=new DB_CODE();	
	AskingUserName();
	String i=CheckusernameifAdminfornew();
	confirmationppanelforaccesssuperadmin(i);
	boolean a=AskConfirmation();
	if(a) {
	int r=cr.updateaccessforsuperadmin(i);
	System.out.println((r>=1)?"Access Granted":"Access Denied Please Try Again Later");}
	else {	System.out.println("Operation cancelled");}	}
public static String CheckusernameAdmission() {
	DB_CODE cr=new DB_CODE();	
	String s=GetStringUsername();
	String d=cr.CheckuserNameifforadmission(s);
	if(!d.equals("1")) {
		return s;}
	else {
		System.out.println("User Name Is Already Exiting...!!!");
		System.out.println("\tEnter New User Name");
		return CheckusernameAdmission();}
	}
public static String Checkusernameaccount() { 
	DB_CODE cr=new DB_CODE();	
	String s=GetStringUsername();
	String d=cr.CheckuserNameifforaccount(s);
	if(!d.equals("1")) {
		return s;}
	else {
		System.out.println("User Name Is Already Exiting...!!!");
		System.out.println("\tEnter New User Name");
		return Checkusernameaccount();}
	}
public static String Checkusername() { 
	DB_CODE cr=new DB_CODE();	
	String s=GetStringUsername();
	String d=cr.CheckuserNameifAdmin(s);
	if(!d.equals("1")) {
		return s;}
	else {
		System.out.println("User Name Is Already Exiting...!!!");
		System.out.println("\tEnter New User Name");
		return Checkusername();
	}	
}
public static String CheckusernameifAdminfornew() {
	DB_CODE cr=new DB_CODE();	
	String s=GetStringUsername();
	String d=cr.CheckuserNameifAdmin(s);
	if(d.equals("1")) {
		return s;}
	else {
		System.out.println("User Name Is Not Exiting...!!!");
		System.out.println("\tEnter Again");
		return CheckusernameifAdminfornew();
	}	
}
public static long Checkregno() {
	DB_CODE cr=new DB_CODE();	
	long i=Asking_Long();
	long r=cr.RegNUMBER(i);
	if(r==1l) {
		return i;
	}
	else {
		System.out.println("Registor Number Is Not Exiting...!!!");
		System.out.println("\tEnter Again");
		return Checkregno();
	}
}
public static int CheckApplicationId() {
	DB_CODE cr=new DB_CODE();	
	int i=Asking_Int();
	boolean r= cr.CheckingApplicationIDif(i);
	if(r) {
		return i;
	}
	else {
		System.out.println("Applicaion Id Is Not Exiting...!!!");
		System.out.println("\tEnter Again");
		return CheckApplicationId();
	}
}
public static int CheckReviewNumber() {
	DB_CODE cr=new DB_CODE();	
	int i=Asking_Int();
	boolean r= cr.Checkingreviewnumberif(i);
	if(r) {
		return i;
	}
	else {
		System.out.println("Applicaion Id Is Not Exiting...!!!");
		System.out.println("\tEnter Again");
		return CheckReviewNumber();
	}
}
public static String Checkusernameifstaff() {
	DB_CODE cr=new DB_CODE();	
	String i=GetStringUsername();
	String r=cr.usernameifstaff(i);
	if(r=="1") {
		return i;
	}
	else {
		System.out.println("User Name Is Not Exiting...!!!");
		System.out.println("\tEnter Again");
		return Checkusernameifstaff();
	}
}
public static String CheckusernameifAdmission() {
	DB_CODE cr=new DB_CODE();	
	String i=GetStringUsername();
	String r=cr.usernameifadmission(i);
	if(r=="1") {
		return i;
	}
	else {
		System.out.println("User Name Is Not Exiting...!!!");
		System.out.println("\tEnter Again");
		return CheckusernameifAdmission();
	}
}
public static String CheckusernameifAccount() {
	DB_CODE cr=new DB_CODE();	
	String i=GetStringUsername();
	String r=cr.usernameifaccount(i);
	if(r=="1") {
		return i;
	}
	else {
		System.out.println("User Name Is Not Exiting...!!!");
		System.out.println("\tEnter Again");
		return CheckusernameifAccount();
	}
}
public static long Checkregnoifnotmy() {
	DB_CODE cr=new DB_CODE();	
	int j=0;
	long i=Asking_Long(j);
	if(i!=0) {
	long r=cr.RegNUMBER(i);
	if(r!=1l) {
		return i;
	}
	else {
		System.out.println("Registor Number Is Already Exiting...!!!");
		System.out.println("\tEnter New Regno Number ");
		return Checkregnoifnot();}}
	else return 0;
}
public static long Checkregnoifnot() {
	DB_CODE cr=new DB_CODE();	
	long i=Asking_Long();
	long r=cr.RegNUMBER(i);
	if(r!=1l) {
		return i;
	}
	else {
		System.out.println("Registor Number Is Already Exiting...!!!");
		System.out.println("\tEnter New Regno Number ");
		return Checkregnoifnot();}}
public static void Contactus() {
	DB_CODE cr=new DB_CODE();
	cr.contactusdb();
}
public static void CreateAdminorPasswordChange(String u) {
	DB_CODE cr=new DB_CODE();	
	boolean c=cr.CheckSuperAdmin(u);
	if(c) {
		while(c) {
			CreateAdminorPasswordChangePanel();
			 int ch=Asking_Int();
		if(ch==1) {CreateAdmin();
			}
		else if(ch==2) {ResetAdminPassword();
			}
		else if(ch==3) {
			ViewAdminList();
		}
		else if(ch==4) {
			DeleteAdminUserDetails();
		}
		else if(ch==5)
			{break;}
		else invalite_operator();
		}}
	else {
		System.out.println("Your Not a super Admin");
		System.out.println("You Can't Change Password or Create Admin's");
		System.out.println("Please Contact Super Admin");
	}
}
public static void CreateAdmin() {
	DB_CODE cr=new DB_CODE();	
	System.out.println("\n\t\t Add  Admin\n");
		AskingNewUserName();
		String un=Checkusername();
		AskingNewPassword();
		String pw=GetPass();	
		int r=cr.insertAdmin(un,pw);
			System.out.println((r>=1)?"New Admin Added":"New User Admin Added");
			}
public static void Aboutus() {
	DB_CODE cr=new DB_CODE();
	cr.Aboutusdb();
}
public static void Deleteusers() {
	boolean de=true;
	while(de) {
		DeleteUsersListCondrolPanel();
	int d=Asking_Int();
	if(d==1) {DeleteStaffUserDetails();}
	else if(d==2) {DeleteAccountTeamUserDetails();	}
	else if(d==3) {DeleteAdmissionTeamUserDetails(); 	}
	else if(d==4) { break;}
	else 	invalite_operator();
	}}
public static void DeleteAdminUserDetails() {
	DB_CODE cr=new DB_CODE();
	DeleteAdminAccessPanel();
	AskingUserName();
	String i=CheckusernameifAdminfornew();
	System.out.println("Do You Want To Delete "+i+" From Admin Access...?");
	boolean c=AskConfirmation();
	if(c) {
	int r=cr.deleteadmin(i);
	System.out.println((r>=1)?"Succesfully Admin Access Deleted":"Admin Access Not Deleted");
	}
	else{OperationCancelled();}
}
public static void DeleteStaffUserDetails() {
	DB_CODE cr=new DB_CODE();
	DeleteStaffAccessPanel();
	AskingUserName();
	String i=Checkusernameifstaff();
	System.out.println("Do You Want To Delete "+i+" From Staff Access...?");
	boolean c=AskConfirmation();
	if(c) {
	int r=cr.deletestaffuserdetails(i);
	System.out.println((r>=1)?"Succesfully Staff Access Deleted":"Staff Access Not Deleted");
	}
	else{OperationCancelled();}
}
public static void DeleteAccountTeamUserDetails() {
	DB_CODE cr=new DB_CODE();
	DeleteAccountTeamAccessPanel();
	AskingUserName();
	String i=CheckusernameifAccount();
	System.out.println("Do You Want To Delete "+i+" From Account Team Access...?");
	boolean c=AskConfirmation();
	if(c) {
	int r=cr.deleteAccountTeamuserdetails(i);
	System.out.println((r>=1)?"Succesfully Account Team Access Deleted":"Soory...!  Account Team Access Not Deleted");
	}
	else{OperationCancelled();}
	}
public static void DeleteAdmissionTeamUserDetails() {
	DB_CODE cr=new DB_CODE();
	DeleteAdmissionTeamAccessPanel();
	AskingUserName();
	String i=CheckusernameifAdmission();
	System.out.println("Do You Want To Delete "+i+" From Admission Team Access...?");
	boolean c=AskConfirmation();
	if(c) {
	int r=cr.deleteAdmissionTeamuserdetails(i);
	System.out.println((r>=1)?"Succesfully Admission Team Access Deleted":"Soory...!  Admission Team Access Not Deleted");
	}
	else{OperationCancelled();}
	}
public static void DeleteStudent() {
	DB_CODE cr=new DB_CODE();	
System.out.println("\n\tTo Delete Students details\n");
AskingRegno();
long i=Checkregno();
System.out.println("Do You Want To Delete "+i+" From Student Details...?");
boolean c=AskConfirmation();
if(c) {
int r=cr.delete(i);
System.out.println((r>=1)?"Students details Deleted":"Students details Not Deleted");
}
else{OperationCancelled();}
}
public static void EditName() {

	DB_CODE cr=new DB_CODE();
	AskingRegno();
	long i=Checkregno();
	AskingStudentNameforEdit();
	String s=GetString();
		int r=cr.updatename(i,s);
		System.out.println((r>=1)?"New Name Updated":"Not Updated Please try again");
	}
public static void EditDOB() {
	DB_CODE cr=new DB_CODE();	
	AskingRegno();
	long i=Checkregno();
	AskingDateOfBirthforEdit();
	String s=Asking_Dob();
	int r=cr.updatedob(i,s);
	System.out.println((r>=1)?"New DOB Updated":"Not Updated Please try again");
	}
public static void EditGender() {
	DB_CODE cr=new DB_CODE();	
	AskingRegno();
	long i=Checkregno();
	AskingGenderforEdit();
	String s=GetGender();
	int r=cr.updategender(i,s);
	System.out.println((r>=1)?"New Gender Updated":"Not Updated Please try again");}
public static void EditCourse() {
	DB_CODE cr=new DB_CODE();	
	AskingRegno();
	long i=Checkregno();
	AskingCourseforEdit();
	String s=GetCourse();
int r=cr.updatecourse(i,s);
System.out.println((r>=1)?"New Course Updated":"Not Updated Please try again");}
public static void EditFees() {
	DB_CODE cr=new DB_CODE();	
	AskingRegno();
	long i=Checkregno();
	 AskingFeesforEdit() ;
		double f= Asking_Double();
int r=cr.updatefees(i,f);
System.out.println((r>=1)?"New Fees Updated":"Not Updated");}
public static void EditContactNumber() {
	DB_CODE cr=new DB_CODE();	
	AskingRegno();
	long i=Checkregno();
	AskingContactNumberforEdit();
	long cn=GetCn();
int r=cr.updatecn(i,cn);
System.out.println((r>=1)?"New Contact Number Updated":"Not Updated");}
public static void EditAddress() {
	DB_CODE cr=new DB_CODE();	
	AskingRegno();
	long i=Checkregno();
	AskingAddressforEdit();
String s=GetAdd();
int r=cr.updateaddress(i,s);
System.out.println((r>=1)?"New Address  Updated":"Not Updated");}
public static void EditStudentPassword() {
	DB_CODE cr=new DB_CODE();	
	AskingRegno();
	long i=Checkregno();
	AskingPasswordforEdit();
	String s=GetPass();
int r=cr.updatepassword(i,s);
System.out.println((r>=1)?"New Password Updated":"Not Updated");}
public static void EditStudentdetails() {
	boolean exitup=true;
	if(exitup)
		{while(exitup) 
		{EditChoicePanel();
		int esd=Asking_Int();
	if(esd==1)
	EditName();
	else if(esd==2)
		EditDOB();
	else if(esd==3)
		EditGender();
	else if(esd==4)
		EditCourse();
	else if(esd==5)
			EditFees();
	else if(esd==6) 
		EditContactNumber();
	else if(esd==7)
		EditAddress();
	else if(esd==8)
		EditStudentPassword();
	else if(esd==9)
		break;
	else  invalite_operator();
		}}
}
public static void EditStudentDetails(){
	boolean exitup=true;
	if(exitup)
		{	while(exitup) 
		{	EditChoicePanel();
		int esd=Asking_Int();
	if(esd==1)
	EditName();
	else if(esd==2)
		EditDOB();
	else if(esd==3)
		EditGender();
	else if(esd==4)
		EditCourse();
//	else if(esd==5)
//			EditFees();
	else if(esd==6) 
		EditContactNumber();
	else if(esd==7)
		EditAddress();
	else if(esd==8)
		EditStudentPassword();
	else if(esd==9)
		break;
	else  invalite_operator();
		}}
}
public static void ExitingAdmissionTeam() {
	DB_CODE cr=new DB_CODE();	
		{	AskingUserName();
			String u=Asking_String();
			AskingPassword();
			String p=Asking_String();
			boolean res=cr.loginAdmissionTeamUser(u,p);
	if(res)
		{while(res)
		{	
			ExitingAdmissionTeamChoicePanel();
		 int ch=Asking_Int();
	if(ch==1) 
		{ViewApplication();}
	else if(ch==2) 
		{RejectApplication();}
	else if(ch==3) {AdmissionEntry();}
	else if(ch==4)
		{break;}
	else invalite_operator();
		}}
	else if (!res) 
	handleIncorrectLogin();
		}}
public static void ExitingStaff() {
	DB_CODE cr=new DB_CODE();	
		{	AskingUserName();
			String u=Asking_String();
			AskingPassword();
			String p=Asking_String();
			boolean res=cr.loginStaff(u,p);
	if(res)
		{while(res)
		{	ExitingStaffChoicePanel();
		int ch=Asking_Int();
	if((ch==1))
		{AddStudent();}
	else if(ch==2) 
		{
		EditStudentDetails();
		}
	else if(ch==3)
		{
		StudentviewbyStaff();
		}
	else if(ch==4)
		{DeleteStudent();
		}
	else if(ch==5)
			break;
	else invalite_operator();
		}}
	else if (!res) 
	handleIncorrectLogin();
		}}
public static void ExitingAccountTeam() {
	DB_CODE cr=new DB_CODE();	
		{	AskingUserName();
			String u=Asking_String();
			AskingPassword();
			String p=Asking_String();
			boolean res=cr.loginAccountTeamUser(u,p);
	if(res)
		{while(res)
		{	ExitingAccountTeamChoicePanel();
		 int ch=Asking_Int();
	if(ch==1) 
		{PayFees(u);}
	else if(ch==2) {UptadeFessForParticularStudent(u);}
	else if(ch==3) {SeeFessDetails();}
	else if(ch==4){AccountHistory();}
	else if(ch==5){SeeFeesUpdateHistory();}
	else if(ch==6) {break;}
	else invalite_operator();
		}}
	else if (!res) 
	handleIncorrectLogin();
		}}
public static String GetGmaiForReview() { 
	DB_CODE cr=new DB_CODE();	
	String i=GetEmailId();
	boolean r=cr.gmailidifinreview(i);
	if(r) {
		return i;
	}
	else {
		System.out.println("This Email Already Writed the review...!!!");
		System.out.println("\tEnter Another Email");
		return GetGmaiForReview();
	}
}
public static void Others(String u) { 
	boolean de=true;
	while(de) {
	OtherusingPanel();
	int d=Asking_Int();
	if(d==1) 	  {AsaStaff();
	}
	else if(d==2) {AsaAccountTeam();
	}
	else if(d==3) {AsaAdmissionTeam();
	}
	else if(d==4) {OtherLogin(u);
		}
	else if(d==5) { break;}
	else 	invalite_operator(); 
	}}
public static void OtherLogin(String u){
	boolean res=true;
	while(res)
		{OtherLoginChoicePanel();
		 int ch=Asking_Int();
	if(ch==1) {ViewReviews();
		}
	else if(ch==2) {DeleteReview();
		}
	else if(ch==3) {
		CreateAdminorPasswordChange(u);
	}
	else if(ch==4)
		{break;}
	else invalite_operator();
		}}
public static void RejectApplication() {
	DB_CODE cr=new DB_CODE();
	boolean d =true;
	while(d) {
	RejectApplicationPanel();
	boolean a=AskConfirmationrej();
	if(a) {
	AskApplicationId();
	int no=CheckApplicationId();
	System.out.println("Do You Want To Delete This Application (Application Id : "+no+")...?");
	boolean c=AskConfirmation();
	if(c) {
	int r=cr.RejectApplicationDB(no);
	System.out.println((r>=1)?"Succesfully Application Is Deleted":"Soory..!!!\n Application is Not Deleted");
	}
	else if(!c){OperationCancelled();}}
	else if(!a) {break;}}
}
public static void DeleteReview() {
	DB_CODE cr=new DB_CODE();
	DeleteReviewpanel();
	System.out.println("Enter The Review Number :");
	int no=CheckReviewNumber();
	System.out.println("Do You Want To Delete This Review Number : "+no+"...?");
	boolean c=AskConfirmation();
	if(c) {
	int r=cr.RejectReviewDB(no);
	System.out.println((r>=1)?"Succesfully Review Is Deleted":"Soory..!!!\n Review is Not Deleted");
	}
	else if(!c){OperationCancelled();}}
public static void Review() {
	boolean de=true;
	while(de) {
	ReviewPanel();
	int d=Asking_Int();
	if(d==1) {
		SeePublicReview();
			}
	else if(d==2) {
		WriteReview();
				}
	else if(d==3) { break;
				}
	else 	invalite_operator();
	}
}
public static void ResetusersPassword() {
	boolean de=true;
	while(de) {
	ResetPasswordUserPanel();
	int d=Asking_Int();
	if(d==1) {staffpasswordchange();
			}
	else if(d==2) {Accountteampasswordchange();	
				}
	else if(d==3) {Admissionteampasswordchange();	
				}
	else if(d==4) { break;
				}
	else 	invalite_operator();
	}}
public static void ResetAdminPassword() {
	boolean de=true;
	while(de) {
	ResetPasswordAdminPanel();
	int d=Asking_Int();
	if(d==1) {PasswordChangeForAdmin();
			}
	else if(d==2) {ChangeAdminToSuperAdmin();	
				}
	else if(d==3) { break;
				}
	else 	invalite_operator();
	}}
public static void PayFees(String u){ 
	DB_CODE cr=new DB_CODE();
	boolean d =true;
	while(d) {
	PayFeesPanel();
	boolean a=AskConfirmation();
	if(a) {
		AskingRegno();
		long no=Checkregno();
		Studentdetailsviewfees();
			cr.viewpartstudentForAccoundTeam(no);
			 EndofREC();
			cr.FeesConfirmationPanelwithname(no,u);
	}
	else if(!a) {break;}
	}
}
public static void PasswordChangeForAdmin() {
	DB_CODE cr=new DB_CODE();	
	AskingUserName();
	String i=CheckusernameifAdminfornew();
	AskingNewPassword();
	String s=GetPass();
int r=cr.updatepasswordforAdmin(i,s);
System.out.println((r>=1)?"New Password Updated":"Not Updated");}
public static void SeePublicReview(){
	DB_CODE cr=new DB_CODE();	
	starvalue();
	PublicReviewPanel();
	cr.SeePublicReviewdb();
	System.out.println();
	 EndofREC();
	 }
public static void SeeFeesUpdateHistory() {
	boolean res=true;
while(res)
{	SeeFeesUpdateHistoryChoicePanel();
 int ch=Asking_Int();
 if(ch==1) {SeeSpecificDateFeesUpdateHistory();}
else if(ch==2) {SeeSpecificUserFeesUpdateHistory();}
else if(ch==3) {SeeSpecificStudenFeesUpdateHistory();}
else if(ch==4) {SeeTotalFeesUpdateHistory();}
else if(ch==5) {break;}
else invalite_operator();
}}
public static void starvalue() {
	DB_CODE cr=new DB_CODE();
	StarValuepanel();
	cr.StarvalueAverage();
	System.out.println();
	System.out.println();
	System.out.println();
}
public static void staffpasswordchange() {
	DB_CODE cr=new DB_CODE();	
	AskingUserName();
	String i=Checkusernameifstaff();
	AskingNewPassword();
	String s=GetPass();
int r=cr.updatepasswordforstaff(i,s);
System.out.println((r>=1)?"New Password Updated":"Not Updated");}
public static void Student(){
				boolean exit=true;
		if(exit)
			{	while(exit) 
			{	WelcomeStudentPanel();
			int st=Asking_Int();
		if(st==1) 
			Studentviewperde();
		else if(st==2) 
			Studentviewfees();
		else if (st==3) 
			break;	
		else 	invalite_operator() ;
			}}}
public static void StudentviewbyStaff(){
	DB_CODE cr=new DB_CODE();	
boolean exits=true;
if(exits)
	{	while(exits)
	{	ViewStudentdetailsPanel();
	int vsdo=Asking_Int();
if(vsdo==1) {
	AskingRegno();
	long no=Checkregno();
		Studentdetailsviewformat();
		cr.viewpartstudent(no);
		 EndofREC();}
else if(vsdo==2) {
	AskingCourseforadd();
	String s=GetCourse();
	Studentdetailsviewformat();
		cr.viewpartdeptstudent(s);
		 EndofREC();}
else if(vsdo==3)
	{	Studentdetailsviewformat();
	cr.select();
	 EndofREC();			}
else if(vsdo==4) 
		break;
else  
		invalite_operator();
	}}}
public static void Studentviewperde() {
	DB_CODE cr=new DB_CODE();	
	{	
		AskingRegno();
		long no=Checkregno();
		AskingPassword();
		String d=Asking_String();
	boolean res=cr.stuselect(no,d);
if(res) 
{	Studentdetailsviewformatforstu();
	cr.studentviewperde(no);
	System.out.println();
	 EndofREC();
}
else if (!res)
	handleIncorrectLoginstu();
}
}
public static void Studentviewfees() {
	DB_CODE cr=new DB_CODE();	
	{	
		AskingRegno();
		long no=Checkregno();
		AskingPassword();
		String d=Asking_String();
	boolean res=cr.stuselect(no,d);
if(res) 
{	Studentdetailsviewfees();
	cr.studentviewfees(no);
	System.out.println();
	 EndofREC();
}
else if (!res)
	handleIncorrectLoginstu();
}
}
public static void SeeFessDetails() {
			boolean res=true;
		while(res)
		{	SeeFessDetailsChoicePanel();
		 int ch=Asking_Int();
	if(ch==1) 
		{SeeParticularStudentFeesDetails();}
	else if(ch==2) {SeeParticularDepartmentStudentFees();}
	else if(ch==3) {SeeAllStudentFeesDetails();}
	else if(ch==4) {break;}
	else invalite_operator();
		}}
public static void SeeSpecificDateHistory(){
	DB_CODE cr=new DB_CODE();
	AskingStartDate();
		String SD=Asking_Date();
		AskingEndDate();
		String ED=Asking_Dob(SD);
		AccountHistoryFormat();
			cr.ViewSpecificDateAccountHistory(SD,ED);
			 EndofREC();}
public static void SeeSpecificDateFeesUpdateHistory(){
	DB_CODE cr=new DB_CODE();
	AskingStartDate();
		String SD=Asking_Date();
		AskingEndDate();
		String ED=Asking_Dob(SD);
		FeesUpdateHistoryFormat();
			cr.ViewSpecificDateFeesUpdateHistory(SD,ED);
			 EndofREC();}
public static void SeeSpecificUserHistory(){
	DB_CODE cr=new DB_CODE();
	AskingUserName();
	String s=CheckusernameifAccount();
		AccountHistoryFormat();
			cr.ViewSpecificcUserAccountHistory(s);
			 EndofREC();}
public static void SeeSpecificUserFeesUpdateHistory(){
	DB_CODE cr=new DB_CODE();
	AskingUserName();
	String s=CheckusernameifAccount();
	FeesUpdateHistoryFormat();
			cr.ViewSpecificcUserFeesUpdateHistory(s);
			 EndofREC();}
public static void SeeSpecificStudentHistory(){
	DB_CODE cr=new DB_CODE();
	AskingRegno();
	long no=Checkregno();
	AccountHistoryFormat();
			cr.ViewSpecificcUserAccountHistory(no);
			 EndofREC();}
public static void SeeSpecificStudenFeesUpdateHistory(){
	DB_CODE cr=new DB_CODE();
	AskingRegno();
	long no=Checkregno();
	FeesUpdateHistoryFormat();
			cr.ViewSpecificcUserFeesUpdateHistory(no);
			 EndofREC();}
public static void SeeTotalHistory(){
	DB_CODE cr=new DB_CODE();
		AccountHistoryFormat();
			cr.ViewTotalAccountHistory();
			 EndofREC();}
public static void SeeTotalFeesUpdateHistory(){
	DB_CODE cr=new DB_CODE();
	FeesUpdateHistoryFormat();
			cr.ViewTotalFeesUpdateHistory();
			 EndofREC();}
public static void SeeParticularStudentFeesDetails(){
	DB_CODE cr=new DB_CODE();
	AskingRegno();
		long no=Checkregno();
		Studentdetailsviewfees();
			cr.viewpartstudentForAccoundTeam(no);
			 EndofREC();}
public static void SeeParticularDepartmentStudentFees(){
	DB_CODE cr=new DB_CODE();
	AskingCourseforadd();
	String s=GetCourse();
	Studentdetailsviewfees();
		cr.viewpartstudentForAccoundTeam(s);
		 EndofREC();}
public static void SeeAllStudentFeesDetails(){
	DB_CODE cr=new DB_CODE();
		Studentdetailsviewfees();
			cr.viewpartstudentFeesForAccoundTeam();
			 EndofREC();}
public static void UsersCondrol() {
boolean de=true;
while(de) {
	UsersCondrolPanel();
	int d=Asking_Int();
if(d==1) {Addusers();}
else if(d==2) {	ResetusersPassword(); }
else if(d==3) {ViewusersList();}
else if(d==4) {Deleteusers();
	}
else if(d==5) {break;
		}
else 	invalite_operator(); 
}}
public static void UptadeFessForParticularStudent(String u){ 
	DB_CODE cr=new DB_CODE();
	boolean d =true;
	while(d) {
		UptadeFessForParticularStudentPanel();
	boolean a=AskConfirmation();
	if(a) {
		AskingRegno();
		long no=Checkregno();
		Studentdetailsviewfees();
			cr.viewpartstudentForAccoundTeam(no);
			 EndofREC();
			cr.UptadeFessForParticularStudentPanel(no,u);
	}
	else if(!a) {break;}
	}
}
public static void ViewusersList() {
	boolean de=true;
	while(de) {
		ViewUsersListCondrolPanel();
	int d=Asking_Int();
	if(d==1) {ViewStaffusersDetails();}
	else if(d==2) {ViewAccountTeamusersDetails();	}
	else if(d==3) {ViewAdmissionTeamusersDetails(); 	}
	else if(d==4) { break;}
	else 	invalite_operator();
	}}
public static void ViewStaffusersDetails() {

	boolean de=true;
	while(de) {
		ViewStaffUsersListCondrolPanel();
	int d=Asking_Int();
	if(d==1) {ViewParticularstaffUserDedails();}
	else if(d==2) {ViewAllstaffUserDedails();	}
	else if(d==3) { break;}
	else 	invalite_operator();
	}}
public static void ViewAccountTeamusersDetails() {
	boolean de=true;
	while(de) {
		ViewAccountTeamUsersListCondrolPanel();
	int d=Asking_Int();
	if(d==1) {ViewParticularAccountTeamUserDedails();}
	else if(d==2) {ViewAllAccountTeamUserDedails();	}
	else if(d==3) { break;}
	else 	invalite_operator();
	}}
public static void ViewAdmissionTeamusersDetails() {
	boolean de=true;
	while(de) {
		ViewAdmissionTeamUsersListCondrolPanel();
	int d=Asking_Int();
	if(d==1) {
		ViewParticularAdmissionTeamUserDedails();
		}
	else if(d==2) {ViewAllAdmissionTeamUserDedails();	
	}
	else if(d==3) { break;}
	else 	invalite_operator();
	}}
public static void ViewParticularstaffUserDedails() {
	DB_CODE cr=new DB_CODE();
	AskingUserName();
	String s=Checkusernameifstaff();
	UsersViewFormat();
	cr.ViewParticularstaffUserDedailsbyadmin(s);
	EndofREC();
}
public static void ViewParticularAccountTeamUserDedails(){
	DB_CODE cr=new DB_CODE();
	AskingUserName();
	String s=CheckusernameifAccount();
	UsersViewFormat();
	cr.ViewParticularAccountUserDedailsbyadmin(s);
	EndofREC();
}
public static void ViewParticularAdmissionTeamUserDedails() {
	DB_CODE cr=new DB_CODE();
	AskingUserName();
	String s=CheckusernameifAdmission();
	UsersViewFormat();
	cr.ViewParticularAdmissionUserDedailsbyadmin(s);
	EndofREC();
}
public static void ViewAllstaffUserDedails() {
	DB_CODE cr=new DB_CODE();
	UsersViewFormat();
	cr.ViewAllstaffUserDedailsbyadmin();
	EndofREC();
}
public static void ViewAllAccountTeamUserDedails() {
	DB_CODE cr=new DB_CODE();
	UsersViewFormat();
	cr.ViewAllAccountUserDedailsbyadmin();
	EndofREC();
}
public static void ViewAdminList() {
	DB_CODE cr=new DB_CODE();
	UsersViewFormatForAdmin();
	cr.ViewAdminUserDedails();
	EndofREC();
}
public static void ViewAllAdmissionTeamUserDedails() {
	DB_CODE cr=new DB_CODE();
	UsersViewFormat();
	cr.ViewAllAdmissionUserDedailsbyadmin();
	EndofREC();
}
public static void ViewApplication(){
	DB_CODE cr=new DB_CODE();	
	boolean exits=true;
if(exits)
	{	while(exits)
	{	ViewApplicationChoosePanel();
	int vsdo=Asking_Int();
if(vsdo==1) {
	AskApplicationId();
	int no=CheckApplicationId();
		Applicationviewformat();
		cr.ViewApplicatioParticularId(no);
		 EndofREC();}
else if(vsdo==2)
	{	
	Applicationviewformat();
	cr.ViewApplications();
	 EndofREC();			}
else if(vsdo==3) 
		break;
else  
		invalite_operator();
	}}}
public static void WriteReview() { 
	DB_CODE cr=new DB_CODE();	
	WriteReviewPanel();
	AskEmailid();
	String s=GetGmaiForReview();
	Askname();
	String n=GetString();
	AskStar();
	int st=Getstar();
	AskOther();
	String o=GetAdd();
	int r=cr.updatereviewfrompublic(st,o,s,n);
	System.out.println((r>=1)?" \t\t\t\tThank You For Reviewing \n \t\t\t\tYour Review Updated":"\t\t\tReview Not Updated Please try Again");
}
public static void ViewReviews(){
	DB_CODE cr=new DB_CODE();	
	starvalue();
	ViewReviewsPanelforAdmin();
	cr.SeePublicReviewdbforadmin();
	System.out.println();
	 EndofREC();
	 }
}