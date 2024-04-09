package bankAccount;

import java.math.BigDecimal;

public class BankAccountUpdateDto {
	
	private BigDecimal rsd;
	private BigDecimal usd;
	private BigDecimal eur;
	private BigDecimal gbp;
	private BigDecimal chf;
	
	public BankAccountUpdateDto() {
		
	}

	public BankAccountUpdateDto(BigDecimal rsd, BigDecimal usd, BigDecimal eur, BigDecimal gbp, BigDecimal chf) {
		this.rsd = rsd;
		this.usd = usd;
		this.eur = eur;
		this.gbp = gbp;
		this.chf = chf;
	}

	public BigDecimal getEur() {
		return eur;
	}

	public void setEur(BigDecimal eur) {
		this.eur = eur;
	}

	public BigDecimal getRsd() {
		return rsd;
	}

	public void setRsd(BigDecimal rsd) {
		this.rsd = rsd;
	}

	public BigDecimal getUsd() {
		return usd;
	}

	public void setUsd(BigDecimal usd) {
		this.usd = usd;
	}

	public BigDecimal getGbp() {
		return gbp;
	}

	public void setGbp(BigDecimal gbp) {
		this.gbp = gbp;
	}

	public BigDecimal getChf() {
		return chf;
	}

	public void setChf(BigDecimal chf) {
		this.chf = chf;
	}
	
}