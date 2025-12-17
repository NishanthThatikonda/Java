package tcs;

import java.util.*;
class Student{
	private int student;
	private String name;
	private int subjectcount;
	private Map<String, Integer>  subject;
	

	
	public Student(int student, String name, Map<String, Integer> subject) {
		super();
		this.student = student;
		this.name = name;
		this.subject = subject;
	}
	
	
	
	
	public Student(int subjectcount) {
		super();
		this.subjectcount = subjectcount;
	}




	public int getSubjectcount() {
		return subjectcount;
	}




	public void setSubjectcount(int subjectcount) {
		this.subjectcount = subjectcount;
	}




	public int getStudent() {
		return student;
	}
	public void setStudent(int student) {
		this.student = student;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Integer> getSubject() {
		return subject;
	}
	public void setSubject(Map<String, Integer> subject) {
		this.subject = subject;
	}
	
}




public class Books {
	
	
	public static  double  searchbyid(List<Student> Mlist1, int searchid) {
		
		for(Student l: Mlist1 ) {
			if(l.getStudent()==searchid) {
				Collection<Integer> pric=l.getSubject().values();
				int sum=0;
				for(int m:pric) 
				sum= sum+m;
				
				return sum / (double) pric.size();
				
				
			}
		}
		
		System.out.println("student not found");
		
		
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		List<Student> Mlist= new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		sc.nextLine();
		for(int i=0; i<n; i++) {
			int student= sc.nextInt();
			sc.nextLine();
			String name= sc.nextLine();
			int subjectcount=sc.nextInt();
			sc.nextLine();
			Map<String,Integer> subjectss= new HashMap<>();
			for(int j=0; j<subjectcount; j++) {
				
				String subj=sc.nextLine();
				int marks=sc.nextInt();
				sc.nextLine();
				subjectss.put(subj,marks);
			}
			
			Mlist.add(new Student( student,  name, subjectss));
		}
		int searchid=sc.nextInt();
		sc.nextLine();
		double avg=searchbyid(Mlist,searchid);
		  if (avg != -1) {
	            System.out.println("Average Marks: " + avg);
	        }
		
	}

}
