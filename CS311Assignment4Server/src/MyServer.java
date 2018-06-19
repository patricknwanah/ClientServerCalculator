import java.io.*;
import java.net.*;

public class MyServer {
	
	public void run() throws IOException {
		ServerSocket server = new ServerSocket(1000);//instantiated server
		while(true)//infinite loop
		{
			String answer;
			String equation;
			OperatorComposite root;
			FormEquationVisitor form = new FormEquationVisitor();
			CalculateEquationVisitor calc = new CalculateEquationVisitor();
			
			
			Socket client = server.accept();//waiting for connection
			
			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));//get client input
			equation = br.readLine();//store in variable
			root = new OperatorComposite(equation);
			root.accept(form);//create equation
			answer = (String) root.accept(calc);//do calculation
			
			PrintStream ps = new PrintStream(client.getOutputStream());
			ps.print(answer);//return answer to server
			client.close();//close connection
		}
	}

}
