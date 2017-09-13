import java.util.* ;
import java.text.*;
public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		
		Scanner sc = new Scanner(System.in) ;
		int n = sc.nextInt() ;
		sc.nextLine() ;
		Student st[] = new Student[n];
		for (int i = 0 ; i < n ; i++){
		  String st1 = sc.nextLine() ;
      String str[] = st1.split(" ") ;
      int id = Integer.parseInt(str[0]) ;
      String fullname = str[1] + " " + str[2] ;
      DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
      Date date=null;
      try{
      date = df.parse(str[3]);
      }
      catch(Exception e){}
      Double marks = Double.parseDouble(str[4]) ;
      st[i] = new Student(id, fullname, date, marks) ;
		}
    StudentGroup sg = new StudentGroup(n) ;
    sg.setStudents(st);
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    Date date = null ;
    try {
      date = df.parse("1999-09-09") ;
      
    }catch(Exception e){}
    
    Student stud = new Student(2, "p k", date, 43.3) ;
    sg.addFirst(stud) ;
    System.out.println(sg.getStudent(0).getFullName() );
  
    
    
	}
	
	

}
