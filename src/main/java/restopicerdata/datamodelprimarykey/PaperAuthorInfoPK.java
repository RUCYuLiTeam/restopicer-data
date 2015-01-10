package restopicerdata.datamodelprimarykey;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PaperAuthorInfoPK implements Serializable{
	private String uniquePaper;
	private String authorRank;
	public PaperAuthorInfoPK(){}
	public PaperAuthorInfoPK(String uniquePaper,String authorRank){
		this.uniquePaper=uniquePaper;
		this.authorRank=authorRank;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uniquePaper == null) ? 0 : uniquePaper.hashCode());
		result = prime * result + ((authorRank == null) ? 0 : authorRank.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final PaperAuthorInfoPK other = (PaperAuthorInfoPK) obj;
		if (uniquePaper == null) {
			if (other.uniquePaper != null) return false;
		} else if (!uniquePaper.equals(other.uniquePaper)) return false;
		if (authorRank == null) {
			if (other.authorRank != null) return false;
		} else if (!authorRank.equals(other.authorRank)) return false;
		return true;
	}
}
