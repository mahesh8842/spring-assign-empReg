package controller;

import empDTO.empDTO;
import empService.iempManagement;
import empVO.empVO;

public class mainController {
	private iempManagement service;

	public mainController(iempManagement service) {
		System.out.println("Main controller :: Single param constructor invoked");
		this.service = service;
	}
	public String processEmployee(empVO vo)throws Exception{
		empDTO dto=new empDTO();
		dto.seteName(vo.geteName());
		dto.seteAddrs(vo.geteAddrs());
		dto.setBasicSalary(Float.parseFloat(vo.getBasicSalary()));
		
		String res=service.calculateGrossNet(dto);
		return res;
		
	}
	

}
