
package application.entity;

public enum AgeType {
	Adult(1),
	Child(0.5),
	Senior(0.5),
	Soldier(0.3);
	
	private double coefficient;
	
	private AgeType(double coefficient) {
		this.coefficient = coefficient;
	}

	private double getCoefficient() {
		return coefficient;
	}
}
