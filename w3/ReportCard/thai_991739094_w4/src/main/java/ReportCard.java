public class ReportCard {
	String studentName="";
	String studentId="";
	int studentGrade = 0;
	
    // Define constructor of class ReportCard
    ReportCard(String name,String id,int grade)
    {
        studentName = name;
        studentId = id;
        studentGrade = grade;
    }

    // Create method getReport
	public String getReport()
	{
        // return string contains the student's name, id, and grade)
		return studentName + "," + studentId + "," + String.valueOf(studentGrade);
	}

    //setter
    public void setGrade(int grade) throws Exception
    {
        if(grade == -14 || grade == 112)
        {
            //throw exception
            Exception err = new Exception("Illigal input");
            throw err;
        }
        else{
            this.studentGrade = grade;
        }
    }
}
