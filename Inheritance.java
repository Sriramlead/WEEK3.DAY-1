package week3.day1;

public class Inheritance {
	
		public static class Computer {
			public void computerModel() {
				System.out.println("im model of computer");
			}
		}

		public static class Desktop extends Computer {
			public void desktopSize() {
				System.out.println("im Desktop size");
			}
		}

		public static void main(String[] args) {
			
			Desktop dObj = new Desktop();
			dObj.computerModel();
			dObj.desktopSize();

		}

	}


