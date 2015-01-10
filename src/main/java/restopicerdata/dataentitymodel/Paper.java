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

import restopicerdata.datarelationmodel.PaperTEXT;
import restopicerdata.datarelationmodel.PaperAuthorINFO;
import restopicerdata.datarelationmodel.PaperAuthorKeyword;
import restopicerdata.datarelationmodel.PaperKeywordPLUS;

@SuppressWarnings("serial")
@Entity
@Table(name="paper")
public class Paper implements Serializable{
	@Column(name="paper_id")
	private long id;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="item_ut",insertable=false,updatable=false)
	private String uniquePaper;
	@Column(name="item_t9")
	private long uniquePaperForCiting;
	@Column(name="beginning_page")
	private int beginningPage;
	@Column(name="ending_page")
	private int endingPage;
	@Column(name="page_count")
	private int pageCount;
	@Column(name="cited_ref_count")
	private int citedRefCount;
	@OneToOne(cascade= CascadeType.ALL,optional=false,fetch=FetchType.EAGER,targetEntity=PaperTEXT.class)
	@PrimaryKeyJoinColumn
	private PaperTEXT text;
	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER,targetEntity=PaperAuthorINFO.class)
	@JoinColumn(name = "ut",unique=true,insertable=false,updatable=false)
	private Collection<PaperAuthorINFO> authors = new ArrayList<PaperAuthorINFO>();
	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER,targetEntity=PaperAuthorKeyword.class)
	@JoinColumn(name = "ITEM_UT",unique=true,insertable=false,updatable=false)
	private Collection<PaperAuthorKeyword> authorKeywords = new ArrayList<PaperAuthorKeyword>();
	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER,targetEntity=PaperKeywordPLUS.class)
	@JoinColumn(name = "ITEM_UT",unique=true,insertable=false,updatable=false)
	private Collection<PaperKeywordPLUS> plusKeywords = new ArrayList<PaperKeywordPLUS>();
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUniquePaper() {
		return uniquePaper;
	}
	public void setUniquePaper(String uniquePaper) {
		this.uniquePaper = uniquePaper;
	}
	public long getUniquePaperForCiting() {
		return uniquePaperForCiting;
	}
	public void setUniquePaperForCiting(long uniquePaperForCiting) {
		this.uniquePaperForCiting = uniquePaperForCiting;
	}
	public int getBeginningPage() {
		return beginningPage;
	}
	public void setBeginningPage(int beginningPage) {
		this.beginningPage = beginningPage;
	}
	public int getEndingPage() {
		return endingPage;
	}
	public void setEndingPage(int endingPage) {
		this.endingPage = endingPage;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getCitedRefCount() {
		return citedRefCount;
	}
	public void setCitedRefCount(int citedRefCount) {
		this.citedRefCount = citedRefCount;
	}
	public PaperTEXT getText() {
		return text;
	}
	public void setText(PaperTEXT text) {
		this.text = text;
	}
	public Collection<PaperAuthorINFO> getAuthors() {
		return authors;
	}
	public void setAuthors(Collection<PaperAuthorINFO> authors) {
		this.authors = authors;
	}
	public Collection<PaperAuthorKeyword> getAuthorKeywords() {
		return authorKeywords;
	}
	public void setAuthorKeywords(Collection<PaperAuthorKeyword> authorKeywords) {
		this.authorKeywords = authorKeywords;
	}
	public Collection<PaperKeywordPLUS> getPlusKeywords() {
		return plusKeywords;
	}
	public void setPlusKeywords(Collection<PaperKeywordPLUS> plusKeywords) {
		this.plusKeywords = plusKeywords;
	}
	
}