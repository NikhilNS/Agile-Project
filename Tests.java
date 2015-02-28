import java.sql.*;


public class Tests 
{
	public static void main(String[] arg) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, NullPointerException
	{
		
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
	    Connection con = DriverManager.getConnection("JDBC:ODBC:gedcom","","");
	    Statement st=con.createStatement();
	    String query="select * from gedcom";
	    ResultSet rs=st.executeQuery(query);
	    PhNo(rs);
	    ResultSet rs1=st.executeQuery(query);
	    Name(rs1);
	   	    	
	    
	}
	
	public static void PhNo(ResultSet rs2) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, NullPointerException
	{
		
		while(rs2.next())
		{
			try{
		if((rs2.getString(9).length())>10){
    		System.out.println("failure");
		}else{
    		System.out.println("success");
		}
		}
		
		catch(Exception e)
		{
			rs2.next();
			
		}
		}
		
	}
	public static void Name(ResultSet rs3) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, NullPointerException
	{
		
		while(rs3.next())
		{
			//System.out.println(rs.getString(12));
			try{
				if(rs3.getString(12).contains("@")){
					System.out.println("S");
				}else{
		    		System.out.println("f");
				}
						
		}catch(Exception e){
			rs3.next();
			
			
		}
		}
		
	}
	
}
