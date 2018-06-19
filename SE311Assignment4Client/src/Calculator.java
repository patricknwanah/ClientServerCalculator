import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import java.util.ArrayList;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Calculator {

	protected Shell shlSimpleCalculator;
	private Text UserView;
	private String equationBuilder = "";
	private CalculatorMachine calcMachine = new CalculatorMachine();
	private ButtonSubject subject = new ButtonSubject();
	private ButtonObserver observer = new ButtonObserver(subject);
	//public static ArrayList<String> problemtoSolve = new ArrayList<String>();
	public static int OperatorCounter = 0;
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Calculator window = new Calculator();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlSimpleCalculator.open();
		shlSimpleCalculator.layout();
		while (!shlSimpleCalculator.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		
		shlSimpleCalculator = new Shell();
		shlSimpleCalculator.setSize(450, 300);
		shlSimpleCalculator.setText("Simple Calculator");
		
		UserView = new Text(shlSimpleCalculator, SWT.BORDER);
		UserView.setBounds(10, 10, 414, 21);
		
		Button b1 = new Button(shlSimpleCalculator, SWT.NONE);
		b1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				equationBuilder = calcMachine.insertNumber(equationBuilder, "1");
				UserView.setText(equationBuilder);
				subject.updateEquation(equationBuilder);
			}
		});
		b1.setBounds(10, 37, 75, 25);
		b1.setText("1");
		
		Button b4 = new Button(shlSimpleCalculator, SWT.NONE);
		b4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				equationBuilder = calcMachine.insertNumber(equationBuilder, "4");
				UserView.setText(equationBuilder);
				subject.updateEquation(equationBuilder);
			}
		});
		b4.setBounds(10, 68, 75, 25);
		b4.setText("4");
		
		Button b7 = new Button(shlSimpleCalculator, SWT.NONE);
		b7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				equationBuilder = calcMachine.insertNumber(equationBuilder, "7");
				UserView.setText(equationBuilder);
				subject.updateEquation(equationBuilder);
			}
		});
		b7.setBounds(10, 99, 75, 25);
		b7.setText("7");
		
		Button b0 = new Button(shlSimpleCalculator, SWT.NONE);
		b0.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				equationBuilder = calcMachine.insertNumber(equationBuilder, "0");
				UserView.setText(equationBuilder);
				subject.updateEquation(equationBuilder);
			}
		});
		b0.setBounds(10, 130, 75, 25);
		b0.setText("0");
		
		Button b2 = new Button(shlSimpleCalculator, SWT.NONE);
		b2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				equationBuilder = calcMachine.insertNumber(equationBuilder, "2");
				UserView.setText(equationBuilder);
				subject.updateEquation(equationBuilder);
			}
		});
		b2.setBounds(91, 37, 75, 25);
		b2.setText("2");
		
		Button b5 = new Button(shlSimpleCalculator, SWT.NONE);
		b5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				equationBuilder = calcMachine.insertNumber(equationBuilder, "5");
				UserView.setText(equationBuilder);
				subject.updateEquation(equationBuilder);
			}
		});
		b5.setBounds(91, 68, 75, 25);
		b5.setText("5");
		
		Button b8 = new Button(shlSimpleCalculator, SWT.NONE);
		b8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				equationBuilder = calcMachine.insertNumber(equationBuilder, "8");
				UserView.setText(equationBuilder);
				subject.updateEquation(equationBuilder);
			}
		});
		b8.setBounds(91, 99, 75, 25);
		b8.setText("8");
		
		
		
		Button b3 = new Button(shlSimpleCalculator, SWT.NONE);
		b3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				equationBuilder = calcMachine.insertNumber(equationBuilder, "3");
				UserView.setText(equationBuilder);
				subject.updateEquation(equationBuilder);
			}
		});
		b3.setBounds(172, 37, 75, 25);
		b3.setText("3");
		
		Button b6 = new Button(shlSimpleCalculator, SWT.NONE);
		b6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				equationBuilder = calcMachine.insertNumber(equationBuilder, "6");
				UserView.setText(equationBuilder);
				subject.updateEquation(equationBuilder);
			}
		});
		b6.setBounds(172, 68, 75, 25);
		b6.setText("6");
		
		Button b9 = new Button(shlSimpleCalculator, SWT.NONE);
		b9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				equationBuilder = calcMachine.insertNumber(equationBuilder, "9");
				UserView.setText(equationBuilder);
				subject.updateEquation(equationBuilder);
			}
		});
		b9.setBounds(172, 99, 75, 25);
		b9.setText("9");
		
		Button clearButton = new Button(shlSimpleCalculator, SWT.NONE);
		clearButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				equationBuilder = calcMachine.clearInputs();
				UserView.setText(equationBuilder);
				subject.updateEquation(equationBuilder);
				OperatorCounter = 0;
			}
		});
		clearButton.setBounds(172, 130, 75, 25);
		clearButton.setText("C");
		
		
		Button equalButton = new Button(shlSimpleCalculator, SWT.NONE);
		equalButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(calcMachine.getState() == calcMachine.getHasInput())
				{
					equationBuilder = calcMachine.insertOperator(equationBuilder, " = ");
					equationBuilder = calcMachine.calculateInputs(equationBuilder);
					
					OperatorCounter = 0;
					//System.out.println("Previous Equation" + calcMachine.getPreviousState().getEquation());
					//System.out.println("Current Equation" + calcMachine.getState().getEquation());
					if(equationBuilder == null || equationBuilder.length() < 1) {
						String[] dialogButtonLabels = {"Reset", "Discard"};
						MessageDialog messageDialog = new MessageDialog(shlSimpleCalculator, "Error", null, "Either you have tried to divide by zero or you have one operation after the other", 0, dialogButtonLabels, 0);
						int msgBoxReturnCode = messageDialog.open();//reset returncode = 0, discard returncode = 1
						switch(msgBoxReturnCode) {
							case 0://system reset
									equationBuilder = "";
									calcMachine = new CalculatorMachine();
									subject = new ButtonSubject();
									observer = new ButtonObserver(subject);
									break;
							case 1://system discard
									//System.out.println("Previous Equation" + calcMachine.getPreviousState().getEquation());
								
									//System.out.println(equationBuilder.split("/")[0] + "|" + equationBuilder.split("/")[1]);
									//System.out.println("Current Equation" + calcMachine.getState().getEquation());
									calcMachine.getPreviousState().setEquation(calcMachine.getPreviousState().getEquation().split("/")[0] + " / ");
									calcMachine.setState(calcMachine.getPreviousState());
									equationBuilder = calcMachine.getState().getEquation();
									//System.out.println("New Equation " + equationBuilder);
									break;
						}
					}
					UserView.setText(equationBuilder);
					subject.updateEquation(equationBuilder);
				}
				
			}
		});
		equalButton.setBounds(91, 130, 75, 25);
		equalButton.setText("=");
		
		
		Button plusButton = new Button(shlSimpleCalculator, SWT.NONE);
		plusButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(calcMachine.getState() == calcMachine.getHasInput()) {
					equationBuilder = calcMachine.insertOperator(equationBuilder, " + ");
					OperatorCounter++;
					tempCalc();
					UserView.setText(equationBuilder);
					subject.updateEquation(equationBuilder);
				}
			}
		});
		plusButton.setBounds(318, 37, 75, 25);
		plusButton.setText("+");
		
		Button minusButton = new Button(shlSimpleCalculator, SWT.NONE);
		minusButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(calcMachine.getState() == calcMachine.getHasInput()) {
					equationBuilder = calcMachine.insertOperator(equationBuilder, " - ");
					OperatorCounter++;
					tempCalc();
					UserView.setText(equationBuilder);
					subject.updateEquation(equationBuilder);
				}
			}
		});
		minusButton.setBounds(318, 68, 75, 25);
		minusButton.setText("-");
		
		Button timesButton = new Button(shlSimpleCalculator, SWT.NONE);
		timesButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(calcMachine.getState() == calcMachine.getHasInput()) {
					equationBuilder = calcMachine.insertOperator(equationBuilder, " * ");
					OperatorCounter++;
					tempCalc();
					UserView.setText(equationBuilder);
					subject.updateEquation(equationBuilder);
				}
			}
		});
		timesButton.setBounds(318, 99, 75, 25);
		timesButton.setText("*");
		
		Button divideButton = new Button(shlSimpleCalculator, SWT.NONE);
		divideButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
					if(calcMachine.getState() == calcMachine.getHasInput()) {
					equationBuilder = calcMachine.insertOperator(equationBuilder, " / ");
					OperatorCounter++;
					tempCalc();
					UserView.setText(equationBuilder);
					subject.updateEquation(equationBuilder);
				}
			}
		});
		divideButton.setBounds(318, 130, 75, 25);
		divideButton.setText("/");

	}
	
	private void tempCalc() {
		if(this.OperatorCounter == 2) {
			equationBuilder = equationBuilder.trim();
			char c = equationBuilder.charAt(equationBuilder.length()-1);
			//System.out.println(c);
			String tempEquation = equationBuilder.substring(0, equationBuilder.length()-1);
			//System.out.println(tempEquation);
			tempEquation = tempEquation + "=";
			//System.out.println(tempEquation);
			
			
			
			equationBuilder = calcMachine.calculateInputs(tempEquation);
			if(equationBuilder == null || equationBuilder.length() < 1) {
				String[] dialogButtonLabels = {"Reset", "Discard"};
				MessageDialog messageDialog = new MessageDialog(shlSimpleCalculator, "Error", null, "Either you have tried to divide by zero or you have one operation after the other", 0, dialogButtonLabels, 0);
				int msgBoxReturnCode = messageDialog.open();//reset returncode = 0, discard returncode = 1
				switch(msgBoxReturnCode) {
					case 0://system reset
							equationBuilder = "";
							calcMachine = new CalculatorMachine();
							subject = new ButtonSubject();
							observer = new ButtonObserver(subject);
							break;
					case 1://system discard
							//System.out.println("Previous Equation" + calcMachine.getPreviousState().getMachine().getPreviousState().getEquation());
							//System.out.println("Current Equation" + calcMachine.getState().getEquation());
							calcMachine.getPreviousState().setEquation(calcMachine.getPreviousState().getEquation().split("/")[0] + " / ");
							calcMachine.setState(calcMachine.getPreviousState());
							equationBuilder = calcMachine.getState().getEquation();
							//System.out.println("New Equation " + equationBuilder);
							break;
				}
			}
			else
				equationBuilder = calcMachine.insertOperator(equationBuilder, " " + c + " ");
			
			
			//System.out.println(tempEquation);
			//System.out.println(equation);
			this.OperatorCounter = 1;
		}
	}
}
