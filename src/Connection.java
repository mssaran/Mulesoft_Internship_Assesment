import java.sql.*;

public class Connection {
	public static void main(String args[])throws Exception
	{
		Class.forName("org.sqlite.JDBC");
		String dbURL="jdbc:sqlite:Movies_Details.db";
		java.sql.Connection con=DriverManager.getConnection(dbURL);
		if(con!=null)
		{
//	 Insertion of Data into movies Table   
	Statement st = con.createStatement(); 

	int n=st.executeUpdate("INSERT INTO Movies_Data " + 
            "VALUES ('Bahubali', 'Prabhas', 'Anushkha', 2015, 'Rajamouli')"); 
      int n1=st.executeUpdate("INSERT INTO Movies_Data " + 
            "VALUES ('uncharted', 'TomHolland', 'SarahPetrick', 2021, 'RubenFleischer')"); 
      
      int n3=st.executeUpdate("INSERT INTO Movies_Data " + 
            "VALUES ('Akhanda', 'Lion', 'PragyaJaiswal', 2021, 'Boyapatiseenu')");
      int n4=st.executeUpdate("INSERT INTO Movies_Data " + 
            "VALUES ('RRR', 'NTR', 'Oliver', 2022, 'Rajamouli_ss')");
      int n5=st.executeUpdate("INSERT INTO Movies_Data " + 
             "VALUES ('SpiderMan', 'TomHolland', 'Zendeya', 2017, 'jon_Watts')");
      int n6=st.executeUpdate("INSERT INTO Movies_Data " + 
             "VALUES ('ExecutiveDecision', 'KurtRussel', 'Haalle Berry', 1996, 'StuartBaird')");
      int n7=st.executeUpdate("INSERT INTO Movies_Data " + 
             "VALUES ('Dilbechare', 'SSR', 'SanjanaSangi', 2020, 'MukeshChbra')");
            
       System.out.println(n);
       System.out.println(n1);
       System.out.println(n3);
       System.out.println(n4);
       System.out.println(n5);
       System.out.println(n6);
       System.out.println(n7);
		
//retrieveing Details of MoviesTable		
		Statement stmt = con.createStatement();
        ResultSet rs;

        rs = stmt.executeQuery("SELECT * FROM Movies_Data");
       System.out.println("Movie_Name\tName_OF_LeadActor\tName_of_actress\t\tMovieRealease_Year\tMovie_DirectorName");
	    System.out.println("__________________________________________________________________________________________________________________________");
	   while(rs.next()) {
		   
	   
	   System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t\t\t"+rs.getString(3)+"\t\t\t\t"+rs.getInt(4)+"\t\t"+rs.getString(5));
	   
	   }
	   
	   rs = stmt.executeQuery("SELECT * FROM Movies_Data where Name_OF_LeadActor='TomHolland' ");
       System.out.println("Movie_Name\tName_OF_LeadActor\tName_of_actress\t\tMovieRealease_Year\tMovie_DirectorName");
	    System.out.println("__________________________________________________________________________________________________________________________");
	   while(rs.next()) {
		   
	   
	   System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t\t\t"+rs.getString(3)+"\t\t\t\t"+rs.getInt(4)+"\t\t"+rs.getString(5));
	   
	   }
	   

}
		
	}
}
