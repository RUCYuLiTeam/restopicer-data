package restopicerdata.datarelationmodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="issue_title")
public class IssueTitle {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ui")
	private String uniqueIssueId;
	@Column(name="full_source_title")
	private String issueTitle;
	
	public String getUniqueIssueId() {
		return uniqueIssueId;
	}
	public void setUniqueIssueId(String uniqueIssueId) {
		this.uniqueIssueId = uniqueIssueId;
	}
	public String getIssueTitle() {
		return issueTitle;
	}
	public void setIssueTitle(String issueTitle) {
		this.issueTitle = issueTitle;
	}
}
