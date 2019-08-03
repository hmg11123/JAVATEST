package framework.dao.emp_dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import config.db.DBconnection;
import framework.modelvo.Emp_VO;

public class EmpDao {

	public List<Emp_VO> emp_dao(){
		DBconnection db = new DBconnection();
		List<Emp_VO> list = new ArrayList<Emp_VO>();
		
		String query = "SELECT * FROM EMP";
		
		ResultSet rs = db.SelectQuery(query);
		
		try{
			while(rs.next()){
				Emp_VO vo = new Emp_VO();
				
				vo.setEmpno(rs.getNString("EMPNO"));
				vo.setEname(rs.getNString("ENAME"));
				vo.setJob(rs.getNString("JOB"));
				vo.setMgr(rs.getNString("MGR"));
				vo.setHiredate(rs.getNString("HIREDATE"));
				vo.setSal(rs.getNString("SAL"));
				vo.setComm(rs.getNString("COMM"));
				vo.setDeptno(rs.getNString("DEPTNO"));
				
				list.add(vo);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}
}
