package restopicerdata.datarelationmodel;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import restopicerdata.datamodelprimarykey.IssueSubjectCategoryPK;

@SuppressWarnings("serial")
@Entity
@Table(name="issue_subject_category")
@IdClass(IssueSubjectCategoryPK.class)
public class IssueSubjectCategory implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="issue_id",insertable=false,updatable=false)
	private String uniqueIssueId;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="sc_code")
	private String categoryCode;
	@Column(name="subject_category")
	private String subjectCategory;
	@Column(name="product_code")
	private String productCode;
	public String getUniqueIssueId() {
		return uniqueIssueId;
	}
	public void setUniqueIssueId(String uniqueIssueId) {
		this.uniqueIssueId = uniqueIssueId;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getSubjectCategory() {
		return subjectCategory;
	}
	public void setSubjectCategory(String subjectCategory) {
		this.subjectCategory = subjectCategory;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
}