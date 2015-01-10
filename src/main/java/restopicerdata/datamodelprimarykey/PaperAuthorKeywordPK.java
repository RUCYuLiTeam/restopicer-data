package restopicerdata.datamodelprimarykey;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PaperAuthorKeywordPK implements Serializable{
	private String uniquePaper;
	private String authorKeyword;
	public PaperAuthorKeywordPK(){}
	public PaperAuthorKeywordPK(String uniquePaper,String authorKeyword){
		this.uniquePaper=uniquePaper;
		this.authorKeyword=authorKeyword;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uniquePaper == null) ? 0 : uniquePaper.hashCode());
		result = prime * result + ((authorKeyword == null) ? 0 : authorKeyword.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final PaperAuthorKeywordPK other = (PaperAuthorKeywordPK) obj;
		if (uniquePaper == null) {
			if (other.uniquePaper != null) return false;
		} else if (!uniquePaper.equals(other.uniquePaper)) return false;
		if (authorKeyword == null) {
			if (other.authorKeyword != null) return false;
		} else if (!authorKeyword.equals(other.authorKeyword)) return false;
		return true;
	}
}
