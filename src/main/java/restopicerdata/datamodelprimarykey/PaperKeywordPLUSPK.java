package restopicerdata.datamodelprimarykey;

import java.io.Serializable;

public class PaperKeywordPLUSPK implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String uniquePaper;
	private String plusKeyword;
	public PaperKeywordPLUSPK(){}
	public PaperKeywordPLUSPK(String uniquePaper,String plusKeyword){
		this.uniquePaper=uniquePaper;
		this.plusKeyword=plusKeyword;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uniquePaper == null) ? 0 : uniquePaper.hashCode());
		result = prime * result + ((plusKeyword == null) ? 0 : plusKeyword.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final PaperKeywordPLUSPK other = (PaperKeywordPLUSPK) obj;
		if (uniquePaper == null) {
			if (other.uniquePaper != null) return false;
		} else if (!uniquePaper.equals(other.uniquePaper)) return false;
		if (plusKeyword == null) {
			if (other.plusKeyword != null) return false;
		} else if (!plusKeyword.equals(other.plusKeyword)) return false;
		return true;
	}
}
