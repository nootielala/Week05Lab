package week05Package;

import java.util.Scanner;

public class app {

public static void main(String[] args) {
		
		try (Scanner kb = new Scanner(System.in)) {
			System.out.println("Enter a message...");
			String input = kb.nextLine();
			
			AsteriskLogger aLog = new AsteriskLogger();
			AsteriskLogger aErr = new AsteriskLogger();
			
			SpacedLogger sLog = new SpacedLogger();
			SpacedLogger sErr = new SpacedLogger();
			
			
			aLog.setMsg(input);
			aErr.setMsg(input);
			
			sLog.setMsg(input);
			sErr.setMsg(input);
			
			aLog.Log("");
			aErr.Error("");
			
			sLog.Log("");
			sErr.Error("");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
