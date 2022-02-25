package beans;

public class TdWrapper {
	
	private int Id;
	private int AccNo;
	private String AccName;
	private int BankNo;
	private String BankName;
	private int TransNo;
	private int Amount;
	private int R_AccNo;
	private String R_AccName;
	private String Status;
	private int Date;
	 
		public TdWrapper(int Id,int AccNo,String AccName,int BankNo,String BankName,int TransNo,int Amount,int R_AccNo,String R_AccName,String Status,int Date) {
		super();
		this.Id=Id;
		this.AccNo=AccNo;
		this.AccName=AccName;
		this.BankNo=BankNo;
		this.BankName=BankName;
		this.TransNo=TransNo;
		this.Amount=Amount;
		this.R_AccNo=R_AccNo;
		this.R_AccName=R_AccName;
		this.Status=Status;
		this.Date=Date;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getAccNo() {
		return AccNo;
	}

	public void setAccNo(int accNo) {
		AccNo = accNo;
	}

	public String getAccName() {
		return AccName;
	}

	public void setAccName(String accName) {
		AccName = accName;
	}

	public int getBankNo() {
		return BankNo;
	}

	public void setBankNo(int bankNo) {
		BankNo = bankNo;
	}

	public String getBankName() {
		return BankName;
	}

	public void setBankName(String bankName) {
		BankName = bankName;
	}

	public int getTransNo() {
		return TransNo;
	}

	public void setTransNo(int transNo) {
		TransNo = transNo;
	}

	public int getAmount() {
		return Amount;
	}

	public void setAmount(int amount) {
		Amount = amount;
	}

	public int getR_AccNo() {
		return R_AccNo;
	}

	public void setR_AccNo(int r_AccNo) {
		R_AccNo = r_AccNo;
	}

	public String getR_AccName() {
		return R_AccName;
	}

	public void setR_AccName(String r_AccName) {
		R_AccName = r_AccName;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public int getDate() {
		return Date;
	}

	public void setDate(int date) {
		Date = date;
	}
	 
	

}


