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
		
		return this.students;
		
	}

	@Override
	public void setStudents(Student[] students1) {
		// Add your implementation here\
		try {
		    if(students1 == null)
			    throw IllegalArgumentException;
		    for(int i=0;i<sudents1.length;++i){
	            students[i]=students1[i];
	        }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		try {
			if(index < 0 || index >= students.length) 
			    throw IllegalArgumentException;
			for(int i=0;i<sudents.length;++i){
	            if(i == index) return students[i];
	        }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here\
		try {
			if(student == null) throw IllegalArgumentException;
			if(index < 0 || index >= students.length)throw IllegalArgumentException;
			for(int i=0;i<sudents.length;++i){
				if(i == index)
	                students[i]=student[i];
	        }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		try {
	        if (student == null) throw IllegalArgumentException;
	        /*Student[] dummy  = new Student[students.size+1];
	        dummy[0] = student;
	        for(int i=1;i<dummy.length;++i){
				dummy[i]=student[i];
			}
	        for(int i=0;i<dummy.length;++i){
				students[i] = dummy[i];
			}*/
            //list.add(0, yourObject);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
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
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
