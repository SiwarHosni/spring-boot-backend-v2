package pfe.unft.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@ToString
@EqualsAndHashCode
@Entity
@Table(name="Formation")
public class Formation implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_formation;
    private String nom_formation ;
    private String specialite;
    private String duree_formation;
    private int nbr_apprenant ;
    private String collab ;
    private String Age;
    private String formation_sexe;
    
    @ManyToMany(mappedBy = "ListFormation")
    private List<Cformation> Cformations;
    
    @ManyToMany
    @JoinTable(
    		name="Apprenant_Formation",
    		joinColumns= @JoinColumn (name="cin"),
    		inverseJoinColumns= @JoinColumn (name="id_formation"))
    	List<Apprenant> Apprenants;
    
    
	public Formation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Formation(long id_formation, String nom_formation, String specialite, String duree_formation,
			int nbr_apprenant, String collab, String age, String formation_sexe, List<Cformation> cformations,
			List<Apprenant> apprenants) {
		super();
		this.id_formation = id_formation;
		this.nom_formation = nom_formation;
		this.specialite = specialite;
		this.duree_formation = duree_formation;
		this.nbr_apprenant = nbr_apprenant;
		this.collab = collab;
		Age = age;
		this.formation_sexe = formation_sexe;
		Cformations = cformations;
		Apprenants = apprenants;
	}
	public long getId_formation() {
		return id_formation;
	}
	public void setId_formation(long id_formation) {
		this.id_formation = id_formation;
	}
	public String getNom_formation() {
		return nom_formation;
	}
	public void setNom_formation(String nom_formation) {
		this.nom_formation = nom_formation;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	public String getDuree_formation() {
		return duree_formation;
	}
	public void setDuree_formation(String duree_formation) {
		this.duree_formation = duree_formation;
	}
	public int getNbr_apprenant() {
		return nbr_apprenant;
	}
	public void setNbr_apprenant(int nbr_apprenant) {
		this.nbr_apprenant = nbr_apprenant;
	}
	public String getCollab() {
		return collab;
	}
	public void setCollab(String collab) {
		this.collab = collab;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String getFormation_sexe() {
		return formation_sexe;
	}
	public void setFormation_sexe(String formation_sexe) {
		this.formation_sexe = formation_sexe;
	}
    
    

}
