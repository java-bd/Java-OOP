// http://www.javatpoint.com/constructor

/*
	There is no copy constructor in java. But, we can copy the values of one object to 
	another like copy constructor in C++.
	
	There are many ways to copy the values of one object into another in java. They are:
	
		By constructor
		By assigning the values of one object into another
		By clone() method of Object class

*/

class CopyConstructor {
	
	int id;
	String name;
	CopyConstructor (int i, String n){
		id = i;
		name = n;
	}
	
	CopyConstructor (CopyConstructor s){
		id = s.id;
		name = s.name;
	}	
	
	void display (){
		System.out.println("id : " + id + ", Name: " + name);
	}
	
	public static void main (String args[]){
		CopyConstructor cc1 = new CopyConstructor(111, "AMRAN");
		CopyConstructor cc2 = new CopyConstructor(cc1);
		cc1.display();
		cc2.display();
	}
	
}




/*
	Method 2:
	
	We can copy the values of one object into another by assigning the objects values to 
	another object. In this case, there is no need to create the constructor.
	
	class Student7{  
		int id;  
		String name;  
		Student7(int i,String n){  
			id = i;  
			name = n;  
		}  
		
		Student7(){}  
		
		void display(){
			System.out.println(id+" "+name);
		}  
	   
		public static void main(String args[]){  
			Student7 s1 = new Student7(111,"Karan");  
			Student7 s2 = new Student7();  
			s2.id=s1.id;  
			s2.name=s1.name;  
			s1.display();   // 111 Karan
			s2.display();   // 111 Karan
		}  
	}  

*/











