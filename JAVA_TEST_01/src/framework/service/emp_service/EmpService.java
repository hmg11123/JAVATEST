package framework.service.emp_service;

import java.util.List;

import framework.dao.emp_dao.EmpDao;
import framework.modelvo.Emp_VO;

public class EmpService {

	EmpDao aDao = new EmpDao();
	
	public List<Emp_VO> emp_service(){
		
		List<Emp_VO> oList = aDao.emp_dao();
		
		return oList;
	}
}
