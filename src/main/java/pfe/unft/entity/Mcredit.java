package pfe.unft.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Entity
@Table(name="MicroCredit")
public class Mcredit implements Serializable {
	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		@Id
	    @Column(nullable = false)
	    private long num_dossier;
	    private String montant_cr ;
	    private String duree_cr;
	    private String duree_ech;
	    private String source_fin;
	    private String montant_tr;
	    private Date date_decaissement;
	    private int interest ;
	    private String methode_paiement ;
	    
	    @ManyToOne
	    private Beneficiaire beneficiaire;
	    
	    @OneToMany(mappedBy = "mcredit", cascade = CascadeType.ALL )
	    private List<Encaissement> ListEncaissement;
	    
	    @OneToOne(cascade= CascadeType.ALL)
	    private Projet projet;
	    
	          
	   	public Mcredit() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Mcredit(long num_dossier, String montant_cr, String duree_cr, String duree_ech, String source_fin,
				String montant_tr, Date date_decaissement, int interest, String methode_paiement,
				Beneficiaire beneficiaire, List<Encaissement> listEncaissement, Projet projet) {
			super();
			this.num_dossier = num_dossier;
			this.montant_cr = montant_cr;
			this.duree_cr = duree_cr;
			this.duree_ech = duree_ech;
			this.source_fin = source_fin;
			this.montant_tr = montant_tr;
			this.date_decaissement = date_decaissement;
			this.interest = interest;
			this.methode_paiement = methode_paiement;
			this.beneficiaire = beneficiaire;
			ListEncaissement = listEncaissement;
			this.projet = projet;
		}
		public long getNum_dossier() {
			return num_dossier;
		}
		public void setNum_dossier(long num_dossier) {
			this.num_dossier = num_dossier;
		}
		public String getMontant_cr() {
			return montant_cr;
		}
		public void setMontant_cr(String montant_cr) {
			this.montant_cr = montant_cr;
		}
		public String getDuree_cr() {
			return duree_cr;
		}
		public void setDuree_cr(String duree_cr) {
			this.duree_cr = duree_cr;
		}
		public String getDuree_ech() {
			return duree_ech;
		}
		public void setDuree_ech(String duree_ech) {
			this.duree_ech = duree_ech;
		}
		public String getSource_fin() {
			return source_fin;
		}
		public void setSource_fin(String source_fin) {
			this.source_fin = source_fin;
		}
		public String getMontant_tr() {
			return montant_tr;
		}
		public void setMontant_tr(String montant_tr) {
			this.montant_tr = montant_tr;
		}
		public Date getDate_decaissement() {
			return date_decaissement;
		}
		public void setDate_decaissement(Date date_decaissement) {
			this.date_decaissement = date_decaissement;
		}
		public int getInterest() {
			return interest;
		}
		public void setInterest(int interest) {
			this.interest = interest;
		}
		public String getMethode_paiement() {
			return methode_paiement;
		}
		public void setMethode_paiement(String methode_paiement) {
			this.methode_paiement = methode_paiement;
		}

	    
}
