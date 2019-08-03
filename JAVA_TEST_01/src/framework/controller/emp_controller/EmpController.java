package framework.controller.emp_controller;

import java.util.List;
import java.util.Scanner;

import framework.modelvo.Emp_VO;
import framework.service.emp_service.EmpService;

public class EmpController {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println("사원번호를 입력하세요. >");
		EmpService aa = new EmpService();
		List<Emp_VO> list = aa.emp_service();
		
		
		
		if(input == 7369){
			System.out.print("Comm -> ");
			System.out.println(list.get(0).getComm());
			System.out.print("Deptno -> ");
			System.out.println(list.get(0).getDeptno());
			System.out.print("Empno -> ");
			System.out.println(list.get(0).getEmpno());
			System.out.print("Ename -> ");
			System.out.println(list.get(0).getEname());
			System.out.print("Hiredate -> ");
			System.out.println(list.get(0).getHiredate());
			System.out.print("Sal -> ");
			System.out.println(list.get(0).getSal());
		}else if(input == 7499){
			System.out.print("Comm -> ");
			System.out.println(list.get(1).getComm());
			System.out.print("Deptno -> ");
			System.out.println(list.get(1).getDeptno());
			System.out.print("Empno -> ");
			System.out.println(list.get(1).getEmpno());
			System.out.print("Ename -> ");
			System.out.println(list.get(1).getEname());
			System.out.println(list.get(1).getHiredate());
			System.out.print("Sal -> ");
			System.out.println(list.get(1).getSal());
		}else if(input == 7521){
			System.out.print("Comm -> ");
			System.out.println(list.get(2).getComm());
			System.out.print("Deptno -> ");
			System.out.println(list.get(2).getDeptno());
			System.out.print("Empno -> ");
			System.out.println(list.get(2).getEmpno());
			System.out.print("Ename -> ");
			System.out.println(list.get(2).getEname());
			System.out.println(list.get(2).getHiredate());
			System.out.print("Sal -> ");
			System.out.println(list.get(2).getSal());
		}else if(input == 7566){
			System.out.print("Comm -> ");
			System.out.println(list.get(3).getComm());
			System.out.print("Deptno -> ");
			System.out.println(list.get(3).getDeptno());
			System.out.print("Empno -> ");
			System.out.println(list.get(3).getEmpno());
			System.out.print("Ename -> ");
			System.out.println(list.get(3).getEname());
			System.out.print("Hiredate -> ");
			System.out.println(list.get(3).getHiredate());
			System.out.print("Sal -> ");
			System.out.println(list.get(3).getSal());
		}else if(input == 7654){
			System.out.print("Comm -> ");
			System.out.println(list.get(4).getComm());
			System.out.print("Deptno -> ");
			System.out.println(list.get(4).getDeptno());
			System.out.print("Empno -> ");
			System.out.println(list.get(4).getEmpno());
			System.out.print("Ename -> ");
			System.out.println(list.get(4).getEname());
			System.out.print("Hiredate -> ");
			System.out.println(list.get(4).getHiredate());
			System.out.print("Sal -> ");
			System.out.println(list.get(4).getSal());
		}else if(input == 7698){
			System.out.print("Comm -> ");
			System.out.println(list.get(5).getComm());
			System.out.print("Deptno -> ");
			System.out.println(list.get(5).getDeptno());
			System.out.print("Empno -> ");
			System.out.println(list.get(5).getEmpno());
			System.out.print("Ename -> ");
			System.out.println(list.get(5).getEname());
			System.out.print("Hiredate -> ");
			System.out.println(list.get(5).getHiredate());
			System.out.print("Sal -> ");
			System.out.println(list.get(5).getSal());
		}else if(input == 7782){
			System.out.print("Comm -> ");
			System.out.println(list.get(6).getComm());
			System.out.print("Deptno -> ");
			System.out.println(list.get(6).getDeptno());
			System.out.print("Empno -> ");
			System.out.println(list.get(6).getEmpno());
			System.out.print("Ename -> ");
			System.out.println(list.get(6).getEname());
			System.out.print("Hiredate -> ");
			System.out.println(list.get(6).getHiredate());
			System.out.print("Sal -> ");
			System.out.println(list.get(6).getSal());
		}else if(input == 7788){
			System.out.print("Comm -> ");
			System.out.println(list.get(7).getComm());
			System.out.print("Deptno -> ");
			System.out.println(list.get(7).getDeptno());
			System.out.print("Empno -> ");
			System.out.println(list.get(7).getEmpno());
			System.out.print("Ename -> ");
			System.out.println(list.get(7).getEname());
			System.out.print("Hiredate -> ");
			System.out.println(list.get(7).getHiredate());
			System.out.print("Sal -> ");
			System.out.println(list.get(7).getSal());
		}else if(input == 7839){
			System.out.print("Comm -> ");
			System.out.println(list.get(8).getComm());
			System.out.print("Deptno -> ");
			System.out.println(list.get(8).getDeptno());
			System.out.print("Empno -> ");
			System.out.println(list.get(8).getEmpno());
			System.out.print("Ename -> ");
			System.out.println(list.get(8).getEname());
			System.out.print("Hiredate -> ");
			System.out.println(list.get(8).getHiredate());
			System.out.print("Sal -> ");
			System.out.println(list.get(8).getSal());
		}else if(input == 7844){
			System.out.print("Comm -> ");
			System.out.println(list.get(9).getComm());
			System.out.print("Deptno -> ");
			System.out.println(list.get(9).getDeptno());
			System.out.print("Empno -> ");
			System.out.println(list.get(9).getEmpno());
			System.out.print("Ename -> ");
			System.out.println(list.get(9).getEname());
			System.out.print("Hiredate -> ");
			System.out.println(list.get(9).getHiredate());
			System.out.print("Sal -> ");
			System.out.println(list.get(9).getSal());
		}else if(input == 7876){
			System.out.print("Comm -> ");
			System.out.println(list.get(10).getComm());
			System.out.print("Deptno -> ");
			System.out.println(list.get(10).getDeptno());
			System.out.print("Empno -> ");
			System.out.println(list.get(10).getEmpno());
			System.out.print("Ename -> ");
			System.out.println(list.get(10).getEname());
			System.out.print("Hiredate -> ");
			System.out.println(list.get(10).getHiredate());
			System.out.print("Sal -> ");
			System.out.println(list.get(10).getSal());
		}else if(input == 7900){
			System.out.print("Comm -> ");
			System.out.println(list.get(11).getComm());
			System.out.print("Deptno -> ");
			System.out.println(list.get(11).getDeptno());
			System.out.print("Empno -> ");
			System.out.println(list.get(11).getEmpno());
			System.out.print("Ename -> ");
			System.out.println(list.get(11).getEname());
			System.out.print("Hiredate -> ");
			System.out.println(list.get(11).getHiredate());
			System.out.print("Sal -> ");
			System.out.println(list.get(11).getSal());
		}else if(input == 7902){
			System.out.print("Comm -> ");
			System.out.println(list.get(12).getComm());
			System.out.print("Deptno -> ");
			System.out.println(list.get(12).getDeptno());
			System.out.print("Empno -> ");
			System.out.println(list.get(12).getEmpno());
			System.out.print("Ename -> ");
			System.out.println(list.get(12).getEname());
			System.out.print("Hiredate -> ");
			System.out.println(list.get(12).getHiredate());
			System.out.print("Sal -> ");
			System.out.println(list.get(12).getSal());
		}else if(input == 7934){
			System.out.print("Comm -> ");
			System.out.println(list.get(13).getComm());
			System.out.print("Deptno -> ");
			System.out.println(list.get(13).getDeptno());
			System.out.print("Empno -> ");
			System.out.println(list.get(13).getEmpno());
			System.out.print("Ename -> ");
			System.out.println(list.get(13).getEname());
			System.out.print("Hiredate -> ");
			System.out.println(list.get(13).getHiredate());
			System.out.print("Sal -> ");
			System.out.println(list.get(13).getSal());
		}else{
			System.out.println("ㄴㄴㄴㄴ");
		}
		
		
		
//		for(int i = 0; i<list.size(); i++){
//			System.out.println("===============================");
//			System.out.println(list.get(i).getComm());
//			System.out.println(list.get(i).getDeptno());
//			System.out.println(list.get(i).getEmpno());
//			System.out.println(list.get(i).getEname());
//			System.out.println(list.get(i).getHiredate());
//			System.out.println(list.get(i).getSal());
//		}
	}
}
