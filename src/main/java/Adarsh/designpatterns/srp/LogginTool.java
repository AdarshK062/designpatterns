package Adarsh.designpatterns.srp;


public class LogginTool {
	private String message;
	LogginTool(String message)
	{
		this.message = message;
		System.out.println(message);
	}
}