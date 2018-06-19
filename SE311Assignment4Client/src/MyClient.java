import java.io.*;
import java.net.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
public class MyClient {
	
	
	public String run(String aSocketInput)
	{
		String equation = "";
		//System.out.print(isValidInput(aSocketInput));
			try {
				Socket socket = new Socket("127.0.0.1",1000);
				PrintStream out = new PrintStream(socket.getOutputStream());//initializing output stream
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));//initializing input stream
				out.println(aSocketInput.trim());//writing to server	
				equation = in.readLine();//reading from server
				//System.out.println(equation);
				if(equation == null || equation.equalsIgnoreCase("infinity")) equation = "";
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return equation;
	}
	

}
