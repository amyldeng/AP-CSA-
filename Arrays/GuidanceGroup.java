import SatStudent.GuidanceGroup;

public class GuidanceGroup {
//Array group will store SatStudent objects
	private SatStudent[] group;

	/**
	 * Default Constructor for objects of class GuidanceGroup
	 */
	public GuidanceGroup() {
		group = new SatStudent[12];
		group[0] = (new SatStudent("Ye", 640, 695, 686));
		group[1] = (new SatStudent("Bradley", 778, 768, 780));
		group[2] = (new SatStudent("Chen", 687, 614, 705));
		group[3] = (new SatStudent("Davis", 620, 534, 556));
		group[4] = (new SatStudent("Aarons", 550, 565, 517));
		group[5] = (new SatStudent("Gupta", 687, 720, 640));
		group[6] = (new SatStudent("Park", 722, 721, 745));
		group[7] = (new SatStudent("Kohl", 595, 605, 615));
		group[8] = (new SatStudent("Mehta", 525, 637, 521));
		group[9] = (new SatStudent("Bahl", 611, 607, 610));
		group[10] = (new SatStudent("Smith", 670, 703, 610));
		group[11] = (new SatStudent("Issacs", 670, 690, 710));
	}

//Constructor with a SatStudent[] array as a parameter
	public GuidanceGroup(SatStudent[] myGroup) {
		group = myGroup;
	}
	
	public SatStudent[] getGroup() {
		return group;
	}

//This method displays a chart with 2 columns: Name and Total SAT score
	public void display() {
		System.out.println("Name\tGrade");
		for(int i = 0;i<group.length;i++) {
			System.out.print(group[i].name + "\t" + group[i].grade);
		}
	}

//This method returns the name of the student with the lowest total SAT
	public String getMin() {
		int index = 0;
		for(int i = 0;i<group.length;i++) {
			if (group[index].grade>group[i].grade) {
				group[index].grade = group[i].grade;
			}
		}	
		return group[index].name + "\t" + group[index].grade;
	}

//This method returns the name of the student with the highest total SAT
//score
	public String getMax() {
		int index = 0;
		for(int i = 0;i<group.length;i++) {
			if (group[index].grade<group[i].grade) {
				group[index].grade = group[i].grade;
			}
		}	
		return group[index].name + "\t" + group[index].grade;
	}

//This method returns the average of all SAT scores
	public double average() {
		double average = 0;
		for(int i = 0;i<group.length;i++) {
			average +=	group[i].grade;
		}	
		return average/group.length;
	}

//This method displays a list of names of students who scored below 1700
	public void below1700List() {
		for(int i = 0;i<group.length;i++) {
			if(group[i].grade<1700) {
				System.out.print(group[i].name + ", ");
			}
		}
	}

//This method displays a list of names of students who scored above2000
	public void above2000List() {
		for(int i = 0;i<group.length;i++) {
			if(group[i].grade>2000) {
				System.out.print(group[i].name + ", ");
			}
		}
	}

//this method will return the total score of an inputted name.
//return -1 if student is not found
	public int getScore(String lookfor) {
		for(int i = 0;i<group.length;i++) {
			if(group[i].name.equals(lookfor)) {
				return group[i].grade;
			}
		}
		return -1;
	}

//returns an array of SatStudents with total scores >1900
	public SatStudent[] scholarship() {
		int count = 0;
		for(int i = 0;i<group.length;i++) {
			if(group[i].grade>1900) {
				count++;
			}
		}
		SatStudent[] arr = new SatStudent[count];
		int index = 0;
		for(int i = 0;i<group.length;i++) {
			if(group[i].grade>1900) {
				arr[index] = group[i];
				index++;
			}
		}
		return arr;
	}

//returns a new GuidanceGroup with the SatStudents of this class combined
//with the SatStudents of other class
	public GuidanceGroup combineGroups(GuidanceGroup other) {
		SatStudent[] people = other.getGroup();
		SatStudent[] c = new SatStudent[group.length+people.length];
		for(int i = 0; i<group.length; i++) {
			c[i] = group[i];
		}
		for(int i = 0; i<people.length; i++) {
			c[i+group.length] = people[i];
		}
		return new GuidanceGroup();
	}

//Sorts the array of the GuidanceGroup by total score (descending)
	public void sortByTotalScore() {
		int n = group.length;
		for(int i = 0;i<n-1;i++) {
			for (int j = 0;j< n-i-1;j++) {
				if(group[j].grade > group[j+1].grade) {
					int temp = group[j].grade;
					group[j] = group[j+1];
					group[j+1].grade = temp;
				}
			}
		}
		
	}

//Sorts the array of the GuidanceGroup by Name (ascending (alphabetically))
	public void sortByName() {
		
	}

//this method will return the average of all of the students in the
//Scholarship category
	public double getScholarShipAverage() {
		return 999;
	}

	public static void main(String[] args) {

	}
}