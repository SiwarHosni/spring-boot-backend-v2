package pfe.unft.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



import lombok.EqualsAndHashCode;
import lombok.ToString;


@ToString
@EqualsAndHashCode
@Entity
@Table(name="Beneficiaire")
public class Beneficiaire implements Serializable {
	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		@Id
	    @Column(nullable = false)
	    private long cin;
		private String Lieu_cin;
		private Date date_emission;
	    private String nomb ;
	    private String prenomb;
	    private Date date_naissance ;
	    private String adresse ;
	    private String Gouv_b;
	    private String delegation;
	    private String sexe ;
	    private String etat_civile ;
	    private String tel ;
	    private String niveau_ed;
	    private String profession;
	    private String duree_experience;
	    private String logement;
	    private String src_rev_b;
	    private String MM_rev_b;
	    private String src_rev_fam_b;
	    private String MM_rev_fam_b;
	    private String nom_banque;
	    private long rib ;
	    
	    @OneToOne(cascade = CascadeType.ALL)
		private Projet Projet;
	    
	    @OneToMany(mappedBy="beneficiaire", cascade=CascadeType.ALL)
		private List<Mcredit> mcredits;


	public Beneficiaire(String gouv_b, String delegation) {
		Gouv_b = gouv_b;
		this.delegation = delegation;
	}

	public Beneficiaire(String lieu_cin, Date date_emission) {
		Lieu_cin = lieu_cin;
		this.date_emission = date_emission;
	}

	public Beneficiaire(long cin, String nomb, String prenomb, Date date_naissance, String adresse, String sexe, String etat_civile, String tel, String niveau_ed, String profession, String duree_experience, String logement, String src_rev_b, String MM_rev_b, String src_rev_fam_b, String MM_rev_fam_b, String nom_banque, long rib, pfe.unft.entity.Projet projet, List<Mcredit> mcredits) {
		this.cin = cin;
		this.nomb = nomb;
		this.prenomb = prenomb;
		this.date_naissance = date_naissance;
		this.adresse = adresse;
		this.sexe = sexe;
		this.etat_civile = etat_civile;
		this.tel = tel;
		this.niveau_ed = niveau_ed;
		this.profession = profession;
		this.duree_experience = duree_experience;
		this.logement = logement;
		this.src_rev_b = src_rev_b;
		this.MM_rev_b = MM_rev_b;
		this.src_rev_fam_b = src_rev_fam_b;
		this.MM_rev_fam_b = MM_rev_fam_b;
		this.nom_banque = nom_banque;
		this.rib = rib;
		Projet = projet;
		this.mcredits = mcredits;
	}

	public Beneficiaire() {
			super();
			// TODO Auto-generated constructor stub
		}


	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public long getCin() {
		return cin;
	}

	public void setCin(long cin) {
		this.cin = cin;
	}

	public String getNomb() {
		return nomb;
	}

	public void setNomb(String nomb) {
		this.nomb = nomb;
	}

	public String getPrenomb() {
		return prenomb;
	}

	public void setPrenomb(String prenomb) {
		this.prenomb = prenomb;
	}

	public Date getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getEtat_civile() {
		return etat_civile;
	}

	public void setEtat_civile(String etat_civile) {
		this.etat_civile = etat_civile;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getNiveau_ed() {
		return niveau_ed;
	}

	public void setNiveau_ed(String niveau_ed) {
		this.niveau_ed = niveau_ed;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getDuree_experience() {
		return duree_experience;
	}

	public void setDuree_experience(String duree_experience) {
		this.duree_experience = duree_experience;
	}

	public String getLogement() {
		return logement;
	}

	public void setLogement(String logement) {
		this.logement = logement;
	}

	public String getSrc_rev_b() {
		return src_rev_b;
	}

	public void setSrc_rev_b(String src_rev_b) {
		this.src_rev_b = src_rev_b;
	}

	public String getMM_rev_b() {
		return MM_rev_b;
	}

	public void setMM_rev_b(String MM_rev_b) {
		this.MM_rev_b = MM_rev_b;
	}

	public String getSrc_rev_fam_b() {
		return src_rev_fam_b;
	}

	public void setSrc_rev_fam_b(String src_rev_fam_b) {
		this.src_rev_fam_b = src_rev_fam_b;
	}

	public String getMM_rev_fam_b() {
		return MM_rev_fam_b;
	}

	public void setMM_rev_fam_b(String MM_rev_fam_b) {
		this.MM_rev_fam_b = MM_rev_fam_b;
	}

	public String getNom_banque() {
		return nom_banque;
	}

	public void setNom_banque(String nom_banque) {
		this.nom_banque = nom_banque;
	}

	public long getRib() {
		return rib;
	}

	public void setRib(long rib) {
		this.rib = rib;
	}

	public pfe.unft.entity.Projet getProjet() {
		return Projet;
	}

	public void setProjet(pfe.unft.entity.Projet projet) {
		Projet = projet;
	}

	public List<Mcredit> getMcredits() {
		return mcredits;
	}

	public void setMcredits(List<Mcredit> mcredits) {
		this.mcredits = mcredits;
	}

	public String getGouv_b() {
		return Gouv_b;
	}

	public void setGouv_b(String gouv_b) {
		Gouv_b = gouv_b;
	}

	public String getDelegation() {
		return delegation;
	}

	public void setDelegation(String delegation) {
		this.delegation = delegation;
	}

	public String getLieu_cin() {
		return Lieu_cin;
	}

	public void setLieu_cin(String lieu_cin) {
		Lieu_cin = lieu_cin;
	}

	public Date getDate_emission() {
		return date_emission;
	}

	public void setDate_emission(Date date_emission) {
		this.date_emission = date_emission;
	}
}
