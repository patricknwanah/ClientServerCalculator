
public class FormEquationVisitor implements Visitor{

	@Override
	public Object visit(OperatorComposite o) {
		// TODO Auto-generated method stub
		
		String equation = o.getEquation().trim().replaceAll("\\s+","");
		String operationString = equation.replaceAll("[.0123456789]", "");
		//String numberString = equation.replaceAll("\\D","");
		String[] numbers = equation.split("[^\\.0123456789]");//convertToArray(numberString);
		char[] operators = convertToChars(operationString);
		
		OperatorComposite temp = o;
		for(int i = 0; i < numbers.length; i++) {
			temp.firstNumber = numbers[i];
			temp.operator=operators[i];
			temp.oc = new OperatorComposite(equation);
			temp.operatorLength = operators.length;
			temp = temp.oc;
		}
		return null;
	}

	private void printArray(String[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
	}
	
	private double[] convertToDouble(String[] array) {
		double[] temp = new double[array.length];
		for(int i = 0; i < array.length; i++) {
			temp[i] = Double.parseDouble(array[i]);
		}
		return temp;
	}
	private void printArray(char[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
	}
	
	private double[] convertToArray(String aNumbers)
	{
		double[] numbers = new double[aNumbers.length()];
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = (double) Character.digit(aNumbers.charAt(i), 10);
		}
		return numbers;
	}
	private char[] convertToChars(String aOperation)
	{
		char[] operators = new char[aOperation.length()];
		for(int i = 0; i < operators.length; i++) {
			operators[i] = aOperation.charAt(i);
		}
		return operators;
	}

}
