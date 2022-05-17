package ai.jobiak.mvc;

public class Jdbc {
	
	private int custid;
	private String title;
	private double balance;
	
    public Jdbc() {
    }

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Jdbc(int custid, String title, double balance) {
		super();
		this.custid = custid;
		this.title = title;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Jdbc [custid=" + custid + ", title=" + title + ", balance=" + balance + "]";
	}

    
}