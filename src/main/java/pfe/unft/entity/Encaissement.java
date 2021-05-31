package pfe.unft.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Entity
@Table(name="Encaissement")
public class Encaissement implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @Column(nullable = false)
    private long num_enc;
    private String num_recu;
    private String montant_enc;
    private String date_enc;
    private String methode_penc;
    
    @ManyToOne
    private Mcredit mcredit;
          

	public Encaissement() {
		super();
		// TODO Auto-generated constructor stub
	}
		public Encaissement(long num_enc, String num_recu, String montant_enc, String date_enc, String methode_penc,
			Mcredit mcredit) {
		super();
		this.num_enc = num_enc;
		this.num_recu = num_recu;
		this.montant_enc = montant_enc;
		this.date_enc = date_enc;
		this.methode_penc = methode_penc;
		this.mcredit = mcredit;
	}
	public long getNum_enc() {
		return num_enc;
	}
	public void setNum_enc(long num_enc) {
		this.num_enc = num_enc;
	}
	public String getNum_recu() {
		return num_recu;
	}
	public void setNum_recu(String num_recu) {
		this.num_recu = num_recu;
	}
	public String getMontant_enc() {
		return montant_enc;
	}
	public void setMontant_enc(String montant_enc) {
		this.montant_enc = montant_enc;
	}
	public String getDate_enc() {
		return date_enc;
	}
	public void setDate_enc(String date_enc) {
		this.date_enc = date_enc;
	}
	public String getMethode_penc() {
		return methode_penc;
	}
	public void setMethode_penc(String methode_penc) {
		this.methode_penc = methode_penc;
	}
    
    

}
