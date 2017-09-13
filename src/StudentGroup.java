
import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
		
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		if(students.length == 0)
	  	return null;
	  return students; 
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		for (int i = 0 ; i < students.length ; i++)
		{
		  this.students[i] = new Student(students[i].getId(), students[i].getFullName(), students[i].getBirthDate(), students[i].getAvgMark());
		  
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		return students[index] ;
		//return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		students[index].setId(student.getId()) ;
		students[index].setFullName(student.getFullName()) ;
		students[index].setBirthDate(student.getBirthDate()) ;
		students[index].setAvgMark(student.getAvgMark()) ;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(students == null)
		  this.setStudent(student, 0) ;
		else{
		  int n = students.length ;
		  
		  Student s1[] = new Student[n+1] ;
		  s1[0] = new Student(student.getId(), student.getFullName(), student.getBirthDate(), student.getAvgMark()) ;
		  for(int i = 0 ; i < n ; i++)
		    s1[i+1] = new Student(students[i].getId(), students[i].getFullName(), students[i].getBirthDate(), students[i].getAvgMark()) ;
		  new StudentGroup(n+1) ;
		  this.students = null ;
		  this.setStudents(s1) ;
		}
		  
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(students == null)
		  this.setStudent(student, 0) ;
		else{
		  int n = students.length ;
		  
		  Student s1[] = new Student[n+1] ;
		  for(int i = 0 ; i < n ; i++)
		    s1[i] = new Student(students[i].getId(), students[i].getFullName(), students[i].getBirthDate(), students[i].getAvgMark()) ;
		  s1[n] = new Student(student.getId(), student.getFullName(), student.getBirthDate(), student.getAvgMark()) ;
		  new StudentGroup(n+1) ;
		  this.students = null ;
		  this.setStudents(s1) ;
		}
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		Student[] st = new Student[students.length] ;
		int j = 0 ;
		for(int i = 0 ; i < students.length ; i++){
		  if(students[i].getBirthDate().equals(date))
		    st[++j] = new Student(students[i].getId(), students[i].getFullName(), students[i].getBirthDate(), students[i].getAvgMark());
		}
		return st;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		Student[] st = new Student[students.length] ;
		int j = 0 ;
		for(int i = 0 ; i < students.length ; i++){
		  if(students[i].getBirthDate().after(firstDate) && students[i].getBirthDate().before(lastDate))
		    st[++j] = new Student(students[i].getId(), students[i].getFullName(), students[i].getBirthDate(), students[i].getAvgMark());
		}
		return st;
//		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int i) {
		// Add your implementation here
		Date date = students[i].getBirthDate() ;
		date.getYear() ;
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		Student[] st = new Student[students.length] ;
		int j = 0 ;
		for(int i = 0 ; i < students.length ; i++){
		  if(this.getCurrentAgeByDate(i) == age)
		    st[++j] = new Student(students[i].getId(), students[i].getFullName(), students[i].getBirthDate(), students[i].getAvgMark());
		}
		return st;
		//return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		Student[] st = new Student[students.length] ;
		int j = 0 ;
		double max = students[0].getAvgMark() ;
		for(int i = 0 ; i < students.length ; i++){
		  if(students[i].getAvgMark() >= max)
		    st[++j] = new Student(students[i].getId(), students[i].getFullName(), students[i].getBirthDate(), students[i].getAvgMark());
		}
		return st;
	//	return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		Student st=null ;
		for(int i = 0 ; i < students.length ; i++){
		  if(students[i].getId() == student.getId()+1)
		    st = new Student(students[i].getId(), students[i].getFullName(), students[i].getBirthDate(), students[i].getAvgMark());
		}
		return st;
//		return null;
	}
}
