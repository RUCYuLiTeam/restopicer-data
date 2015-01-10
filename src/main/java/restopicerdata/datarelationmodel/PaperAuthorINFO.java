package restopicerdata.datarelationmodel;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import restopicerdata.datamodelprimarykey.PaperAuthorInfoPK;

@SuppressWarnings("serial")
@Entity
@Table(name="paper_author_info")
@IdClass(PaperAuthorInfoPK.class)
public class PaperAuthorINFO  implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ut",insertable=false,updatable=false)
	private String uniquePaper;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="author_rank",insertable=false,updatable=false)
	private String authorRank;
	@Column(name="author_rank")
	private String rank;
	@Column(name="author_name")
	private String name;
	@Column(name="lastname")
	private String lastName;
	@Column(name="firstname")
	private String firstName;
	@Column(name="email")
	private String email;
	public String getUniquePaper() {
		return uniquePaper;
	}
	public void setUniquePaper(String uniquePaper) {
		this.uniquePaper = uniquePaper;
	}
	public String getAuthorRank() {
		return authorRank;
	}
	public void setAuthorRank(String authorRank) {
		this.authorRank = authorRank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
}
