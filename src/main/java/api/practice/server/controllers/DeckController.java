package api.practice.server.controllers;

import api.practice.server.models.Question;
import api.practice.server.repositories.DeckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import java.util.List;


@RestController
public class DeckController {

    @Autowired
    private DeckRepository deckRepository;

    @GetMapping("/decks")
    public Object[] getDecks() {
        return deckRepository.findDeck();
    }

    @GetMapping("/decks/{oneDeck}")
    public List<Question> findByDeckName(@PathVariable String oneDeck) {
        return deckRepository.findByDeck(oneDeck);
    }


//    public List findWithName(String deckName) {
//        EntityManager em = null;
//        return em.createQuery(
//                "SELECT * FROM Question WHERE deck = :oneDeck")
//                .setParameter("oneDeck", deckName)
//                .getResultList();
//    }

}
