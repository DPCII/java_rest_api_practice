package api.practice.server.repositories;

import api.practice.server.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface DeckRepository extends JpaRepository<Question, Long> {
    @Query(value="SELECT deck FROM Question")
    Object[] findByDeck();
}