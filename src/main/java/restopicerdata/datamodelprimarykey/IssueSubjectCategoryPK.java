package restopicerdata.datamodelprimarykey;

import java.io.Serializable;

@SuppressWarnings("serial")
public class IssueSubjectCategoryPK implements Serializable{
	private String uniqueIssueId;
	private String categoryCode;
	public IssueSubjectCategoryPK(){}
	public IssueSubjectCategoryPK(String uniqueIssueId,String categoryCode){
		this.uniqueIssueId=uniqueIssueId;
		this.categoryCode=categoryCode;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uniqueIssueId == null) ? 0 : uniqueIssueId.hashCode());
		result = prime * result + ((categoryCode == null) ? 0 : categoryCode.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final IssueSubjectCategoryPK other = (IssueSubjectCategoryPK) obj;
		if (uniqueIssueId == null) {
			if (other.uniqueIssueId != null) return false;
		} else if (!uniqueIssueId.equals(other.uniqueIssueId)) return false;
		if (categoryCode == null) {
			if (other.categoryCode != null) return false;
		} else if (!categoryCode.equals(other.categoryCode)) return false;
		return true;
	}
}