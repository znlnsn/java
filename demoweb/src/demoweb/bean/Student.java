package demoweb.bean;

public class Student {
	private int sno;
	private String sname;
	private int sage;
	private String ssex;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public String getSsex() {
		return ssex;
	}
	public void setSsex(String ssex) {
		this.ssex = ssex;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", sage=" + sage + ", ssex=" + ssex + "]";
	}
	
}
