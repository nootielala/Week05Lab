package week05Package;

public class SpacedLogger implements Logger {

	
		
		private String msg = "";
		private String err = "";
		
		public SpacedLogger() {
			msg = getMsg();
			err = getError();
		}
		
		public SpacedLogger(String msg) {
			this.msg = msg;
		}                  


		public String getError() {
			err = "ERROR:";
			return err;
		}


		public void setError(String err) {
			this.err = err;
		}


		public String getMsg() {
			return msg;
		}


		public void setMsg(String msg) {
			this.msg = msg;
		}


		@Override
		public void Log(String msg) {
			
			msg = getMsg() ;
			char array[] = msg.toCharArray();
			
			for (char letter : array) {
				System.out.print(letter + " ");
			}

		}


		@Override
		public void Error(String err) {
			
			err = getError();
			System.out.print("\n" + err + " ");
			char array[] = msg.toCharArray();
			
			for (char letter : array) {
				System.out.print(letter + " ");
			}

			
		}

	}


