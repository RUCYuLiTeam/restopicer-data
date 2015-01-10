package restopicerdata.datarelationmodel;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import restopicerdata.datamodelprimarykey.PaperKeywordPLUSPK;

@SuppressWarnings("serial")
@Entity
@Table(name="paper_keyword_plus")
@IdClass(PaperKeywordPLUSPK.class)
public class PaperKeywordPLUS implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ITEM_UT",insertable=false,updatable=false)
	private String uniquePaper;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="KEYWORD_PLUS",insertable=false,updatable=false)
	private String plusKeyword;
	@Column(name="KEYWORD_PLUS",insertable=false,updatable=false)
	private String keyword;
	public String getUniquePaper() {
		return uniquePaper;
	}
	public void setUniquePaper(String uniquePaper) {
		this.uniquePaper = uniquePaper;
	}
	public String getPlusKeyword() {
		return plusKeyword;
	}
	public void setPlusKeyword(String plusKeyword) {
		this.plusKeyword = plusKeyword;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
}
