
public interface CalculatorState {
	
	public Object insertNumber(String e, String i);
	public Object insertOperator(String e, String i);
	public Object clearInputs();
	public Object calculateInputs(String equation);
	public String getEquation();
	public CalculatorMachine getMachine();
	public void setEquation(String eq);
	
}
