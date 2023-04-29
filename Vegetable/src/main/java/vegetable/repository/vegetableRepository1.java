package vegetable.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import vegetable.model.VegModel1;

public interface vegetableRepository1 extends JpaRepository<VegModel1,Integer> {

	List<VegModel1> findByUsername(String attri);


}
