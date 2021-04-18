package empService;

import BO.empBO;
import empDAO.iempDAO;
import empDTO.empDTO;

public class empManagementimpl implements iempManagement{
	private iempDAO dao;
	public empManagementimpl(iempDAO dao) {
		System.out.println("emp Managementimpl :: Single param constructor invoked");
		this.dao=dao;
	}
	@Override
	public String calculateGrossNet(empDTO dto) throws Exception {
		Float gross=(float) (dto.getBasicSalary()+(0.4*dto.getBasicSalary()));
		Float net=(float) (dto.getBasicSalary()+(0.2*dto.getBasicSalary()));
		empBO bo=new empBO();
		bo.seteName(dto.geteName());
		bo.seteAddrs(dto.geteAddrs());
		bo.setBasicSalary(dto.getBasicSalary());
		bo.setGrossSalary(gross);
		bo.setNetSalary(net);
		
		int count=dao.insert(bo);
		return count==1?"employee details inserted/Registered successfully ->Gross and Net salaries "+gross+" & "+ net:"failed to register details";
	}
	
}
