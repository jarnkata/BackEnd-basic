package fi.company;

import org.springframework.data.repository.CrudRepository;

public interface BloggerRepository extends CrudRepository<Blogger, Long> {
}
