import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class CalculateEquationVisitor implements Visitor{

	@Override
	public Object visit(OperatorComposite o) {
		// TODO Auto-generated method stub
		
		OperatorComposite temp = o;
		String total = temp.firstNumber;
		try {
			
			for(int i = 0; i < temp.operatorLength; i++) {
				
				total = calculateDouble(total,temp.oc.firstNumber, temp.operator);
				//calculateDouble(temp.firstNumber, temp.oc.firstNumber,o.operator, total);
				temp = temp.oc;
				
			}
			if(total.equalsIgnoreCase("Infinity")) {
				total = "";
			}
			else {
				String fullEquation = temp.equation + " " + total;
				RunServer.allEquations.add(fullEquation);
			}
			System.out.println("Number of successful equations: " + RunServer.allEquations.size());
			for(String s: RunServer.allEquations) {
				System.out.println("Equation: " + s);
			}
		}catch(NumberFormatException e) {total = "";}
		
		return total;
	}
	
	private String calculateDouble(String total, String anew, char operation)
	{
		//System.out.println(total + " "+ operation + " " + anew);
		
		ScriptEngineManager mgr = new ScriptEngineManager();
	    ScriptEngine engine = mgr.getEngineByName("JavaScript");
	    
	    //System.out.println(engine.eval(foo));
		switch(operation) {
			case '=': 
				total = total;
			break;
			default:
				String foo = total + " " + operation + " " + anew;
			try {
				total = engine.eval(foo).toString();
			} catch (ScriptException e) {
				// TODO Auto-generated catch block
				return "";
				//e.printStackTrace();
			}
			break;
		}
		return total;
	}

}
