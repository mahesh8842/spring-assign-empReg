package empDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import BO.empBO;

public class empDAOimpl implements iempDAO{
	private static final String query="INSERT INTO EMP VALUES(EMP_ID.NEXTVAL,?,?,?,?,?) ";
	private DataSource ds;
	
	
	public empDAOimpl(DataSource ds) {
		System.out.println("Emp DAO :: Single param constructor invoked");
		this.ds = ds;
	}

	@Override
	public int insert(empBO bo)throws Exception{
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		try {
			con=ds.getConnection();
			ps=con.prepareStatement(query);
			ps.setString(1, bo.geteName());
			ps.setString(2,bo.geteAddrs());
			ps.setFloat(3, bo.getBasicSalary());
			ps.setFloat(4, bo.getGrossSalary());
			ps.setFloat(5,bo.getNetSalary());
			count=ps.executeUpdate();
		}catch(SQLException se) {
			se.printStackTrace();
			throw se;  // Exception rethrowing
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;  //  Exception rethrowing
		}
		finally {
			//close jdbc objs
			try {
				if(ps!=null)
					ps.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
				throw se;
			}
			try {
				if(con!=null)
					con.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
				throw se;
			}
		}//finally
	
		return count;
	
		
	
	}

}
