//to demonstrate the student derived class
package Day5_inheritance;

public class student extends citizen {
	private int aid;
	private String course;
	public student()
	{
		System.out.println("student object created");
	}
	public student(int cid, String name, int age,int aid,String course)
	{
		super(cid,name,age);
		this.aid=aid;
		this.course=course;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "student [aid=" + aid + ", course=" + course + "]";
	}
	
	

}
