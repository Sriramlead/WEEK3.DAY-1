package week3.day1;

public class College {
	
		public void collegeName() {
			System.out.println("The college name is anna university");
		}
		
		public void collegeCode() {
			System.out.println("The college code is :+ 5008");
		}
		
		public void collegeRank() {
			System.out.println("The college rank is :1");
		}
	}

	class Department extends College{
		
		public void departmentName() {
			System.out.println("The department name is : ECE");
		}
	}

	class Students extends Department{
		
		public void studentName(){
			System.out.println("The student name is : rahul");
		}
		
		public void studentDept(){
			System.out.println("The student Department is : CIVIL");
		}
		
		public void studentID(){
			System.out.println("The student ID is : 14");
		}
	}

	class CollegeStudent{
		
		public static void main(String args[]) {
			
			Students obj = new Students();
			obj.collegeName();
			obj.collegeCode();
			obj.collegeRank();
			obj.departmentName();
			obj.studentName();
			obj.studentDept();
			obj.studentID();
		}
	}


