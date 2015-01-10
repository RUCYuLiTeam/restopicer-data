package restopicerdata.dataentitymodel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import restopicerdata.datarelationmodel.IssueSubjectCategory;
import restopicerdata.datarelationmodel.IssueTitle;

@SuppressWarnings("serial")
@Entity
@Table(name="issue")
public class Issue implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ui")
	private String uniqueIssueId;
	@Column(name="publication_type")
	private String type;
	@Column(name="volume")
	private String volume;
	@Column(name="issue")
	private String issue;
	@Column(name="publication_year")
	private int year;
	@Column(name="publication_date")
	private String month;
	@OneToOne(cascade= CascadeType.ALL,optional=false,fetch=FetchType.EAGER,targetEntity=IssueTitle.class)
	@PrimaryKeyJoinColumn
	private IssueTitle issueTitle;
	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER,targetEntity=IssueSubjectCategory.class)
	@JoinColumn(name = "issue_id",unique=true,nullable=false,updatable=false)
	private Collection<IssueSubjectCategory> issueSubjectCategories = new ArrayList<IssueSubjectCategory>();
	
	public String getUniqueIssueId() {
		return uniqueIssueId;
	}
	public void setUniqueIssueId(String uniqueIssueId) {
		this.uniqueIssueId = uniqueIssueId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public IssueTitle getIssueTitle() {
		return issueTitle;
	}
	public void setIssueTitle(IssueTitle issueTitle) {
		this.issueTitle = issueTitle;
	}
	public Collection<IssueSubjectCategory> getIssueSubjectCategories() {
		return issueSubjectCategories;
	}
	public void setIssueSubjectCategories(
			Collection<IssueSubjectCategory> issueSubjectCategories) {
		this.issueSubjectCategories = issueSubjectCategories;
	}
	
}