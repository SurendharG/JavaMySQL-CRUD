package project;

import java.util.Scanner;

public class MAIN {

	public static void main(String[] args) {
		DB_CODE cr=new DB_CODE();	
				Scanner sc=new Scanner(System.in);
				System.out.println("\tWelcome to college institute");
				System.out.println("Press 1 For Staff or Press 2 For Studetns");
				int option=sc.nextInt();
				if(option==1) {
					System.out.println("\tWelcome Staff!! ");
					System.out.println("1.New user \n2.Existing user\n3.Exit");
					System.out.print("Enter the Choice : ");
					int sele=sc.nextInt();
					if(sele==1) {
						System.out.println("\n\tTo Add Account\n");
						System.out.print("Enter new username: ");
						String un=sc.next();
						System.out.print("Enter new password: ");
						String pw=sc.next();
						int r=cr.insert(un,pw);
						System.out.println((r>=1)?" Add user":"Not Add user");
						System.out.println((r>=1)?"refresh the running screen and login ":"");
					}
					else if(sele==2) {
					System.out.print("Enter the UserName : ");
					String u=sc.next();
					System.out.print("Enter the Password : ");
					String p=sc.next();
					boolean res=cr.login(u,p);
				if(res==true) {	
					while(true) {
				System.out.println("------CRUD OPERATIONS------");
				System.out.println("1.Add Students details\n2.Edit Students details\n3.View Students details\n4.Delete Students details\n5.Exit");
				System.out.print("Enter the Choice : ");
				int ch=sc.nextInt();
				
				if(ch==1) {
					//Insertion
					System.out.println("\n\tTo Add Students details\n");
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
					System.out.print("Enter Student address: ");
					String a=sc.nextLine();
					System.out.print("Enter Student Password: ");
					String pw=sc.next();
					int r=cr.insert(rn,n,d,g,c,f,cn,a,pw);
					System.out.println((r>=1)?" Added Students details":"Students details Not Added");
							}
				else if(ch==2) {
					//Updation
					System.out.println("\n\tTo Edit Students details\n");
					System.out.print("Enter the Students regno : ");
					int i=sc.nextInt();
					System.out.print("Enter the fees : ");
					int s=sc.nextInt();
					int r=cr.update(i,s);
					System.out.println((r>=1)?"Updated":"Not Updated");
								}
				else if(ch==3) {
					//selection
					//	int regno,String name,String dob,String gender,String course,int fees,int contact_no,String address) {
					System.out.println("regno \t Name \t dob \t gender \t course \t fees \t contact_no \t address\t password");
					cr.select();
					System.out.println("--------End of the Records--------");
								}
				else if(ch==4) {
					//deletion
					System.out.println("\n\tTo Delete Students details\n");
					System.out.print("Enter the Student reg no: ");
					int i=sc.nextInt();
					int r=cr.delete(i);
					System.out.println((r>=1)?"Students details Deleted":"Students details Not Deleted");
								}
				else if(ch==5) {
					System.out.println("...Exiting !!");
					System.out.println("\t Thank You!!!");

					break;
								}
				else {
					System.out.println("Invalid Operations");
					 }
						}	
					}
				}
					else {
						System.out.println("Invalid Operations");
						 }
				}
				else if(option==2){
//for student 
					System.out.println("\tWelcome Student!! ");
					System.out.print("Enter the regno : ");
					int u=sc.nextInt();
					System.out.print("Enter the Password : ");
					String p=sc.next();
					boolean rest=cr.logins(u,p);
				if(rest==true) {	

					
					System.out.print("Enter the Student reg no: ");
					int i=sc.nextInt();
				/*	int r=cr.selectstudent(i);
					//System.out.println((r>=1)?"Students details Deleted":"Students details Not Deleted");
								
					if(r>=1) {
//					int regno,String name,String dob,String gender,String course,int fees,int contact_no,String address) {
					System.out.println("regno \t Name \t dob \t gender \t course \t fees \t contact_no \t address\t password");
					cr.select();
					System.out.println("--------End of the Records--------");
					}
					else{
						System.out.println("your reg no is invalid");}
					}
				
				
				}
				else {
					System.out.println("\tYour regno or password is wrong !!!");	
					System.out.println("\tFor password Contact your Staff!!!");				}
*/}}
				}
				}
	