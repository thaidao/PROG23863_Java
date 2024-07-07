
public class Start {
	public static void main( String[] args )
	{
		int a = (int) 4.56;
		double pi =3.14;
		System.out.println(a);
		System.out.println ((int) pi);

		//Instantiate 3 ReportCad objects
		ReportCard stCard1 = new ReportCard("Thomas","9917",99);
		ReportCard stCard2 = new ReportCard("Victor","9918",90);
		ReportCard stCard3 = new ReportCard("Navneet","9919",98);

		//Try to set grade
		try{
			stCard1.setGrade(-14);
		}
		catch(Exception e)
		{
			//print stack trace
			e.printStackTrace();
		}

		//Call getReport method in each of them
		String stReport1 = stCard1.getReport();
		String stReport2 = stCard2.getReport();
		String stReport3 = stCard3.getReport();
		
		//Print out the result
		System.out.println(stReport1);
		System.out.println(stReport2);
		System.out.println(stReport3);
	}
}
