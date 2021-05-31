package pfe.unft.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name="Centre_formation")
public class Cformation implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @Column(nullable = false)
    private long id_cf;
    private String nom_cf ;
    private String gouv_cf;
    private int nbrappr_cf ;
    private String metier ;
    
    @ManyToMany
    @JoinTable(
    		name="Apprenant_cf",
    		joinColumns= @JoinColumn (name="cin"),
    		inverseJoinColumns= @JoinColumn (name="id_cf"))
    	List<Apprenant> ListApprenant;
   
    @ManyToMany
    @JoinTable(
    		name="Formation_cf",
    		joinColumns= @JoinColumn (name="id_formation"),
    		inverseJoinColumns= @JoinColumn (name="id_cf"))
    	List<Formation> ListFormation;
    
    
	
	public Cformation( String nom_cf, String gouv_cf, int nbrappr_cf, String metier) {
		super();
	
		this.nom_cf = nom_cf;
		this.gouv_cf = gouv_cf;
		this.nbrappr_cf = nbrappr_cf;
		this.metier = metier;
	}
	
	
	public Cformation() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getId_cf() {
		return id_cf;
	}
	public void setId_cf(long id_cf) {
		this.id_cf = id_cf;
	}
	public String getNom_cf() {
		return nom_cf;
	}
	public void setNom_cf(String nom_cf) {
		this.nom_cf = nom_cf;
	}
	public String getGouv_cf() {
		return gouv_cf;
	}
	public void setGouv_cf(String gouv_cf) {
		this.gouv_cf = gouv_cf;
	}
	public int getNbrappr_cf() {
		return nbrappr_cf;
	}
	public void setNbrappr_cf(int nbrappr_cf) {
		this.nbrappr_cf = nbrappr_cf;
	}
	public String getMetier() {
		return metier;
	}
	public void setMetier(String metier) {
		this.metier = metier;
	}
    
    
	

}
