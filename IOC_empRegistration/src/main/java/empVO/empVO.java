package empVO;

public class empVO {
	private String eName;
	private String eAddrs;
	private String basicSalary;
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
	public String getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(String basicSalary) {
		this.basicSalary = basicSalary;
	}
	@Override
	public String toString() {
		return "emoVO [eName=" + eName + ", eAddrs=" + eAddrs + ", basicSalary=" + basicSalary + "]";
	}

}
