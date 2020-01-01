package api.practice.server.controllers;

import api.practice.server.models.Question;
import api.practice.server.repositories.DeckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DeckController {

    @Autowired
    private DeckRepository deckRepository;

    @GetMapping("/decks")
    public Object[] getDecks() {
        Object[] abc = deckRepository.findByDeck();
        return abc;
    }

}
