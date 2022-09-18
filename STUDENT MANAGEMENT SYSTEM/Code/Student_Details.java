package SMS;

public class Student_Details
{
	private int studentId;
	private String studentName;
	private String studentPhone;
	private String studentCity;
	private String studentemail;
	private String dob;
	private String rollNo;
	private String branch;
	private String collegeName;
	private String universityNo;
	public Student_Details(int studentId, String studentName, String studentPhone, String studentCity,
			String studentemail, String dob, String rollNo, String branch, String collegeName, String universityNo) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
		this.studentemail = studentemail;
		this.dob = dob;
		this.rollNo = rollNo;
		this.branch = branch;
		this.collegeName = collegeName;
		this.universityNo = universityNo;
	}
	public Student_Details(String studentName, String studentPhone, String studentCity, String studentemail, String dob,
			String rollNo, String branch, String collegeName, String universityNo) {
		super();
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
		this.studentemail = studentemail;
		this.dob = dob;
		this.rollNo = rollNo;
		this.branch = branch;
		this.collegeName = collegeName;
		this.universityNo = universityNo;
	}
	protected int getStudentId()
	{
		return studentId;
	}
	protected void setStudentId(int studentId) 
	{
		this.studentId = studentId;
	}
	protected String getStudentName()
	{
		return studentName;
	}
	protected void setStudentName(String studentName)
	{
		this.studentName = studentName;
	}
	protected String getStudentPhone() 
	{
		return studentPhone;
	}
	protected void setStudentPhone(String studentPhone) 
	{
		this.studentPhone = studentPhone;
	}
	protected String getStudentCity() 
	{
		return studentCity;
	}
	protected void setStudentCity(String studentCity)
	{
		this.studentCity = studentCity;
	}
	protected String getStudentemail() 
	{
		return studentemail;
	}
	protected void setStudentemail(String studentemail) 
	{
		this.studentemail = studentemail;
	}
	protected String getDob() 
	{
		return dob;
	}
	protected void setDob(String dob) 
	{
		this.dob = dob;
	}
	protected String getRollNo() 
	{
		return rollNo;
	}
	protected void setRollNo(String rollNo)
	{
		this.rollNo = rollNo;
	}
	protected String getBranch() 
	{
		return branch;
	}
	protected void setBranch(String branch) 
	{
		this.branch = branch;
	}
	protected String getCollegeName() 
	{
		return collegeName;
	}
	protected void setCollegeName(String collegeName) 
	{
		this.collegeName = collegeName;
	}
	protected String getUniversityNo() 
	{
		return universityNo;
	}
	protected void setUniversityNo(String universityNo) 
	{
		this.universityNo = universityNo;
	}
	@Override
	public String toString() 
	{
		return " Student_Details [ Id = " + studentId + ", Student Name = " + studentName + ", Student Phone Number = "
				+ studentPhone + ", Student City = " + studentCity + ", Student Email = " + studentemail + ", Date Of Birth = " + dob
				+ ", Roll Number = " + rollNo + ", Branch = " + branch + ", College Name = " + collegeName + ", University Number = "
				+ universityNo + " ]";	
	}
	public Student_Details() 
	{
		super();
	}
	
	
}
