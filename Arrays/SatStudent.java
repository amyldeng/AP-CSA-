public class SatStudent {
	public String name;
	public int math;
	public int verbal;
	public int writing;
	public int grade;

	public SatStudent() {
		name = "Andersson";
		math = 670;
		verbal = 680;
		writing = 700;
		grade = math+verbal+writing;
	}
	
	public SatStudent(String n,int m,int v,int w) {
		name = n;
		math = m;
		verbal = v;
		writing = w;
		grade = m + v + w;
	}
//1. Complete the SatStudent class. Add any //methods that you need.

//2. Complete the methods of the GuidanceGroup Class. You may need to
//add additional methods
	
}
