
public class Student5 {
int id;
String name;
int age;
static String college="S.P.M";     //static keyword
Student5(int i,String n,int a){
	id=i;
	name=n;
	age=a;
}
public Student5(int i,String n) {
	id=i;
	name=n;
}
void display(
		){
	System.out.println(id+" "+name+" "+age+" "+college);
}
Student5(Student5 s){    //Copy Constructor
	id=s.id;
	name=s.name;
	age=s.age;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student5 st=new Student5(101, "Amit", 5);
Student5 st1=new Student5(102, "mohit", 6);
Student5 st2=new Student5(st1);//OBJECT CREATED OF Copy Constructor.
//we can change the college of all objects by the single line of code  
//Student5.college="BBDIT";
st.display();
st1.display();
st2.display();
	}

}
