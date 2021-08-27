package week3.day1;

	

	public class Student {
		
		public void getStudentInfo(int id) {
			
			System.out.println("Student id : " + id);		
		}
		
		public void getStudentInfo(int id, String name) {
			
			System.out.println("Studend id : " +id+ " and name : " + name);
		}
		
		public void getStudentInfo(String email, int phoneNum) {
			
			System.out.println("Student email : "+email+ " and phoneNumber : "+phoneNum);
		}
		
		public static void main(String args[]) {
			
			Student obj = new Student();
			obj.getStudentInfo(55);
			obj.getStudentInfo(50, "Sri");
			obj.getStudentInfo("abc@gmail.com", 698541234);
		
		}
	}
	

