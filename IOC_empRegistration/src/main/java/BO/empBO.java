package BO;

public class empBO {
	@Override
	public String toString() {
		return "empBO [eName=" + eName + ", eAddrs=" + eAddrs + ", basicSalary=" + basicSalary + "]";
	}
	private String eName;
	private String eAddrs;
	private float basicSalary;
	private float grossSalary;
	private float netSalary;
	public float getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(float grossSalary) {
		this.grossSalary = grossSalary;
	}
	public float getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(float netSalary) {
		this.netSalary = netSalary;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteAddrs() {
		return eAddrs;
	}
	public void seteAddrs(String eAddrs) {
		this.eAddrs = eAddrs;
	}
	public float getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}

}
