package pfe.unft.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Entity
@Table(name="Apprenant")
public class Apprenant implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @Column
    private long cin;
    private String nomappr ;
    private String prenomappr;
    private Date date_naissappr ;
    private String sexe ;
    private String tel ;
    
    @ManyToMany(mappedBy = "Apprenants")
    private List<Formation> formations;
    
    @ManyToMany(mappedBy = "ListApprenant")
    private List<Cformation> ListCformation;
    		
    
    @ManyToMany(mappedBy = "ClubsApprenants")
    private List<Club> ListClub;
   
    
    
	public long getCin() {
		return cin;
	}
	public void setCin(long cin) {
		this.cin = cin;
	}
	public String getNomappr() {
		return nomappr;
	}
	public void setNomappr(String nomappr) {
		this.nomappr = nomappr;
	}
	public String getPrenomappr() {
		return prenomappr;
	}
	public void setPrenomappr(String prenomappr) {
		this.prenomappr = prenomappr;
	}
	public Date getDate_naissappr() {
		return date_naissappr;
	}
	public void setDate_naissappr(Date date_naissappr) {
		this.date_naissappr = date_naissappr;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Apprenant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Apprenant(long cin, String nomappr, String prenomappr, Date date_naissappr, String sexe, String tel,
			List<Formation> formations, List<Cformation> listCformation, List<Club> listClub) {
		super();
		this.cin = cin;
		this.nomappr = nomappr;
		this.prenomappr = prenomappr;
		this.date_naissappr = date_naissappr;
		this.sexe = sexe;
		this.tel = tel;
		this.formations = formations;
		ListCformation = listCformation;
		ListClub = listClub;
	}
	
	
	
    
    


}
