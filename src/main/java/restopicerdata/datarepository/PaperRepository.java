package restopicerdata.datarepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import restopicerdata.dataentitymodel.Paper;

@RepositoryRestResource(collectionResourceRel = "paper", path = "paper")
public interface PaperRepository extends JpaRepository<Paper, String>,JpaSpecificationExecutor<Paper>{
	//search
	//uniqueItem by uniqueIssueId
	List<Paper> findByUniquePaperStartingWith(@Param("issue") String issue);
	
}
