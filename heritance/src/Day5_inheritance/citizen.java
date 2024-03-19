package Day5_inheritance;

public class citizen {
	private int cid;
	private String name;
	private int age;
	public citizen()
	{
		System.out.println("citizen object is created");
	}
	public citizen(int cid,String name,int age )
	{
		this.cid=cid;
		this.name=name;
		this.age=age;
	}
	public int getId() {
		return cid;
	}
	public void setId(int id) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
