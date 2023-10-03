package project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DB_CODE {
	
		private Connection con;
		//Connectivity Code
			public DB_CODE() {
				String dburl="jdbc:mysql://localhost:3306/institude";
				String dbuser="root";
				String dbpass="";	
				try {	
					con=DriverManager.getConnection(dburl,dbuser,dbpass);	
				}catch(SQLException e) {	System.out.println(e);		}
			}
				public boolean login(String username,String password) {
					boolean c=false;
							try {
							String query = 
							"select * from login_staff WHERE user='"+username+"'and pass='"+password+"'";
							Statement smt=con.createStatement();
							c=smt.execute(query);
							}catch(SQLException e) {	System.out.println(e);		}
							return c;
				}	
			
		///Insertion Code
			public int insert(int regno,String name,String dob,String gender,String course,int fees,String contact_no,String address,String password) {
				int c=0;
				try {	
				String query="insert into student_details values(?,?,?,?,?,?,?,?,?);";
				PreparedStatement pst=con.prepareStatement(query);
				pst.setInt(1,regno);
				pst.setString(2,name);
				pst.setString(3,dob);
				pst.setString(4,gender);
				pst.setString(5,course);
				pst.setInt(6,fees);
				pst.setString(7,contact_no);
				pst.setString(8,address);
				pst.setString(9,password);
				c=pst.executeUpdate();
				}catch(SQLException e) {	System.out.println(e);		}
				return c;
			}
		//Updation Code
			public int update(int regno,int fees) {
				int c=0;
				try {	
					String q="update student_details set fees=? where regno=?";
					PreparedStatement pst=con.prepareStatement(q);
					pst.setInt(1, fees);
					pst.setInt(2, regno);	
					c=pst.executeUpdate();			
				}catch(SQLException e) {	System.out.println(e);		}
				return c;
			}	
		//Selection Code
			public void select() {
				try {	
				String query="select *from student_details";
				PreparedStatement pst=con.prepareStatement(query);
				ResultSet rs=pst.executeQuery();		
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+
							rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getInt(6)+"\t"+rs.getString(7)+"\t"+rs.getString(8)+"\t"+rs.getString(9));
				}
				}catch(SQLException e) {	System.out.println(e);		}
			}
		//Deletion Code
			public int delete(int regno) {
				int c=0;
				try {	
					String q="delete from student_details where regno=?";
					PreparedStatement pst=con.prepareStatement(q);
					pst.setInt(1,regno);
					c=pst.executeUpdate();			
				}catch(SQLException e) {	System.out.println(e);		}
				return c;		
			}
			//inserttion for staff
			public int insert(String name,String pas) {
				int c=0;
				try {	
				String query="insert into login_staff values(?,?);";
				PreparedStatement pst=con.prepareStatement(query);
				pst.setString(1,name);
				pst.setString(2,pas);
				c=pst.executeUpdate();
				}catch(SQLException e) {	System.out.println(e);		}
				return c;
			}
			public boolean logins(int regno,String password) {
				boolean c=false;
						try {
						String query = 
						"select * from student_details WHERE regno='"+regno+"'and password='"+password+"'";
						Statement smt=con.createStatement();
						c=smt.execute(query);
						}catch(SQLException e) {	System.out.println(e);		}
						return c;}

}