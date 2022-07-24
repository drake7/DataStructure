package assignment3;

public class SalesPerson implements Comparable<SalesPerson>{
	int id=0;
	double annualSalesAmount=0;

	public SalesPerson(int id,double annualSalesAmount) {
		this.id=id;
		this.annualSalesAmount=annualSalesAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAnnualSalesAmount() {
		return annualSalesAmount;
	}

	public void setAnnualSalesAmount(double annualSalesAmount) {
		this.annualSalesAmount = annualSalesAmount;
	}

	@Override
	public String toString() {
		return "SalesPerson [id=" + id + ", annualSalesAmount=" + annualSalesAmount + "]";
	}
	
	public int compareTo(SalesPerson salesMan) {
		
		int compareId = ((SalesPerson)salesMan).getId(); 
		
		//ascending order
		return this.id - compareId;
		
	}	
}
