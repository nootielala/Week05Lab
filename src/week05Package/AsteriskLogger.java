package week05Package;

public class AsteriskLogger implements Logger{
	
	private String ask = "";
	private String bigAsk = "";
	private String msg = "";
	private String err = "";
	
	public AsteriskLogger() {
		ask = getAsk();
		bigAsk = getBigAsk();
		msg = getMsg();
		err = getError();
	}
	
	public AsteriskLogger(String msg) {
		this.msg = msg;
	}   
	                       
	public String getBigAsk() {
		bigAsk = "*****************";
		return bigAsk;
	}


	public void setBigAsk(String bigAsk) {
		this.bigAsk = bigAsk;
	}


	public String getError() {
		err = "ERROR:";
		return err;
	}


	public void setError(String err) {
		this.err = err;
	}


	public String getAsk() {
		ask = "***";
		return ask;
	}


	public void setAsk(String ask) {
		this.ask = ask;
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	@Override
	public void Log(String msg) {
		
		
		msg = getAsk() + getMsg() + getAsk();
		System.out.println(msg);
	}


	@Override
	public void Error(String err) {
		
		
		err = getBigAsk() + "\n" + getAsk() + getError() + getMsg() + getAsk() + "\n" + getBigAsk();
		System.out.println(err);
		
	}

	
	

}