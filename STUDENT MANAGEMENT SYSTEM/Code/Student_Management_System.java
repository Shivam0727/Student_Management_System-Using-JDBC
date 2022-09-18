package SMS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Student_Management_System 
{

	public static void main(String[] args) throws  IOException 
	{
		System.out.println("");
		System.out.println("  |*********************************************************** WELCOME TO STUDENT MANAGEMENT APP ***********************************************************|");
		System.out.println("  							   ------------------------------------------ ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("");
			System.out.println("");
			System.out.println("	|--> MAIN MENU <--|	");
			System.out.println("");
			System.out.println(" PRESS 1 TO ADD STUDENTS DETAILS");
			System.out.println(" PRESS 2 TO DELETE STUDENTS DETAILS");
			System.out.println(" PRESS 3 TO DISPLAY STUDENTS DETAILS");
			System.out.println(" PRESS 4 TO EXIT APP ");

			System.out.println("");
			System.out.print(" Press a key to perform a particular task : ");
			int c = Integer.parseInt(br.readLine());
		
			if(c==1)
			{
				// Add Students ...
				System.out.println("");
				System.out.println("<--------------- Add Student Details --------------->");
				System.out.println("");
				System.out.print(" Enter User Name : ");
				String name = br.readLine();
				System.out.println("");
				System.out.print(" Enter User Phone : ");
				String phone = br.readLine();
				System.out.println("");
				System.out.print(" Enter User City : ");
				String city = br.readLine();
				System.out.println("");
				System.out.print(" Enter User Email : ");
				String email = br.readLine();
				System.out.println("");
				System.out.print(" Enter User Date Of Birth : ");
				String dob = br.readLine();
				System.out.println("");
				System.out.print(" Enter User Roll Number : ");
				String rollNo = br.readLine();
				System.out.println("");
				System.out.print(" Enter User Branch : ");
				String branch = br.readLine();
				System.out.println("");
				System.out.print(" Enter User College Name : ");
				String collegeName = br.readLine();
				
				System.out.println("");
				System.out.print(" Enter User University Number : ");
				String universityNo = br.readLine();
				System.out.println("");
				
				
				// Create Student object to store student
				Student_Details st = new Student_Details(name , phone , city , email , dob , rollNo , branch , collegeName , universityNo);
				boolean answer = Student_Dao.insertStudentToDB(st);
				
				if(answer)
				{
					System.out.println("");
					System.out.println(" Congratulation !!! Student is added successfully ...");
					System.out.println("");
				}
				
				else
				{
					System.out.println(" Something went wrong ... ");
				}
				System.out.println(st);
				System.out.println("");
				System.out.print(" Press 9 for Main Menu : ");
				int d = Integer.parseInt(br.readLine());
				if(d==9)
				{
				
					continue ;
				}
				else
				{
					System.out.println(" Invalid Key ");
				}
				
				
			}
			else if(c==2)
			{
				// Delete Students ...
				System.out.println("");
				System.out.print(" Enter Student-Id to Delete Record :  ");
				int userId=Integer.parseInt(br.readLine());
				boolean f = Student_Dao.deleteStudent(userId);
				if(f)
				{
					System.out.println("");
					System.out.println(" Congratulations !!! Your Record is Deleted ...");
					System.out.println("");
				}
				else
				{
					System.out.println(" Something Wents Wrong ...");
				}
				
				System.out.print(" Press 9 for Main Menu : ");
				int d = Integer.parseInt(br.readLine());
				if(d==9)
				{
				
					continue ;
				}
				else
				{
					System.out.println("Invalid Key ");
				}
			}
			else if(c==3)
			{
				// Display Students ...
				Student_Dao.showAllStudents();
				System.out.println("");
				System.out.print(" Press 9 for Main Menu : ");
				int d = Integer.parseInt(br.readLine());
				if(d==9)
				{
				
					continue ;
				}
				else
				{
					System.out.println(" Invalid Key ");
				}
			}
			else if(c==4)
			{
				// Exit ...
				break;
			}
			else
			{
				System.out.println("");
				System.out.println(" Invalid Key ... Please Try Again !!!");
			}
		}
		System.out.println("");
		System.out.println(" Thankyou for Using Our Application ❤❤❤");
		System.out.println(" 	See You Soon !");
	}

}
