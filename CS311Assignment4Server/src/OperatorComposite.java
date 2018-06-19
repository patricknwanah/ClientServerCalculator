
public class OperatorComposite implements Visitable{

	public char operator = '\0';
	public OperatorComposite oc;
	public String firstNumber = "";
	public String equation;
	public int operatorLength;
	
	public OperatorComposite(String aEquation)
	{
		this.equation = aEquation;
		//this.oc = null;
	}
	@Override
	public Object accept(Visitor v) 
	{
		// TODO Auto-generated method stub
		return v.visit(this);
	}
	
	public String getEquation(){return this.equation;}
	public void setEquation(String aEquation){this.equation = aEquation;}
	//public void setFirstNumber(Double aFirstNumber) {this.firstNumber = aFirstNumber;}
	//public void setOperator(char op) {this.operator = op;}
	

}
