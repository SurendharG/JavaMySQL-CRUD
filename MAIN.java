package project;
import java.util.Scanner;
public class Main extends Methods{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			boolean exit=true;
			if(exit==true)
			{
		while(exit) {
			WelcomePanel();
			int option=Asking_Int();
	if(option==1)
		{
		PUBLICPAGE();
		}
	else if (option==2) 
		{
		LOGINPAGE();
		}
	else if(option==3)
		{	
			exitcondrol();
			break;
		}
	else 	
			invalite_operator();
		}}
	}}