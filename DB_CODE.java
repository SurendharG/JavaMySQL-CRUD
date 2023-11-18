package project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class DB_CODE {
private Connection con;
public DB_CODE() {
				String dburl="jdbc:mysql://localhost:3306/institude";
				String dbuser="root";
				String dbpass="";	
	try {	
				con=DriverManager.getConnection(dburl,dbuser,dbpass);	
		}		catch(SQLException e ) 
		{		System.out.println(e);	
		}}
public boolean loginStaff(String username,String password) {
	boolean c=false;
	try { 
				String query = "SELECT * FROM login_staff WHERE username = ? AND password = ?";
			    PreparedStatement pstmt = con.prepareStatement(query);
			    pstmt.setString(1, username);
			    pstmt.setString(2, password);   
			    ResultSet resultSet = pstmt.executeQuery();
	if(resultSet.next()) 
			    c = true;
	    }		catch(SQLException e)
		{		System.out.println(e);		}
				return c;
		}	
public boolean loginstaffadmin(String username,String password) {
				boolean c=false;
				Scanner sc=new Scanner(System.in);
	try { 
				String query = "SELECT * FROM Admin_details WHERE username = ? AND password = ?";
			    PreparedStatement pstmt = con.prepareStatement(query);
			    pstmt.setString(1, username);
			    pstmt.setString(2, password);
			    ResultSet resultSet = pstmt.executeQuery();
			    if (resultSet.next()) 
			    	{c = true;}}
	catch(SQLException | InputMismatchException e) 
		{ 	System.out.print("Please try Again");}
				return c;					
}	
public boolean CheckSuperAdmin(String username) {
	boolean c=false;
	Scanner sc=new Scanner(System.in);
try { 
	String query = "SELECT * FROM Admin_details WHERE username = ? AND axis =?";
    PreparedStatement pstmt = con.prepareStatement(query);
    pstmt.setString(1, username);
    pstmt.setString(2, "superadmin");
    ResultSet resultSet = pstmt.executeQuery();
    if (resultSet.next()) 
    	{c = true;}}
catch(SQLException | InputMismatchException e) 
{ 	System.out.println("Something Went Wrong...!!!\nPlease Try Again...!!!\nSkip The Next Line"); }
	return c;					
}	
public int insert(String name,String pas) {
				int c=0;
	try {	
				String query="insert into login_staff values(?,?);";
				PreparedStatement pst=con.prepareStatement(query);
				pst.setString(1,name);
				pst.setString(2,pas);
				c=pst.executeUpdate();
		}
	catch(SQLException e) 
		{		System.out.println(e);		}
				return c;
		}
public int inserttoaccountteam(String name,String pas) {
	int c=0;
try {	
	String query="insert into account_team values(?,?);";
	PreparedStatement pst=con.prepareStatement(query);
	pst.setString(1,name);
	pst.setString(2,pas);
	c=pst.executeUpdate();
}
catch(SQLException e) 
{		System.out.println(e);		}
	return c;
}
public int inserttoadmissionteam(String name,String pas) {
	int c=0;
try {	
	String query="insert into Admission_team values(?,?);";
	PreparedStatement pst=con.prepareStatement(query);
	pst.setString(1,name);
	pst.setString(2,pas);
	c=pst.executeUpdate();
}
catch(SQLException e) 
{		System.out.println(e);		}
	return c;
}
public int insertAdmin(String name,String pas) {
	int c=0;
try {	
	String query="insert into Admin_details values(?,?,?);";
	PreparedStatement pst=con.prepareStatement(query);
	pst.setString(1,name);
	pst.setString(2,pas);
	pst.setString(3,"Admin");
	c=pst.executeUpdate();
}
catch(SQLException e) 
{		System.out.println(e);		}
	return c;
}
public int insert(long regno,String name,String dob,String gender,String course,double Total_fees,long contact_no,String address,String password) {
				int c=0;
	try {	
				String query="insert into student_details (regno,name,dob,gender,course,Total_fees,Paid_fees,pending_fees,contact_no,address,password)values(?,?,?,?,?,?,?,?,?,?,?);";
				PreparedStatement pst=con.prepareStatement(query);
				pst.setLong(1,regno);
				pst.setString(2,name);
				pst.setString(3,dob);
				pst.setString(4,gender);
				pst.setString(5,course);
				pst.setDouble(6,Total_fees);
				pst.setDouble(7,0);
				pst.setDouble(8,Total_fees);
				pst.setLong(9,contact_no);
				pst.setString(10,address);
				pst.setString(11,password);
				c=pst.executeUpdate();
		}
	catch(SQLException e) 
		{		System.out.println();		
		System.out.println("\t\tYour Entering invalid Data...!!");
	}
				return c;
		}
public int updatefees(long regno,double Total_fees) {
	int c=0;
	try {	
				String q="update student_details set Total_fees=?,pending_fees=? where regno=?";
				PreparedStatement pst=con.prepareStatement(q);
				pst.setDouble(1, Total_fees);
				pst.setDouble(2, Total_fees);
				pst.setLong(3, regno);	
				c=pst.executeUpdate();			
		}
	catch(SQLException e) 
		{		System.out.println(e);		}
				return c;
		}	
public int updatename(long regno,String name) {
	int c=0;
	try {	
				String q="update student_details set name=? where regno=?";
				PreparedStatement pst=con.prepareStatement(q);
				pst.setString(1, name);
				pst.setLong(2, regno);	
				c=pst.executeUpdate();			
		}
	catch(SQLException e) 
		{		System.out.println(e);		}
				return c;
		}
public int updatedob(long regno,String dob) {
	int c=0;
	try {	
				String q="update student_details set dob=? where regno=?";
				PreparedStatement pst=con.prepareStatement(q);
				pst.setString(1, dob);
				pst.setLong(2, regno);	
				c=pst.executeUpdate();			
		}		
	catch(SQLException e)
		{		System.out.println(e);		}
				return c;
		}
public int updategender(long regno,String gender) {
	int c=0;
	try {	
				String q="update student_details set gender=? where regno=?";
				PreparedStatement pst=con.prepareStatement(q);
				pst.setString(1, gender);
				pst.setLong(2, regno);	
				c=pst.executeUpdate();			
		}
	catch(SQLException e) 
		{		System.out.println(e);		}
				return c;
		}
public int updatecourse(long regno,String course) {
	int c=0;
	try {	
				String q="update student_details set course=? where regno=?";
				PreparedStatement pst=con.prepareStatement(q);
				pst.setString(1, course);
				pst.setLong(2, regno);	
				c=pst.executeUpdate();			
		}
	catch(SQLException e)
		{		System.out.println(e);		}
				return c;
		}
public int updatecn(long regno,long contact_no) {
	int c=0;
	try {	
				String q="update student_details set contact_no=? where regno=?";
				PreparedStatement pst=con.prepareStatement(q);
				pst.setLong(1, contact_no);
				pst.setLong(2, regno);	
				c=pst.executeUpdate();			
		}
	catch(SQLException e)
		{		System.out.println(e);		}
				return c;
		}
public int updateaddress(long regno,String address) {
	int c=0;
	try {	
				String q="update student_details set address=? where regno=?";
				PreparedStatement pst=con.prepareStatement(q);
				pst.setString(1, address);
				pst.setLong(2, regno);	
				c=pst.executeUpdate();			
		}
	catch(SQLException e)
		{		System.out.println(e);		}
				return c;
		}
public int updatepassword(long regno,String password) {
	int c=0;
	try {	
				String q="update student_details set password=? where regno=?";
				PreparedStatement pst=con.prepareStatement(q);
				pst.setString(1, password);
				pst.setLong(2, regno);	
				c=pst.executeUpdate();			
		}
	catch(SQLException e) 
		{		System.out.println(e);		}
				return c;
		}
public void select(){
	try {	
				String query="select *from student_details ORDER BY REGNO";
				PreparedStatement pst=con.prepareStatement(query);
				ResultSet rs=pst.executeQuery();		
	while(rs.next()) 
		{		System.out.println();
		System.out.printf("%-15s %-30s %-12s %-10s %-10s %-10s %-10s %-12s %-12s %-75s %-15s%n",rs.getLong(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDouble(6),rs.getDouble(7),
				rs.getDouble(8),rs.getLong(9),rs.getString(10),rs.getString(11));
		System.out.println();
		}}
	catch(SQLException e) 
		{		System.out.println(e);		}
		}
public int delete(long regno) {
	int c=0;
	try {	
				String q="delete from student_details where regno=?";
				PreparedStatement pst=con.prepareStatement(q);
				pst.setLong(1,regno);
				c=pst.executeUpdate();			
		}
	catch(SQLException e) 
		{		System.out.println(e);		}
				return c;		
		}
public boolean stuselect(long regno,String pass) {
				boolean cd=false;
	try {		String query = "SELECT * FROM student_details WHERE regno = ? AND password = ?";
		        PreparedStatement pstmt = con.prepareStatement(query);
		        pstmt.setLong(1, regno);
		        pstmt.setString(2, pass);
		        ResultSet resultSet = pstmt.executeQuery();
	if (resultSet.next()) 
		{		cd = true;				}
		}		catch(SQLException e) 
		{		System.out.println(e);		}
				return cd;
		}
public void studentviewfees(long regno) {		
	try {	
				String query="select *from student_details where regno=?;";
				PreparedStatement pst=con.prepareStatement(query);
				pst.setLong(1,regno);
				ResultSet rs=pst.executeQuery();		
	while(rs.next()) 
		{				System.out.println();
System.out.printf("%-15s %-30s %-15s %-10s %-10s %-12s%n",rs.getLong(1),rs.getString(2),rs.getString(5),rs.getDouble(6),rs.getDouble(7),rs.getDouble(8));
System.out.println();
}}
	catch(SQLException e) 
	{			System.out.println(e);		}
	}
public void studentviewperde(long regno) {	
	try {	
				String query="select *from student_details where regno=?;";
				PreparedStatement pst=con.prepareStatement(query);
				pst.setLong(1,regno);
				ResultSet rs=pst.executeQuery();		
	while(rs.next()) 
		{				System.out.println();
		System.out.printf("%-15s %-30s %-12s %-10s %-10s %-12s %-75s%n",rs.getLong(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getLong(9),rs.getString(10));
		System.out.println();
		}}
	catch(SQLException e) 
	{			System.out.println(e);		}
	}
public void viewpartstudent(long regno) {
	try {
				String query="select * from student_details where regno=?;";
				PreparedStatement pst=con.prepareStatement(query);
				pst.setLong(1, regno);
				ResultSet rs=pst.executeQuery();
	while(rs.next())
		{				System.out.println();
		System.out.printf("%-15s %-30s %-12s %-10s %-10s %-10s %-10s %-12s %-12s %-75s %-15s%n",rs.getLong(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDouble(6),rs.getDouble(7),
				rs.getDouble(8),rs.getLong(9),rs.getString(10),rs.getString(11));
		System.out.println();
		}}
	catch(SQLException e)
	{			System.out.println(e);		}
	}
public void viewpartdeptstudent(String course) {
	try {
				String query="select * from student_details where course=? order by regno ;";
				PreparedStatement pst=con.prepareStatement(query);
				pst.setString(1, course);
				ResultSet rs=pst.executeQuery();
	while(rs.next())
		{				System.out.println();
		System.out.printf("%-15s %-30s %-12s %-10s %-10s %-10s %-10s %-12s %-12s %-75s %-15s%n",rs.getLong(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDouble(6),rs.getDouble(7),
				rs.getDouble(8),rs.getLong(9),rs.getString(10),rs.getString(11));
		System.out.println();
		}}
	catch(SQLException e)
	{			System.out.println(e);		}
	}
public long RegNUMBER(long i) {
	try {
		long regno = i;
        String query = "select * from student_details where regno=?;";
        PreparedStatement pst =con.prepareStatement(query);
        pst.setLong(1, regno);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            return 1l;
        }
    } catch (SQLException e) {
        System.out.println(e);
    }
	return 2l;
}
public boolean gmailidifinreview(String i) {
	try {
		String Email = i;
        String query = "select * from review Where Email =?;";
        PreparedStatement pst =con.prepareStatement(query);
        pst.setString(1, Email);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            return false;
        }
    } catch (SQLException e) {
        System.out.println(e);
    }
	return true;
}
public String CheckuserNameifAdmin(String i) {

	try {
		String regno = i;
        String query = "select * from Admin_details where username=?;";
        PreparedStatement pst =con.prepareStatement(query);
        pst.setString(1, regno);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            return "1";
        }
    } catch (SQLException e) {
        System.out.println(e);
    }
	return "2";
}
public String CheckuserNameif(String i) {

	try {
		String regno = i;
        String query = "select * from login_staff where username=?;";
        PreparedStatement pst =con.prepareStatement(query);
        pst.setString(1, regno);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            return "1";
        }
    } catch (SQLException e) {
        System.out.println(e);
    }
	return "2";
}
public String CheckuserNameifforaccount(String i) {
	try {
		String regno = i;
        String query = "select * from account_team where username=?;";
        PreparedStatement pst =con.prepareStatement(query);
        pst.setString(1, regno);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            return "1";
        }
    } catch (SQLException e) {
        System.out.println(e);
    }
	return "2";
}
public String CheckuserNameifforadmission(String i) {
	try {
		String regno = i;
        String query = "select * from Admission_team where username=?;";
        PreparedStatement pst =con.prepareStatement(query);
        pst.setString(1, regno);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            return "1";
        }
    } catch (SQLException e) {
        System.out.println(e);
    }
	return "2";
}
public String usernameifstaff(String i) {

	try {
		String regno = i;
        String query = "select * from login_staff where username=?;";
        PreparedStatement pst =con.prepareStatement(query);
        pst.setString(1, regno);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            return "1";
        }
    } catch (SQLException e) {
        System.out.println(e);
    }
	return "2";
}
public String usernameifadmission(String i) {

	try {
		String regno = i;
        String query = "select * from Admission_team where username=?;";
        PreparedStatement pst =con.prepareStatement(query);
        pst.setString(1, regno);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            return "1";
        }
    } catch (SQLException e) {
        System.out.println(e);
    }
	return "2";
}
public String usernameifaccount(String i) {
	try {
		String regno = i;
        String query = "select * from account_team where username=?;";
        PreparedStatement pst =con.prepareStatement(query);
        pst.setString(1, regno);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            return "1";
        }
    } catch (SQLException e) {
        System.out.println(e);
    }
	return "2";
}
public int updatepasswordforstaff(String username,String password) {
	int c=0;
	try {	
				String q="update login_staff set password=? where username=?";
				PreparedStatement pst=con.prepareStatement(q);
				pst.setString(1, password);
				pst.setString(2, username);	
				c=pst.executeUpdate();			
		}
	catch(SQLException e) 
		{		System.out.println(e);		}
				return c;
		}
public int updatepasswordforadmission(String username,String password) {
	int c=0;
	try {	
				String q="update Admission_team set password=? where username=?";
				PreparedStatement pst=con.prepareStatement(q);
				pst.setString(1, password);
				pst.setString(2, username);	
				c=pst.executeUpdate();			
		}
	catch(SQLException e) 
		{		System.out.println(e);		}
				return c;
		}
public int updatepasswordforaccount(String username,String password) {
	int c=0;
	try {	
				String q="update account_team set password=? where username=?";
				PreparedStatement pst=con.prepareStatement(q);
				pst.setString(1, password);
				pst.setString(2, username);	
				c=pst.executeUpdate();			
		}
	catch(SQLException e) 
		{		System.out.println(e);		}
				return c;
		}
public int updatepasswordforAdmin(String username,String password) {
	int c=0;
	try {	
				String q="update Admin_details set password=? where username=?";
				PreparedStatement pst=con.prepareStatement(q);
				pst.setString(1, password);
				pst.setString(2, username);	
				c=pst.executeUpdate();			
		}
	catch(SQLException e) 
		{		System.out.println(e);		}
				return c;
		}
public int updateaccessforsuperadmin(String username) {
	int c=0;
	try {	
				String q="update Admin_details set axis=? where username=?";
				PreparedStatement pst=con.prepareStatement(q);
				pst.setString(1, "superadmin");
				pst.setString(2, username);	
				c=pst.executeUpdate();			
		}
	catch(SQLException e) 
		{		System.out.println(e);		}
				return c;
		}
public void ViewParticularstaffUserDedailsbyadmin(String s) {
	try {
		String username = s;
        String query = "select * from login_staff where username=?;";
        PreparedStatement pst =con.prepareStatement(query);
        pst.setString(1, username);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
    		System.out.println();
        	System.out.printf("%-30s %-30s%n",rs.getString(1),rs.getString(2));
    		System.out.println();

        }
    } catch (SQLException e) {
        System.out.println(e);
    }}
public void ViewParticularAccountUserDedailsbyadmin(String s) {
	try {
		String username = s;
        String query = "select * from account_team where username=?;";
        PreparedStatement pst =con.prepareStatement(query);
        pst.setString(1, username);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
    		System.out.println();
        	System.out.printf("%-30s %-30s%n",rs.getString(1),rs.getString(2));
    		System.out.println();

        }
    } catch (SQLException e) {
        System.out.println(e);
    }}
public void ViewParticularAdmissionUserDedailsbyadmin(String s) {
	try {
		String username = s;
        String query = "select * from Admission_team where username=?;";
        PreparedStatement pst =con.prepareStatement(query);
        pst.setString(1, username);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
    		System.out.println();
        	System.out.printf("%-30s %-30s%n",rs.getString(1),rs.getString(2));
    		System.out.println();
        }
    } catch (SQLException e) {
        System.out.println(e);
    }}
public void ViewAllstaffUserDedailsbyadmin() {
	try {
        String query = "select * from login_staff order by username";
        PreparedStatement pst =con.prepareStatement(query);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
    		System.out.println();
        	System.out.printf("%-30s %-30s%n",rs.getString(1),rs.getString(2));
    		System.out.println();
        }
    } catch (SQLException e) {
        System.out.println(e);
    }}
public void ViewAllAccountUserDedailsbyadmin() {
	try {
        String query = "select * from account_team order by username";
        PreparedStatement pst =con.prepareStatement(query);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
    		System.out.println();
        	System.out.printf("%-30s %-30s%n",rs.getString(1),rs.getString(2));
    		System.out.println();
}
    } catch (SQLException e) {
        System.out.println(e);
    }}
public void ViewAllAdmissionUserDedailsbyadmin() {
	try {
        String query = "select * from Admission_team order by username";
        PreparedStatement pst =con.prepareStatement(query);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
    		System.out.println();
        	System.out.printf("%-30s %-30s%n",rs.getString(1),rs.getString(2));
    		System.out.println();
}
    } catch (SQLException e) {
        System.out.println(e);
    }}
public void ViewAdminUserDedails() {
	try {
        String query = "select * from admin_details order by username";
        PreparedStatement pst =con.prepareStatement(query);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
    		System.out.println();
        	System.out.printf("%-30s %-30s %-30s%n",rs.getString(1),rs.getString(2),rs.getString(3));
    		System.out.println();
        }
    } catch (SQLException e) {
        System.out.println(e);
    }}
public int deleteadmin(String username) {
	int c=0;
	try {	String q="delete from admin_details where username=?";
			PreparedStatement pst=con.prepareStatement(q);
			pst.setString(1,username);
			c=pst.executeUpdate();			
		}
	catch(SQLException e) 
		{		System.out.println(e);		}
				return c;		
		}
public int deletestaffuserdetails(String username) {
	int c=0;
	try {	String q="delete from login_staff where username=?";
			PreparedStatement pst=con.prepareStatement(q);
			pst.setString(1,username);
			c=pst.executeUpdate();			
		}
	catch(SQLException e) 
		{		System.out.println(e);		}
				return c;		
		}
public int deleteAccountTeamuserdetails(String username) {
	int c=0;
	try {	String q="delete from account_team where username=?";
			PreparedStatement pst=con.prepareStatement(q);
			pst.setString(1,username);
			c=pst.executeUpdate();			
		}
	catch(SQLException e) 
		{		System.out.println(e);		}
				return c;		
		}
public int deleteAdmissionTeamuserdetails(String username) {
	int c=0;
	try {	String q="delete from Admission_team where username=?";
			PreparedStatement pst=con.prepareStatement(q);
			pst.setString(1,username);
			c=pst.executeUpdate();			
		}
	catch(SQLException e) 
		{		System.out.println(e);		}
				return c;		
		}
public void SeePublicReviewdb() {
	try {	
		String query="select name,Star,ownthink from review";
		PreparedStatement pst=con.prepareStatement(query);
		ResultSet rs=pst.executeQuery();		
while(rs.next()) 
{				System.out.println();
System.out.printf("%-30s %-10s %-75s %n",rs.getString(1),rs.getDouble(2)+"/5",rs.getString(3));
System.out.println();
}}
catch(SQLException e) 
{		System.out.println(e);		}
}
public void SeePublicReviewdbforadmin() {
	try {	
		String query="select * from review";
		PreparedStatement pst=con.prepareStatement(query);
		ResultSet rs=pst.executeQuery();		
while(rs.next()) 
{				System.out.println();
System.out.printf("%-20s %-30s %-50s %-10s %-75s %n",rs.getInt(5),rs.getString(4),rs.getString(3),rs.getDouble(1)+"/5",rs.getString(2));
System.out.println();
}}
catch(SQLException e) 
{		System.out.println(e);		}
}
public int RejectReviewDB(int no) {
	int c=0;
	try {	String q="delete from review where review_number=?";
			PreparedStatement pst=con.prepareStatement(q);
			pst.setInt(1,no);
			c=pst.executeUpdate();			
		}
	catch(SQLException e) 
		{		System.out.println(e);		}
				return c;		
		}
public int updatereviewfrompublic(double Star,String other,String email,String name) {
	int c=0;
try {	
	String query="insert into review (star,ownthink,email,name) values(?,?,?,?);";
	PreparedStatement pst=con.prepareStatement(query);
	pst.setDouble(1,Star);
	pst.setString(2,other);
	pst.setString(3,email);
	pst.setString(4, name);
	c=pst.executeUpdate();
}
catch(SQLException e) 
{		System.out.println(e);		}
	return c;
}
public void StarvalueAverage() {
	try {
        String query = " SELECT ROUND(AVG(Star), 1) AS AverageStar FROM review";
        PreparedStatement pst =con.prepareStatement(query);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
        	System.out.print(rs.getDouble(1)+"/5");
        }
    } catch (SQLException e) {
        System.out.println(e);
    }}
public void contactusdb() {
	try {	
			String query="select *from contact_details";
				PreparedStatement pst=con.prepareStatement(query);
				ResultSet rs=pst.executeQuery();		
	while(rs.next()) 
		{		
		System.out.println("Contact Number : "+rs.getString(1));System.out.println();
		System.out.println("Email : "+rs.getString(2));		    System.out.println();
		System.out.println("Address : "+rs.getString(3));		System.out.println();
		System.out.println("Map Link : "+rs.getString(4));		System.out.println();
		System.out.println("Whatsapp : "+rs.getString(5));		System.out.println();
		System.out.println("Twitter : "+rs.getString(6));		System.out.println();
		System.out.println();
		System.out.println();
		
		}}
	catch(SQLException e) 
		{		System.out.println(e);		}
		}
public void Aboutusdb() {
	try {	
		String query="select *from about_us";
				PreparedStatement pst=con.prepareStatement(query);
				ResultSet rs=pst.executeQuery();		
	while(rs.next()) 
		{	
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\t\t\tAchievement \n\n"+rs.getString(1));
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\t\t\tPlacement Record \n\n"+rs.getString(2));
		System.out.println();
		System.out.println();
		}}
	catch(SQLException e) 
		{		System.out.println(e);		}
		}
public int ApplyAdmission(String a,String b,String c,String d,long e,long f,String g,String h,String i,String j,String k,double l,String m,String n,double o,String p,double q) {
	int s=0;
try {	
	String query="insert into application_form (Name,Parent_name,dob,gender,contact_number,Alternatecotact_number,emailid,address,course,sslc_boardname,sslc_schoolname,sslc_mark,hsc_boardname,hsc_schoolname,hsc_mark,diploma_universityname,diploma_gradepercendage) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
	PreparedStatement pst=con.prepareStatement(query);
	pst.setString(1,a);
	pst.setString(2,b);
	pst.setString(3,c);
	pst.setString(4,d);
	pst.setLong(5,e);
	pst.setLong(6,f);
	pst.setString(7,g);
	pst.setString(8,h);
	pst.setString(9,i);
	pst.setString(10,j);
	pst.setString(11,k);
	pst.setDouble(12,l);
	pst.setString(13,m);
	pst.setString(14,n);
	pst.setDouble(15,o);
	pst.setString(16,p);
	pst.setDouble(17,q);
	s=pst.executeUpdate();

}
catch(SQLException t) 
{		System.out.println(t);		

System.out.println("\t\tYour Entering invalid Data...!!");
}
	return s;
}
public void GetApplicationNumber(String a,String b,String c,String d,long e,long f,String g,String h,String i,String j,String k,double l,String m,String n,double o,String p,double q) {
try {	
	String query="select application_id from application_form WHERE Name=? && Parent_name=? && dob=? && gender=? && contact_number=? && Alternatecotact_number=? && emailid=? && address=? && course=? && sslc_boardname=? && sslc_schoolname=? && sslc_mark=? && hsc_boardname=? && hsc_schoolname=? && hsc_mark=? && diploma_universityname=? && diploma_gradepercendage=?;";
	PreparedStatement pst=con.prepareStatement(query);
	pst.setString(1,a);
	pst.setString(2,b);
	pst.setString(3,c);
	pst.setString(4,d);
	pst.setLong(5,e);
	pst.setLong(6,f);
	pst.setString(7,g);
	pst.setString(8,h);
	pst.setString(9,i);
	pst.setString(10,j);
	pst.setString(11,k);
	pst.setDouble(12,l);
	pst.setString(13,m);
	pst.setString(14,n);
	pst.setDouble(15,o);
	pst.setString(16,p);
	pst.setDouble(17,q);
	ResultSet rs=pst.executeQuery();
	while(rs.next()) {
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t\t\tYour Application Id : "+rs.getInt(1));
		System.out.println("\t\t\t\t\tKindly Note this Id");
		System.out.println();
		System.out.println();
	}
}
catch(SQLException t) 
{		System.out.println(t);	}
}
public boolean loginAdmissionTeamUser(String username,String password) {
	boolean c=false;
	try { 
				String query = "SELECT * FROM Admission_team WHERE username = ? AND password = ?";
			    PreparedStatement pstmt = con.prepareStatement(query);
			    pstmt.setString(1, username);
			    pstmt.setString(2, password);   
			    ResultSet rs = pstmt.executeQuery();
	while(rs.next()) {
			    c = true;}}
	catch(SQLException e)
		{		System.out.println(e);		}
		return c;
}	
public boolean CheckingApplicationIDif(int i){
	try {
        String query = "select * from Application_form where application_id=?;";
        PreparedStatement pst =con.prepareStatement(query);
        pst.setInt(1, i);
        ResultSet rs = pst.executeQuery();
        while(rs.next()) {
            return true; }
    } catch (SQLException e) {
        System.out.println(); }
	return false;
}
public boolean Checkingreviewnumberif(int i){
	try {
        String query = "select * from review where review_number=?;";
        PreparedStatement pst =con.prepareStatement(query);
        pst.setInt(1, i);
        ResultSet rs = pst.executeQuery();
        while(rs.next()) {
            return true; }
    } catch (SQLException e) {
        System.out.println(); }
	return false;
}
public void ViewApplicatioParticularId(int no) {
try {	
	String query="select * from application_form WHERE application_id=?;";
	PreparedStatement pst=con.prepareStatement(query);
	pst.setInt(1,no);
	ResultSet rst=pst.executeQuery();
	while(rst.next()) {
		System.out.println();
		System.out.printf("%-15s %-30s %-30s %-12s %-20s %-20s %-20s %-50s %-75s %-15s %-35s %-75s %-10s %-35s %-75s %-10s %-75s %-10s%n",rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getLong(6),rst.getLong(7),rst.getString(8),rst.getString(9),rst.getString(10),rst.getString(11),rst.getString(12),rst.getDouble(13),rst.getString(14),rst.getString(15),rst.getDouble(16),rst.getString(17),rst.getDouble(18));
		System.out.println();
	}
}
catch(SQLException t) 
{		System.out.println();	}
}
public void ViewApplications() {
try {	
	String query="select * from application_form order by application_id;";
	PreparedStatement pst=con.prepareStatement(query);
	ResultSet rst=pst.executeQuery();
	while(rst.next()) {
		System.out.println();
		System.out.printf("%-15s %-30s %-30s %-12s %-20s %-20s %-20s %-50s %-75s %-15s %-35s %-75s %-10s %-35s %-75s %-10s %-75s %-10s%n",rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getLong(6),rst.getLong(7),rst.getString(8),rst.getString(9),rst.getString(10),rst.getString(11),rst.getString(12),rst.getDouble(13),rst.getString(14),rst.getString(15),rst.getDouble(16),rst.getString(17),rst.getDouble(18));
		System.out.println();
	}
}
catch(SQLException t) 
{		System.out.println(t);	}
}
public int RejectApplicationDB(int no) {
	int c=0;
	try {	String q="delete from application_form where Application_id=?";
			PreparedStatement pst=con.prepareStatement(q);
			pst.setInt(1,no);
			c=pst.executeUpdate();			
		}
	catch(SQLException e) 
		{		System.out.println(e);		}
				return c;		
		}
public  void AdmissionEntryDB(int no,long rn,double f,String pw) {
	String name,dob,gender,course,address,password;
	double Total_fees;
	long contact_no,Reg_no;
try {	
	String query="select * from application_form WHERE application_id=?;";
	PreparedStatement pst=con.prepareStatement(query);
	pst.setInt(1,no);
	ResultSet rst=pst.executeQuery();
	while(rst.next()) {
		name=rst.getString(2);dob=rst.getString(4);gender=rst.getString(5);contact_no=rst.getLong(6);address=rst.getString(9);
		course=rst.getString(10);Reg_no=rn;Total_fees=f;password=pw;
		Formats s=new Formats();
		s.AddStudentconfirmPanelDB(rn,name,dob,gender,course,Total_fees,contact_no,address,pw);
		boolean conadmis=s.ConfirmAddStudentDB();
		if(conadmis) {
		int h=0;
		try {	
			String query1="insert into student_details (regno,name,dob,gender,course,Total_fees,pending_fees,contact_no,address,password)values(?,?,?,?,?,?,?,?,?,?);";
			PreparedStatement pstt=con.prepareStatement(query1);
			pstt.setLong(1,Reg_no);
			pstt.setString(2,name);
			pstt.setString(3,dob);
			pstt.setString(4,gender);
			pstt.setString(5,course);
			pstt.setDouble(6,Total_fees);
			pstt.setDouble(7,Total_fees);
			pstt.setLong(8,contact_no);
			pstt.setString(9,address);
			pstt.setString(10,password);
			h=pstt.executeUpdate();
				}
			catch(SQLException e) 
				{		System.out.println();		
						System.out.println("\t\tYour Entering invalid Data...!!");
					}
		System.out.println((h>=1)?" Student Details has Successfully Added in our Student Database":"Sorry...!!! Students details Not Added\nPlease try Again...!");
		}
		else{System.out.println("Student Details Is Not Added");		}
		}}
catch(SQLException t) {		System.out.println();	}
}
public boolean loginAccountTeamUser(String username,String password) {
	boolean c=false;
	try { 
				String query = "SELECT * FROM account_team WHERE username = ? AND password = ?";
			    PreparedStatement pstmt = con.prepareStatement(query);
			    pstmt.setString(1, username);
			    pstmt.setString(2, password);   
			    ResultSet rs = pstmt.executeQuery();
	while(rs.next()) {
			    c = true;}}
	catch(SQLException e)
		{		System.out.println(e);		}
		return c;
}	
public void viewpartstudentFeesForAccoundTeam() {
	try {
				String query="select * from student_details order by regno;";
				PreparedStatement pst=con.prepareStatement(query);
				ResultSet rs=pst.executeQuery();
	while(rs.next())
	{	System.out.println();	
		System.out.printf("%-15s %-30s %-15s %-10s %-10s %-12s%n",rs.getLong(1),rs.getString(2),rs.getString(5),rs.getDouble(6),rs.getDouble(7),rs.getDouble(8));
		System.out.println();	}}
	catch(SQLException e)
	{			System.out.println(e);		}
	}
public void viewpartstudentForAccoundTeam(long regno) {
	try {
				String query="select * from student_details where regno=?;";
				PreparedStatement pst=con.prepareStatement(query);
				pst.setLong(1, regno);
				ResultSet rs=pst.executeQuery();
	while(rs.next())
	{	System.out.println();	
		System.out.printf("%-15s %-30s %-15s %-10s %-10s %-12s%n",rs.getLong(1),rs.getString(2),rs.getString(5),rs.getDouble(6),rs.getDouble(7),rs.getDouble(8));
		System.out.println();	}}
	catch(SQLException e)
	{			System.out.println(e);		}
	}
public void viewpartstudentForAccoundTeam(String u) {
	try {
				String query="select * from student_details where course=?;";
				PreparedStatement pst=con.prepareStatement(query);
				pst.setString(1, u);
				ResultSet rs=pst.executeQuery();
	while(rs.next())
	{	System.out.println();	
		System.out.printf("%-15s %-30s %-15s %-10s %-10s %-12s%n",
				rs.getString(1),rs.getString(2),rs.getString(5),rs.getDouble(6),rs.getDouble(7),rs.getDouble(8));
		System.out.println();	}}
	catch(SQLException e)
	{			System.out.println(e);		}
	}
public  void FeesConfirmationPanelwithname(long regno,String u) {
	String n="",dept="";
	double pendfees=0;
	try {
		String query="select * from student_details where regno=?;";
		PreparedStatement pst=con.prepareStatement(query);
		pst.setLong(1, regno);
		ResultSet rs=pst.executeQuery();
	while(rs.next())
		{	n=rs.getString(2);dept=rs.getString(5); pendfees=rs.getDouble(8);}}
	catch(SQLException e)
	{			System.out.println(e);		}
	Formats s= new Formats();
	s.PayFeesConfirmationREGPanel(n);
	boolean a=s.AskConfirmationfe();
	if(a) {		System.out.println();
	double amount=s.GetDouble(pendfees);
	int c=0;
	
	try {		String q="update student_details set paid_fees=paid_fees+?,pending_fees=pending_fees-? where regno=?";
				PreparedStatement pst=con.prepareStatement(q);
				pst.setDouble(1, amount);
				pst.setDouble(2, amount);
				pst.setLong(3, regno);	
				c=pst.executeUpdate();			
		}
	catch(SQLException e) 
		{		System.out.println(e);		}
	System.out.println(c);
	if (c>=1) {
		int z=0;
	try {	
				String query3="insert into AccountMaintenance (username,date,time,regno,student_name,dept,amount_of_paid)values(?,?,?,?,?,?,?);";
				PreparedStatement pst2=con.prepareStatement(query3);
				pst2.setString(1,u);
				pst2.setString(2,s.LiveDate());
				pst2.setString(3,s.LiveTime());
				pst2.setLong(4,regno);
				pst2.setString(5,n);
				pst2.setString(6,dept);
				pst2.setDouble(7,amount);
				z=pst2.executeUpdate();
		}
	catch(SQLException e) 
		{System.out.println();System.out.println("\t\tYour Entering invalid Data...!!");}
}
	System.out.println((c>=1)?"Successfully Fees Added to the Student":"Sorry Fess Not Added Please Try Again");	
}
	else if(!a) {System.out.println("Operation Canceled Fees Not Added To The Student");}
}
public  void UptadeFessForParticularStudentPanel(long regno,String u){
	String n="",dept="";
	double btf=0;
	try {
		String query="select * from student_details where regno=?;";
		PreparedStatement pst=con.prepareStatement(query);
		pst.setLong(1, regno);
		ResultSet rs=pst.executeQuery();
	while(rs.next())
		{	n=rs.getString(2);dept=rs.getString(5); btf=rs.getDouble(6);}}
	catch(SQLException e)
	{			System.out.println(e);		}
	Formats s= new Formats();
	s.UptadeFessForParticularStudentPanelREG(n);
	boolean a=s.AskConfirmationfe();
	if(a) {		System.out.println();
	s.instructionPanelForUptadeFessForParticularStudent();
	double amount=s.GetDoubleForUptadeFessForParticularStudent();
	int c=0;
	
	try {		String q="update student_details set Total_fees=Total_fees+?,pending_fees=pending_fees+? where regno=?";
				PreparedStatement pst=con.prepareStatement(q);
				pst.setDouble(1, amount);
				pst.setDouble(2, amount);
				pst.setLong(3, regno);	
				c=pst.executeUpdate();			
		}
	catch(SQLException e) 
		{		System.out.println(e);		}
	System.out.println(c);
	if (c>=1) {
		int z=0;
	try {		
				String query3="insert into FessUptadeMaintenance (username,date,time,regno,student_name,dept,before_total_fees,updated_total_fees)values(?,?,?,?,?,?,?,?);";
				PreparedStatement pst2=con.prepareStatement(query3);
				pst2.setString(1,u);
				pst2.setString(2,s.LiveDate());
				pst2.setString(3,s.LiveTime());
				pst2.setLong(4,regno);
				pst2.setString(5,n);
				pst2.setString(6,dept);
				pst2.setDouble(7,btf);
				pst2.setDouble(8,btf+amount);
				z=pst2.executeUpdate();
		}
	catch(SQLException e) 
		{System.out.println(e);System.out.println("\t\tYour Entering invalid Data...!!");}
}
	System.out.println((c>=1)?"Successfully Fees Added to the Student":"Sorry Fess Not Added Please Try Again");	
}
	else if(!a) {System.out.println("Operation Canceled Fees Not Added To The Student");}



}
public  void UptadeFessForParticularStudentPanel(String dn,double f,String un){
	String n="";
	long regno=0;
	double btf=0;
	try {
		String query="select * from student_details where course=?&&Total_fees=?;";
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1, dn);
		pst.setDouble(2,f);
		ResultSet rs=pst.executeQuery();
	while(rs.next())
		{	n=rs.getString(2);regno=rs.getLong(1); btf=rs.getDouble(6); }}
	catch(SQLException e)
	{			System.out.println(e);		}
	Formats s= new Formats();
	s.UptadeFessForParticularDeptPanelREG(dn);
	boolean a=s.AskConfirmationfe();
	if(a) {		System.out.println();
	s.instructionPanelForUptadeFessForParticularStudent();
	double amount=s.GetDoubleForUptadeFessForParticularStudent();
	int c=0;
	
	try {		String q="update student_details set Total_fees=Total_fees+?,pending_fees=pending_fees+? where course=?&&Total_fees=?";
				PreparedStatement pst=con.prepareStatement(q);
				pst.setDouble(1, amount);
				pst.setDouble(2, amount);
				pst.setString(3, dn);	
				pst.setDouble(4, f);
				c=pst.executeUpdate();	
		}
	catch(SQLException e) 
		{		System.out.println(e);	
		}
	if (c>=1) {
		int z=0;
	try {		
				String query3="insert into FessUptadeMaintenance (username,date,time,dept,before_total_fees,updated_total_fees)values(?,?,?,?,?,?);";
				PreparedStatement pst2=con.prepareStatement(query3);
				pst2.setString(1,un);
				pst2.setString(2,s.LiveDate());
				pst2.setString(3,s.LiveTime());
				pst2.setString(4,dn);
				pst2.setDouble(5,btf);
				pst2.setDouble(6,btf+amount);
				z=pst2.executeUpdate();
		}
	catch(SQLException e) 
		{System.out.println(e);System.out.println("\t\tYour Entering invalid Data...!!");}
}
	System.out.println((c>=1)?"Successfully Fees Added to the Student":"Sorry Fess Not Added Please Try Again");	
}
	else if(!a) {System.out.println("Operation Canceled Fees Not Added To The Student");}
}
public void ViewSpecificDateAccountHistory(String SD,String ED) {
try {	
	String query="select * from accountmaintenance WHERE date>=? && date<=? order by date desc,time desc;";
	PreparedStatement pst=con.prepareStatement(query);
	pst.setString(1,SD);
	pst.setString(2,ED);
	ResultSet rst=pst.executeQuery();
	while(rst.next()) {
		System.out.println();
		System.out.printf("%-40s %-15s %-15s %-30s %-40s %-15s %-15s%n",rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getDouble(7));
		System.out.println();
	}
	String query1="select sum(amount_of_paid) as total_paid_amount from accountmaintenance WHERE date >=? && date <=? order by date DESC, time DESC LIMIT 1;";
	PreparedStatement pst1=con.prepareStatement(query1);
	pst1.setString(1,SD);
	pst1.setString(2,ED);
	ResultSet rs=pst1.executeQuery();
	while(rs.next()) {
		System.out.println();
		System.out.println();
		System.out.printf("%-40s %-15s %-15s %-30s %-40s %-15s %-15s%n","","","","","Total Amount Of Paid---->","",rs.getDouble(1));
		System.out.println();
	}


}
catch(SQLException t) 
{		System.out.println();	}
}
public void ViewSpecificcUserAccountHistory(String SD) {
try {	
	String query="select * from accountmaintenance WHERE username=? order by date desc,time desc;";
	PreparedStatement pst=con.prepareStatement(query);
	pst.setString(1,SD);
	ResultSet rst=pst.executeQuery();
	while(rst.next()) {
		System.out.println();
		System.out.printf("%-40s %-15s %-15s %-30s %-40s %-15s %-15s%n",rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getDouble(7));
		System.out.println();
	}
	String query1="select sum(amount_of_paid) as total_paid_amount from accountmaintenance WHERE username=? order by date DESC, time DESC LIMIT 1;";
	PreparedStatement pst1=con.prepareStatement(query1);
	pst1.setString(1,SD);
	ResultSet rs=pst1.executeQuery();
	while(rs.next()) {
		System.out.println();
		System.out.println();
		System.out.printf("%-40s %-15s %-15s %-30s %-40s %-15s %-15s%n","","","","","Total Amount Of Paid---->","",rs.getDouble(1));
		System.out.println();
	}

}
catch(SQLException t) 
{		System.out.println();	}
}
public void ViewTotalAccountHistory() {
try {	
	String query="select * from accountmaintenance order by date desc,time desc;";
	PreparedStatement pst=con.prepareStatement(query);
	ResultSet rst=pst.executeQuery();
	while(rst.next()) {
		System.out.println();
		System.out.printf("%-40s %-15s %-15s %-30s %-40s %-15s %-15s%n",rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getDouble(7));
		System.out.println();
	}
	String query1="select sum(amount_of_paid) as total_paid_amount from accountmaintenance order by date DESC, time DESC LIMIT 1;";
	PreparedStatement pst1=con.prepareStatement(query1);
	ResultSet rs=pst1.executeQuery();
	while(rs.next()) {
		System.out.println();
		System.out.println();
		System.out.printf("%-40s %-15s %-15s %-30s %-40s %-15s %-15s%n","","","","","Total Amount Of Paid---->","",rs.getDouble(1));
		System.out.println();
	}
}
catch(SQLException t) 
{		System.out.println();	}
}
public void ViewSpecificcUserAccountHistory(long SD) {
try {	
	String query="select * from accountmaintenance WHERE regno=? order by date desc,time desc;";
	PreparedStatement pst=con.prepareStatement(query);
	pst.setLong(1,SD);
	ResultSet rst=pst.executeQuery();
	while(rst.next()) {
		System.out.println();
		System.out.printf("%-40s %-15s %-15s %-30s %-40s %-15s %-15s%n",rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getDouble(7));
		System.out.println();
	}
	String query1="select sum(amount_of_paid) as total_paid_amount from accountmaintenance WHERE regno=? order by date DESC, time DESC LIMIT 1;";
	PreparedStatement pst1=con.prepareStatement(query1);
	pst1.setLong(1,SD);
	ResultSet rs=pst1.executeQuery();
	while(rs.next()) {
		System.out.println();
		System.out.println();
		System.out.printf("%-40s %-15s %-15s %-30s %-40s %-15s %-15s%n","","","","","Total Amount Of Paid---->","",rs.getDouble(1));
		System.out.println();
	}

}
catch(SQLException t) 
{		System.out.println();	}
}
public void ViewSpecificDateFeesUpdateHistory(String SD,String ED) {
try {	
	String query="select * from fessuptademaintenance WHERE date>=? && date<=? order by date desc,time desc;";
	PreparedStatement pst=con.prepareStatement(query);
	pst.setString(1,SD);
	pst.setString(2,ED);
	ResultSet rst=pst.executeQuery();
	while(rst.next()) {
		System.out.println();
		System.out.printf("%-40s %-15s %-15s %-30s %-40s %-15s %-20s %-20s%n",rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getDouble(7),rst.getDouble(8));
		System.out.println();
	}
}
catch(SQLException t) 
{		System.out.println();	}
}
public void ViewSpecificcUserFeesUpdateHistory(String SD) {
try {	
	String query="select * from fessuptademaintenance WHERE username=? order by date desc,time desc;";
	PreparedStatement pst=con.prepareStatement(query);
	pst.setString(1,SD);
	ResultSet rst=pst.executeQuery();
	while(rst.next()) {
		System.out.println();
		System.out.printf("%-40s %-15s %-15s %-30s %-40s %-15s %-20s %-20s%n",rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getDouble(7),rst.getDouble(8));
		System.out.println();
	}
}
catch(SQLException t) 
{		System.out.println();	}
}
public void ViewSpecificcUserFeesUpdateHistory(long SD) {
try {	
	String query="select * from fessuptademaintenance WHERE regno=? order by date desc,time desc;";
	PreparedStatement pst=con.prepareStatement(query);
	pst.setLong(1,SD);
	ResultSet rst=pst.executeQuery();
	while(rst.next()) {
		System.out.println();
		System.out.printf("%-40s %-15s %-15s %-30s %-40s %-15s %-20s %-20s%n",rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getDouble(7),rst.getDouble(8));
		System.out.println();
	}
}
catch(SQLException t) 
{		System.out.println();	}
}
public void ViewTotalFeesUpdateHistory(){
try {	
	String query="select * from fessuptademaintenance order by date desc,time desc;";
	PreparedStatement pst=con.prepareStatement(query);
	ResultSet rst=pst.executeQuery();
	while(rst.next()) {
		System.out.println();
		System.out.printf("%-40s %-15s %-15s %-30s %-40s %-15s %-20s %-20s%n",rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getDouble(7),rst.getDouble(8));
		System.out.println();
	}
}
catch(SQLException t) 
{		System.out.println();	}
}
}