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
@Table(name="Club")
public class Club implements Serializable{
    
	private static final long serialVersionUID = 1L;
	@Id
    @Column(nullable = false)
    private long id_club;
    private String nom_club ;
    private String Act_club;
    private int nbr_membr ;
    private String lieu_act ;
    
    @ManyToMany
    @JoinTable(
    		name="Apprenant_club",
    		joinColumns= @JoinColumn (name="cin"),
    		inverseJoinColumns= @JoinColumn (name="id_club"))
    	List<Apprenant> ClubsApprenants;
    
	public Club() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Club(long id_club, String nom_club, String act_club, int nbr_membr, String lieu_act,
			List<Apprenant> clubsApprenants) {
		super();
		this.id_club = id_club;
		this.nom_club = nom_club;
		Act_club = act_club;
		this.nbr_membr = nbr_membr;
		this.lieu_act = lieu_act;
		ClubsApprenants = clubsApprenants;
	}



	public long getId_club() {
		return id_club;
	}
	public void setId_club(long id_club) {
		this.id_club = id_club;
	}
	public String getNom_club() {
		return nom_club;
	}
	public void setNom_club(String nom_club) {
		this.nom_club = nom_club;
	}
	public String getAct_club() {
		return Act_club;
	}
	public void setAct_club(String act_club) {
		Act_club = act_club;
	}
	public int getNbr_membr() {
		return nbr_membr;
	}
	public void setNbr_membr(int nbr_membr) {
		this.nbr_membr = nbr_membr;
	}
	public String getLieu_act() {
		return lieu_act;
	}
	public void setLieu_act(String lieu_act) {
		this.lieu_act = lieu_act;
	}
    
    

}
