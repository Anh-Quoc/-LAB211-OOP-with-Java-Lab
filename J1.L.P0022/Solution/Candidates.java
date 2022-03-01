class Candidates implements Localized{
	private String candidatesID;
	private String firstName;
	private String lastName;
	private String birthDate;
	private String address;
	private String phone;
	private String email;
	private String candidatesType;
	
	public Candidates(){

	}

	public Candidates(String candidatesType){
		create_CandidateID();
		create_FirstName();
		create_LastName();
		create_BirthDate();
		create_Address();
		create_Phone();
		create_Email();
		setCandidatesType(candidatesType);
	}

	private void create_CandidateID(){
		System.out.print();
		setCandidateID(sc.nextLine());
	}
	public void setCandidateID(String candidatesID){
		this.candidatesID = candidatesID;
	}

	private void create_FirstName(){
		System.out.print();
		setFirstName(sc.nextLine());
	}
	public void setFirstName(String firstName){		
		this.firstName = firstName;
	}

	private void create_LastName(){
		System.out.print();
		setLastName(sc.nextLine());
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public void create_BirthDate(){
		System.out.print();
		setBirthDate(sc.nextLine());
	}
	public void setBirthDate(String birthDate){
		if(checkBirthDate(birthDate)){
			this.birthDate = birthDate;
		} else {
			System.out.print();
		}
	}
	private boolean checkBirthDate(String birthDate){
		try {
			boolean checkLength = birthDate.length() == length_birthDate;
			boolean checkCurrentYear = Integer.parseInt(birthDate) >= year_birthDate;
			return checkLength == true && checkCurrentYear == true;
		} catch(NumberFormatException e){
			return false;
		}
	}
	
	private void create_Address(){
		System.out.print();
		setAddress(sc.nextLine());
	}
	public void setAddress(String address){		
		this.address = address;
	}

	private void create_Phone(){
		System.out.print();
		setPhone(sc.nextLine());
	}
	public void setPhone(String phone){
		if(checkPhone(phone)){
			this.phone = phone;
		} else {
			System.out.println();
		}
	}
	private boolean checkPhone(String phone){
		try{
			Integer.parseInt(phone);
			return phone.length() >= 10;
		} catch(NumberFormatException e){
			return false;
		}
	}

	private void create_Email(){
		System.out.print();
		setEmail(sc.nextLine());
	}
	public void setEmail(String email){				
		if(checkEmail(email)){
			this.email = email;
		} else {
			System.out.println();
		}
	}
	private boolean checkEmail(String email){
		for(String domain : domainEmail){
			if(email.indexOf(domain) == (email.length() - domain.length())){
				return true;
			}
		}
		return false;
	}

	public void setCandidatesType(){
		this.candidatesType = candidatesType;
	}

	public String getCandidateID(){
		return this.candidatesID;
	}
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public String getBirthDate(){
		return this.birthDate;
	}
	public String getAddress(){
		return this.address;
	}
	public String getPhone(){
		return this.phone;
	}
	public String getEmail(){
		return this.email;
	}
	public String getCandidatesType(){
		return this.candidatesType;
	}
}