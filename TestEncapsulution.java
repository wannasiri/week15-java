package week15;
class Student {
	private int rollNo;
	private String name;
	private String className;
	
	private String text="flying";
	
	public void fly() {
		System.out.println(text);
	}
	
	
	public int getRollNo () {
		return rollNo;
		}
	public String getName() {
		return name;
		}
	public String getclassName() {
		return className;
		}
	
	public void setRollNo(int value) {
		rollNo =value;
		}
	public void setName(String value) {
		name =value;
		}
	public void setClassName(String value) {
		className =value;
		}
	}
class Animation extends Student{
	private String text="fly";
	public void play() {
		System.out.println("Animation");
	}
}

		

public class TestEncapsulution {
	public static void main(String[]args) {
		Student obj =new Student();
		Animation an =new Animation();
		an.play();
		an.fly();
		obj.setRollNo(1);
		obj.setName("Rov");
		obj.setClassName("pubg");
		System.out.println("Student RollNo:" +obj.getRollNo());
		System.out.println("Student Name:" +obj.getName());
		System.out.println("Student Class:" +obj.getclassName());
	}
}
