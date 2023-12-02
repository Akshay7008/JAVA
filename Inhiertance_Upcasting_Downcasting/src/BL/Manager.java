package BL;

public class Manager extends Employee {
	
	private int deptid;
	private double perbonus;
	
	public Manager() {
		super();
	}
	
	public Manager(String name,double salary,int deptid, double perbonus) {
		super(name, salary);
		this.deptid = deptid;
		this.perbonus = perbonus;
	}
	
	@Override
	public double netsal()
	{
		salary+=perbonus;
		return salary;
	}


	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public double getPerbonus() {
		return perbonus;
	}

	public void setPerbonus(double perbonus) {
		this.perbonus = perbonus;
	}

	@Override
	public String toString() {
		return super.toString()+", Manager [deptid=" + deptid + ", perbonus=" + perbonus + "]";
	}
	
	
	
	

}
