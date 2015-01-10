package restopicerdata.datarepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import restopicerdata.dataentitymodel.Issue;

@RepositoryRestResource(collectionResourceRel = "issue", path = "issue")
public interface IssueRepository extends JpaRepository<Issue, String>{
	//search
	//type
	List<Issue> findByType(@Param("type") String type);
	//year
	List<Issue> findByYear(@Param("year") int year);
	List<Issue> findByYearBetween(@Param("from") int from,@Param("to") int to);
	List<Issue> findByYearAfter(@Param("year") int year);
	List<Issue> findByYearBefore(@Param("year") int year);
	//month
	List<Issue> findByMonth(@Param("month") String month);
	//IssueTitle
	@Query("select i from Issue i where issueTitle.issueTitle = :title")
	List<Issue> findByTitle(@Param("title") String title);
	//IssueSubjectCategory
	@Query("select i from Issue i inner join i.issueSubjectCategories c where c.subjectCategory = :subjectcategory")
	List<Issue> findBySubjectCategory(@Param("subjectcategory") String subjectcategory);
	//Using All to Retrieve
	
}
