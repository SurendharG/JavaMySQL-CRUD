package project;
import java.util.Scanner;
public class MAIN {
	public static void main(String[] args) {
		DB_CODE cr=new DB_CODE();	
				Scanner sc=new Scanner(System.in);
				System.out.println("\tWelcome to college institute");
				System.out.println("Press 1 For Staff or Press 2 For Studetns or Press 3 For Exit");
				int option=sc.nextInt();
		        boolean exit = false;
				do 
				{
				if(option==1)
					{		System.out.println("\tWelcome Staff!! ");
							System.out.println("1.New user \n2.Existing user\n3.Exit");
							System.out.print("Enter the Choice : ");
							int sele=sc.nextInt();
				if(sele==1)
					{		System.out.println("\n\tTo Add Account\n");
							System.out.print("Enter new username: ");
							String un=sc.next();
							System.out.print("Enter new password: ");
							String pw=sc.next();
							int r=cr.insert(un,pw);
							System.out.println((r>=1)?" Add user":"Not Add user");
					}
				else if(sele==2) 
					{		System.out.print("Enter the UserName : ");
							String u=sc.next();
							System.out.print("Enter the Password : ");
							String p=sc.next();
						boolean res=cr.login(u,p);
				if(res==true)
					{	while(true) 
					{		System.out.println("------CRUD OPERATIONS------");
							System.out.println("1.Add Students details\n2.Edit Students fees\n3.View Students details\n4.Delete Students details\n5.Exit");
							System.out.print("Enter the Choice : ");
							int ch=sc.nextInt();
				if(ch==1)
					{		System.out.println("\n\tTo Add Students details\n");
							System.out.print("Enter Student reg no: ");
							int rn=sc.nextInt();
							System.out.print("Enter Student name: ");
							String n=sc.next();
							System.out.print("Enter Student Date of Birth: ");
							String d=sc.next();
							System.out.print("Enter Student gender : ");
							String g=sc.next();
							System.out.print("Enter Student course : ");
							String c=sc.next();
							System.out.print("Enter Student fees: ");
							int f=sc.nextInt();
							System.out.print("Enter Student contact_no: ");
							String cn=sc.next();
							sc.nextLine();
							System.out.print("Enter Student address: ");
							String a=sc.nextLine();
							System.out.print("Enter Student Password: ");
							String pw=sc.next();
							int r=cr.insert(rn,n,d,g,c,f,cn,a,pw);
							System.out.println((r>=1)?" Added Students details":"Students details Not Added");}
				else if(ch==2) 
					{		System.out.println("\n\tTo Edit Students details\n");
							System.out.print("Enter the Students regno : ");
							int i=sc.nextInt();
							System.out.print("Enter the fees : ");
							int s=sc.nextInt();
							int r=cr.update(i,s);
							System.out.println((r>=1)?"Updated":"Not Updated");
					}
				else if(ch==3)
					{		System.out.println("regno \t \t Name \t dob \t \t gender  course  fees \t contact_no \t address\t \t \t password");
							cr.select();
							System.out.println("--------End of the Records--------");
					}
				else if(ch==4) 
				    {		System.out.println("\n\tTo Delete Students details\n");
							System.out.print("Enter the Student reg no: ");
							int i=sc.nextInt();
							int r=cr.delete(i);
							System.out.println((r>=1)?"Students details Deleted":"Students details Not Deleted");
					}
				else if(ch==5)
					{	break;
					}
				else 
					{		System.out.println("Invalid Operations");
					}
					}
					}
				else if (res==false) 
					{		System.out.println("Incorrect username or password");	
					}
					}
				else if (sele==3)
					{	break;					
					}
				else 		System.out.println("Invalid operator");
					}
				else if (option==2) {
							System.out.println("1.View your details\n2.Exit");
							System.out.print("Enter the Choice : ");
							int st=sc.nextInt();
				if(st==1) 
					{		System.out.println("Enter Your Reg no");
							int no=sc.nextInt(); 
							System.out.println("Enter Your Password");
							String d=sc.next();
							boolean rest=cr.stuselect(no,d);
				if(rest==false) 
					{		System.out.println("regno \t \t Name \t dob \t \t gender  course  fees \t contact_no \t address\t \t \t password");
							cr.studentview(no,d);
							System.out.println("--------End of the Records--------");	
					}
					}
				else if (st==2) 
					{	break;
					}
				    }	
				else if(option==3)
					{	exit = true;
					}
				else 
							System.out.println("Invalid operator");
						break;					
					}
				while (!exit);
							System.out.println("...Exiting !!");
							System.out.println("\t Thank You!!!");
					}
					}