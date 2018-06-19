
public class ButtonObserver implements Observer{
	private String equation = "";
	private static int observerIDTracker = 0;
	private int observerID = 0;
	private Subject button;
	
	public ButtonObserver(Subject button)
	{
		this.button = button;
		this.observerID = ++observerIDTracker;
		button.register(this);
	}
	
	@Override
	public void update(Object o) {
		// TODO Auto-generated method stub
		this.equation = (String) o;
		
	}

}
