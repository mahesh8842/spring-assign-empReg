package empDTO;

import java.io.Serializable;

public class empDTO implements Serializable {
	private String eName;
	private String eAddrs;
	private float basicSalary;
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
	@Override
	public String toString() {
		return "empDTO [eName=" + eName + ", eAddrs=" + eAddrs + ", basicSalary=" + basicSalary + "]";
	}
	

}
