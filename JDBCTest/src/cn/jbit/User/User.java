package cn.jbit.User;

public class User {
	
	public Long id;
	
	public String RealName;
	
	public String  idCard;
	
	public String Phone;
	
	public String Password;
	
	public String TransactionPassword;
	
	public String Email;
	
	public String RiskEvaluation;

	public User() {
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getTransactionPassword() {
		return TransactionPassword;
	}

	public void setTransactionPassword(String transactionPassword) {
		TransactionPassword = transactionPassword;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getRiskEvaluation() {
		return RiskEvaluation;
	}

	public void setRiskEvaluation(String riskEvaluation) {
		RiskEvaluation = riskEvaluation;
	}


	public String getRealName() {
		return RealName;
	}


	public void setRealName(String realName) {
		RealName = realName;
	}


	public String getIdCard() {
		return idCard;
	}


	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	
	
	

	
}
