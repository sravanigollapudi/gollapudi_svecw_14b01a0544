import java.util.Date;
import java.io.*;

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
	public void setStudents(Student[] students) {
		// Add your implementation here\
		try {
		    if(students == null)
			    throw new IllegalArgumentException();
		    for(int i=0;i< this.students.length;++i){
	            this.students[i] = students[i];
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
			    throw new IllegalArgumentException();
			for(int i=0;i < students.length;++i){
	            if(i == index) return students[i];
	        }
		}
		catch(Exception e) {
			e.printStackTrace();
		
		}
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here\
		try {
			if(student == null) throw new IllegalArgumentException();
			if(index < 0 || index >= students.length)throw new IllegalArgumentException();
			for(int i=0; i < students.length; ++i){
				if(i == index)
	                students[i]= student;
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
	        if (student == null) throw new Exception();
	        Student[] dummy = new Student[students.length+1];
	        dummy[0] = student;
	        for(int i = 1; i < students.length+1; i++)
	        	dummy[i] = students[i];
            students = dummy;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		try {
			if(student == null) throw new IllegalArgumentException();
			Student[] temp = new Student[students.length+1];
		    temp[students.length] = student;
		    students = temp;
		}
		catch(Exception e) {e.printStackTrace();}
		
	    
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		Student[] res = new Student[students.length+1];
	    for(int i = 0; i < index; i++) res[i] = students[i];
	    res[index] = student;
	    for(int i = index+1; i < students.length+1; i++)
	    	res[i] = students[i-1];
	    students = res;
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		try {
			if(index < 0  || index >= students.length)throw new IllegalArgumentException();
		    Student[] temp = new Student[students.length-1];
		    for(int i = 0; i < index; i++) temp[i] = students[i];
		    int j = index;
		    for(int i = index+1; i < students.length ; i++) temp[j++] = students[i];
		    students = temp;
		}
		catch(Exception e) {e.printStackTrace();}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		try {
			if (student == null) throw new IllegalArgumentException();
			for(int i = 0; i < students.length; i++) {
				if(students[i].getId() == student.getId()) {
					while(i < students.length-1) {
						students[i] = students[i+1];
					}
				}
			}
		}
		catch(Exception e) {e.printStackTrace();}

	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		try {
			if (index < 0 || index >= students.length) throw new IllegalArgumentException();
            Student[] temp = new Student[index];
            for(int i = 0; i < students.length; i++) {
            	temp[i] = students[i];
            }
            students = temp;
		}
		catch(Exception e) {e.printStackTrace();}

	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		try {
			if(student == null) {
				throw new IllegalArgumentException();
		    }
			
			int i;
			for(i = 0; i < students.length; i++) {
				if(students[i] == student) break;
			}
			Student[] temp = new Student[i];
			for(int j = 0; j < i; j++)
				temp[j] = students[j];
			students = temp;
		}
		catch(Exception e) {e.printStackTrace();}

		
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		int r = students.length-index;
		Student[] dummy = new Student[r];
		try {
			if (students == null) throw new IllegalArgumentException();
            for(int i = r, j = 0; i < students.length; i++, j++) {
                dummy[j] = students[i];
            }
            students = dummy;
        }
		catch(Exception e) {e.printStackTrace();}

	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		for(int i = 0; i < students.length; i++) {
			for(int j = 0; j < students.length-i-1; j++) {
				if(students[i].getAvgMark() > students[i+1].getAvgMark()) {
				    Student temp = students[i];
				    students[i] = students[i+1];
				    students[i+1] = temp;
				}
			}
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		try {
			if (date == null) throw new IllegalArgumentException();
			Student[] dummy = new Student[students.length];
			for(int i = 0, j = 0; i < students.length; i++) {
				if(students[i].getBirthDate().compareTo(date) <= 0) { 
					dummy[j] = students[i];
					j++;
				}
			}
			return dummy;
		}
		catch(Exception e) {e.printStackTrace();}
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
		Student dummy[] = new Student[students.length]; 
	    double max = students[0].getAvgMark();
	    for(int i = 1; i < students.length; i++) {
	    	if(students[i].getAvgMark() > max) {
	    		max = students[i].getAvgMark();
	    	
	    	}
	    }
	    for(int i = 0, j = 0; i < students.length; i++) {
	    	if(students[i].getAvgMark() == max) {
	    		dummy[j] = students[i];
	    		j++;
	    	}
	    }
	    return dummy;
		
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		try {
			if (student == null)throw new IllegalArgumentException();
			for(int i = 0; i < students.length; i++) {
				if(student.getId() == students[i].getId()) {
					return students[i+1];
				}
			}
		}
		catch(Exception e) {e.printStackTrace();}
		return null;
	}
}
