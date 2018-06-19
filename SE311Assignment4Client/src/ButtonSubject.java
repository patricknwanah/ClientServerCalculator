import java.util.ArrayList;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ButtonSubject implements Subject{
	
	private ArrayList<Observer> observers;
	private String equation="";
	public ButtonSubject()
	{
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void unregister(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(observers.indexOf(o));
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Observer observer: observers)
		{
			observer.update(equation);
		}
	}
	
	public void updateEquation(String equation)
	{
		this.equation = equation;
		notifyObserver();
	}
	
	

}
