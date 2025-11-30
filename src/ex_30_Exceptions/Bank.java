package ex_30_Exceptions;

public class Bank {

	private String currency;
    private Integer amount;
    
    public Bank(String currency, int amount) {
    	this.currency = currency;
    	this.amount = amount;
    }

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
    
    public int bank(Bank bankName) throws CurrencyMisMatchCustomException  {
    	if(bankName.currency.equals("INR")) {
    		return bankName.amount + this.amount;
    	}else {
    		throw new CurrencyMisMatchCustomException("Currency mismatch");
    	}
    }

	public int add(Bank jp_chase) {
		// TODO Auto-generated method stub
		return 0;
	}
    
}

class CurrencyMisMatchCustomException   extends Exception{
	public CurrencyMisMatchCustomException(String msg) {
        super(msg);
    }
}

class NotValidAgeException extends Exception{
	NotValidAgeException(String e){
        super(e);
    }
}