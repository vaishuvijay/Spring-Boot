package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import models.Td;

@Repository
public interface TdRepo extends CrudRepository<Td, Long> {



}
