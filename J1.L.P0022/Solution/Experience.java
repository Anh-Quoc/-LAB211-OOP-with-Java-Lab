class Experience extends Candidates {
	private String expInYear;
	private String proSkill;

	public Experience(){
		super(all_candidatesType[0]);
		create_ExpInYear();
		create_ProSkill();
	}

	private void create_ExpInYear(){
		System.out.print();
		setExpInYear(sc.nextLine());
	}
	public void setExpInYear(String expInYear){		
		if(checkExpInYear(expInYear)){
			this.expInYear = expInYear;
		} else {
			System.out.println();
		}
	}
	private boolean checkExpInYear(String expInYear){
		try{
			int year = Integer.parseInt(expInYear);
			if(year >= expInYear_Min && year <= expInYear_Max){
				return true;
			}
		} catch(NumberFormatException e){
			return false;
		}
	}

	private void create_ProSkill(){
		System.out.print();
		setProSkill(sc.nextLine());
	}
	public void setProSkill(String proSkill){		
		this.proSkill = proSkill;
	}

	public String getExpInYear(){
		return this.expInYear;
	}
	public String getProSkill(){
		return this.proSkill;	
	}
}