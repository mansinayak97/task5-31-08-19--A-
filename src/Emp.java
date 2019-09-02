
public class Emp implements Comparable<Emp> {

	private int empNo;
	private String eName;
	private int salary;
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eName == null) ? 0 : eName.hashCode());
		result = prime * result + empNo;
		result = prime * result + salary;
		return result;
		//return empNo;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (eName == null) {
			if (other.eName != null)
				return false;
		} else if (!eName.equals(other.eName))
			return false;
		if (empNo != other.empNo)
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "emp [empNo=" + empNo + ", eName=" + eName + ", salary="
				+ salary + "]";
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Emp(int empNo, String eName, int salary) {
		super();
		this.empNo = empNo;
		this.eName = eName;
		this.salary = salary;
	}
	@Override
	public int compareTo(Emp emp) {
		//int n=empNo-emp.empNo;
		
		int n=salary-emp.salary;
		if(n==0)
		{
			int res=eName.compareTo(emp.eName);
			return res;
		}else
			return n;
	}
	
	
}
