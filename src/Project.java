
public class Project {

	private int proCode;
	private String proTitle;
	private String proDuration;
	private String cmpName;
	
	public int getProCode() {
		return proCode;
	}
	public void setProCode(int proCode) {
		this.proCode = proCode;
	}
	public String getProTitle() {
		return proTitle;
	}
	public void setProTitle(String proTitle) {
		this.proTitle = proTitle;
	}
	public String getProDuration() {
		return proDuration;
	}
	public void setProDuration(String proDuration) {
		this.proDuration = proDuration;
	}
	public String getCmpName() {
		return cmpName;
	}
	public void setCmpName(String cmpName) {
		this.cmpName = cmpName;
	}
	
	public Project(int proCode, String proTitle, String proDuration,
			String cmpName) {
		super();
		this.proCode = proCode;
		this.proTitle = proTitle;
		this.proDuration = proDuration;
		this.cmpName = cmpName;
	}
	
	@Override
	public String toString() {
		return "Project [proCode=" + proCode + ", proTitle=" + proTitle
				+ ", proDuration=" + proDuration + ", cmpName=" + cmpName + "]";
	}
	
	
}
