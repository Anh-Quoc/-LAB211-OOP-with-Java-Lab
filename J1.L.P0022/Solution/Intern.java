class Intern extends Candidates {
	private String majors;
	private String semester;
	private String universityName;

	public Intern(){
		super(all_candidatesType[2]);
		create_Majors();
		create_Semester();
		create_UniversityName();
	}
	
	private void create_Majors(){
		System.out.print();
		setMajors(sc.nextLine());
	}
	public void setMajors(String majors){
		this.majors = majors;
	}

	private void create_Semester(){
		System.out.print();
		setSemester(sc.nextLine());
	}
	public void setSemester(String semester){
		this.semester = semester;
	}

	private void create_UniversityName(){
		System.out.print();
		setUniversityName(sc.nextLine());
	}
	public void setUniversityName(String universityName){
		this.universityName = universityName;
	}

	public String getMajors(){
		return this.majors;
	}
	public String getSemester(){
		return this.semester;
	}
	public String getUniversityName(){
		return this.universityName;
	}
}