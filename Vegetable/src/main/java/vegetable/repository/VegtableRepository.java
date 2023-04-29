package vegetable.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vegetable.model.VegetableModel;

@Repository
public interface VegtableRepository extends JpaRepository<VegetableModel,Integer>{


}
