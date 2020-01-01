package api.practice.server.repositories;

import api.practice.server.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface DeckRepository extends JpaRepository<Question, Long> {
    @Query(value="SELECT deck FROM Question")
    Object[] findDeck();

    @Query("SELECT row FROM Question row WHERE deck = :oneDeck")
    List<Question> findByDeck(String oneDeck);
}