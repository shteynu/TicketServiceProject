package application.dto;

public enum AgeTypeDto {
	Adult(1),
	Child(0.5),
	Senior(0.5),
	Soldier(0.3);
	
	private double coefficient;
	
	private AgeTypeDto(double coefficient) {
		this.coefficient = coefficient;
	}

	private double getCoefficient() {
		return coefficient;
	}
	
	

	
	

}
