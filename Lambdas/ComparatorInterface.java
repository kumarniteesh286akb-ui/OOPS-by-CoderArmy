package Lambdas;

import java.util.*;

public class ComparatorInterface {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("Niteesh",46,98));
		list.add(new Student("Kumar",45,92));
		list.add(new Student("Nimrit",26,88));
		list.add(new Student("Arya",36,99));

//		Comparator <Student> c1 = new SortByMarks();
//		Comparator <Student> c2 = new SortByRollNo();
//		Comparator <Student> c3 = new SortByName();
//		Collections.sort(list,c3);
//		Collections.sort(list, new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o1.name.compareTo(o2.name);
//			}
//		});
//		Collections.sort(list,(s1, s2)->s1.name.compareTo(s2.name));
Collections.sort(list,(a,b)->a.rollNo-b.rollNo);


for(Student s:list){
	System.out.println(s.name+" "+s.rollNo+" "+s.marks);
}


	}
}
//class SortByName implements Comparator<Student>{
//	@Override
//	public int compare(Student s1,Student s2){
//		return s1.name.compareTo(s2.name);
//	}
//}
//class SortByMarks implements Comparator<Student>{
//	@Override
//	public int compare(Student s1,Student s2){
//		return s1.marks-s2.marks;
//	}
//}
//class SortByRollNo implements Comparator<Student>{
//	@Override
//	public int compare(Student s1,Student s2){
//		return s1.rollNo-s2.rollNo;
//	}
//}
//

class Student{
	String name;
	int rollNo;
	int marks;
	public Student(String name,int rollNo,int marks){
		this.name= name;
		this.marks= marks;
		this.rollNo= rollNo;
	}
}