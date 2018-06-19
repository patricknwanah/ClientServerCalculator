
public class CalculatorMachine {
	
	private CalculatorState hasInput;
	private CalculatorState needsInput;
	private CalculatorState calculatorState;
	private CalculatorState previousState;
	//private String input = "";
	public CalculatorMachine() 
	{
		this.hasInput = new HasInputState(this);
		this.needsInput = new NeedsInputState(this);
		
		this.calculatorState = needsInput;
		//this.previousState = needsInput;
//		if(this.input.length() < 1) {
//			this.calculatorState = needsInput;
			//this.previousState = needsInput;
			
		//}
	}
	
	public void setState(CalculatorState newCalculatorState) {
		//System.out.println("currentState<-->" + calculatorState.getEquation());
		//System.out.println("new state<-->" + newCalculatorState.getEquation());
		previousState = calculatorState;
		calculatorState = newCalculatorState;
		//System.out.println(previousState.getEquation() + "-->" + calculatorState.getEquation());
	}
	
	public CalculatorState getState() {
		return this.calculatorState;
	}
	
	public String insertNumber(String equationBuilder, String input) {
		return (String) calculatorState.insertNumber(equationBuilder,input);
	}
	
	public String insertOperator(String equationBuilder, String input) {
		return (String) calculatorState.insertOperator(equationBuilder, input);
	}
	public String clearInputs() {
		return (String) calculatorState.clearInputs();
	}
	public String calculateInputs(String equation) {
		return (String) calculatorState.calculateInputs(equation);
	}
	
	public CalculatorState getHasInput() {return this.hasInput;}
	public CalculatorState getNeedsInput() {return this.needsInput;}
	public CalculatorState getPreviousState() {return this.previousState;}
	

}
