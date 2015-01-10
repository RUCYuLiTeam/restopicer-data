package restopicerdata.datarelationmodel;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@SuppressWarnings("serial")
@Entity
@Table(name="paper_text")
public class PaperTEXT implements Serializable{
	@Column(name="paper_id")
	private long id;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="item_ut")
	private String uniquePaper;
	@Column(name="article_title")
	private String title;
	@Column(name="document_type")
	private String type;
	@Column(name="meeting_abstract_number")
	private String meetAbsNo;
	@Column(name="abstract")
	private String docAbstract;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMeetAbsNo() {
		return meetAbsNo;
	}
	public void setMeetAbsNo(String meetAbsNo) {
		this.meetAbsNo = meetAbsNo;
	}
	public String getDocAbstract() {
		return docAbstract;
	}
	public void setDocAbstract(String docAbstract) {
		this.docAbstract = docAbstract;
	}
	
}
