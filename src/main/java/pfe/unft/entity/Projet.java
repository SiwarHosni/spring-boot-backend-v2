package pfe.unft.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.ToString;


@ToString
@EqualsAndHashCode
@Entity
@Table(name="Projet")
public class Projet implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @Column(nullable = false)
    private long Id_projet;
    private String type_projet ;
    private String sect_act;
    private String type_act;
    private String adresse_projet;
    private String type_fin;
    private long montant_dm;
    private long montanttr;
    private String duree_paiement;
    private Date date_dm;
    
    
    @OneToOne
    private Mcredit Mcredit;
    
    @OneToOne
    private Beneficiaire Benefciaire;
    
		
	public Projet(long id_projet, String type_projet, String sect_act, String type_act, String adresse_projet,
			String type_fin, long montant_dm, long montanttr, String duree_paiement, Date date_dm,
			pfe.unft.entity.Mcredit mcredit, Beneficiaire benefciaire) {
		super();
		Id_projet = id_projet;
		this.type_projet = type_projet;
		this.sect_act = sect_act;
		this.type_act = type_act;
		this.adresse_projet = adresse_projet;
		this.type_fin = type_fin;
		this.montant_dm = montant_dm;
		this.montanttr = montanttr;
		this.duree_paiement = duree_paiement;
		this.date_dm = date_dm;
		Mcredit = mcredit;
		Benefciaire = benefciaire;
	}
	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId_projet() {
		return Id_projet;
	}
	public void setId_projet(long id_projet) {
		Id_projet = id_projet;
	}
	public String getType_projet() {
		return type_projet;
	}
	public void setType_projet(String type_projet) {
		this.type_projet = type_projet;
	}
	public String getSect_act() {
		return sect_act;
	}
	public void setSect_act(String sect_act) {
		this.sect_act = sect_act;
	}
	public String getType_act() {
		return type_act;
	}
	public void setType_act(String type_act) {
		this.type_act = type_act;
	}
	public String getAdresse_projet() {
		return adresse_projet;
	}
	public void setAdresse_projet(String adresse_projet) {
		this.adresse_projet = adresse_projet;
	}
	public String getType_fin() {
		return type_fin;
	}
	public void setType_fin(String type_fin) {
		this.type_fin = type_fin;
	}
	public long getMontant_dm() {
		return montant_dm;
	}
	public void setMontant_dm(long montant_dm) {
		this.montant_dm = montant_dm;
	}
	public long getMontanttr() {
		return montanttr;
	}
	public void setMontanttr(long montanttr) {
		this.montanttr = montanttr;
	}
	public String getDuree_paiement() {
		return duree_paiement;
	}
	public void setDuree_paiement(String duree_paiement) {
		this.duree_paiement = duree_paiement;
	}
	public Date getDate_dm() {
		return date_dm;
	}
	public void setDate_dm(Date date_dm) {
		this.date_dm = date_dm;
	}
    
    
    
	

}
