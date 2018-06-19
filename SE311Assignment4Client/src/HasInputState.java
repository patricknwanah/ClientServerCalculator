
public class HasInputState implements CalculatorState{
	
	public CalculatorMachine machine;
	public String equation = "";
	public HasInputState(CalculatorMachine newMachine)
	{
		this.machine = newMachine;
	}
	
	
	@Override
	public String getEquation() {return this.equation;}
	
	@Override
	public Object insertNumber(String eq, String input) {
		// TODO Auto-generated method stub
		eq = eq + input;
		
		//this.equation = eq;
		this.machine.getHasInput().setEquation(eq);
		this.machine.setState(this.machine.getHasInput());
		return eq;
	}

	@Override
	public Object clearInputs() {
		// TODO Auto-generated method stub
		
		//this.equation = "";
		this.machine.getNeedsInput().setEquation("");
		this.machine.setState(this.machine.getNeedsInput());
		
		return "";
	}

	@Override
	public Object calculateInputs(String equation) {
		// TODO Auto-generated method stub
		MyClient client = new MyClient();
		String answer = client.run(equation);
		//this.equation = answer;
		this.machine.getHasInput().setEquation(answer);
		this.machine.setState(this.machine.getHasInput());
		
		return answer;
	}

	@Override
	public Object insertOperator(String eq, String input) {
		// TODO Auto-generated method stub
		eq = eq + input;
		if(input.trim() == "=") {
			this.machine.getHasInput().setEquation(eq);
			this.machine.setState(this.machine.getHasInput());
		}
		else {
			this.machine.getNeedsInput().setEquation(eq);
			this.machine.setState(this.machine.getNeedsInput());
		}
		//this.equation = eq;
		return eq;
	}

	@Override
	public CalculatorMachine getMachine() {
		// TODO Auto-generated method stub
		return this.machine;
	}


	@Override
	public void setEquation(String eq) {
		// TODO Auto-generated method stub
		equation = eq;
	}

	

}
