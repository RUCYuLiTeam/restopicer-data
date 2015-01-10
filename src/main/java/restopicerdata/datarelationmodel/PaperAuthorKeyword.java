package restopicerdata.datarelationmodel;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import restopicerdata.datamodelprimarykey.PaperAuthorKeywordPK;
@SuppressWarnings("serial")
@Entity
@Table(name="paper_author_keyword")
@IdClass(PaperAuthorKeywordPK.class)
public class PaperAuthorKeyword implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ITEM_UT",insertable=false,updatable=false)
	private String uniquePaper;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="AUTHOR_KEYWORD",insertable=false,updatable=false)
	private String authorKeyword;
	@Column(name="AUTHOR_KEYWORD",insertable=false,updatable=false)
	private String keyword;
	public String getUniquePaper() {
		return uniquePaper;
	}
	public void setUniquePaper(String uniquePaper) {
		this.uniquePaper = uniquePaper;
	}
	public String getAuthorKeyword() {
		return authorKeyword;
	}
	public void setAuthorKeyword(String authorKeyword) {
		this.authorKeyword = authorKeyword;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
}
