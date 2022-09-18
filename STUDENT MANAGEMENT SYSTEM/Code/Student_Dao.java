package SMS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class Student_Dao 
{

	public static boolean insertStudentToDB(Student_Details st)
	{
		boolean f = false;
		try
		{
			Connection con = Connection_generator.createC();
			String c = " create table if not exists Students_Records(ID int not null auto_increment primary key , NAME varchar(50) , CONTACT varchar(15) , CITY varchar(50) , EMAIL varchar(50) , DATE_OF_BIRTH varchar(20) , ROLL_NUMBER varchar(10) not null  , BRANCH varchar(50) , COLLEGE_NAME varchar(100) , UNIVERSITY_NUMBER varchar(30) , unique key (ROLL_NUMBER) ) ";
			Statement stmt = con.createStatement();
			stmt.execute(c);			
			String q = "insert into Students_Records(NAME , CONTACT , CITY , Email , DATE_OF_BIRTH , ROLL_NUMBER , BRANCH , COLLEGE_NAME , UNIVERSITY_NUMBER) values(? ,? ,? ,? ,? ,? ,? ,? ,?)";
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());
			pstmt.setString(4, st.getStudentemail());
			pstmt.setString(5, st.getDob());
			pstmt.setString(6, st.getRollNo());
			pstmt.setString(7, st.getBranch());
			pstmt.setString(8, st.getCollegeName());
			pstmt.setString(9, st.getUniversityNo());
			
			pstmt.executeUpdate();
			f=true;
		} 
		catch (Exception e)
		{
			System.out.println("Something Wents To Wrong ... Please Try Again !!!");
		}
		return f;
	}

	public static boolean deleteStudent(int userId) 
	{
		boolean f = false;
		try
		{
			Connection con = Connection_generator.createC();
			String q = "delete from Students_Records where ID = ?";
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setInt(1,userId);
			
			pstmt.executeUpdate();
			f=true;
		} 
		catch (Exception e)
		{
			System.out.println("Something Wents To Wrong ... Please Try Again !!!");
		}
		return f;
	}

	public static void showAllStudents() 
	{
		boolean f = false;
		try
		{
			Connection con = Connection_generator.createC();
			String q = "Select *from Students_Records";
			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(q);
			System.out.println("");
			System.out.println("*****************************************************************************");
			System.out.println("");
			System.out.println("	|--> ALL STUDENT RECORDS : ");
			System.out.println("");
			System.out.println("*****************************************************************************");
			while(set.next())
			{
				System.out.println("");
				int id = set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				String city = set.getString(4);
				String email = set.getString(5);
				String dob = set.getString(6);
				String rollNo = set.getString(7);
				String branch = set.getString(8);
				String collegeName = set.getString(9);
				String UniversityNo = set.getString(10);
				System.out.println("");
				System.out.println("	ID : "+id);
				System.out.println("	Name : "+name);
				System.out.println("	Phone : "+phone);
				System.out.println("	City : "+city);
				System.out.println("	Email : "+email);
				System.out.println("	Date Of Birth : "+dob);
				System.out.println("	Roll Number : "+rollNo);
				System.out.println("	Branch : "+branch);
				System.out.println("	College Name : "+collegeName);
				System.out.println("	University Number : "+UniversityNo);
				System.out.println("");
				System.out.println("*****************************************************************************");
				
			}
			System.out.println("");
		} 
		catch (Exception e)
		{
			System.out.println("Something Wents To Wrong ... Please Try Again !!!");
		}
	
	}

	
}
