package com.SpringDocker.SpringDocker.Services;

import com.SpringDocker.SpringDocker.DTO.CardDTO;
import com.SpringDocker.SpringDocker.Repository.CardRepository;
import org.springframework.stereotype.Service;

import com.SpringDocker.SpringDocker.Model.Card;
import java.util.ArrayList;
import java.util.List;

@Service
public class CardService {
    private final CardRepository cardRepository;

    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }



    public List<CardDTO> getAllCards(){
        List<Card> cards = cardRepository.findAll();
        ArrayList<CardDTO> cardDTOs = new ArrayList<>();
        for (Card card : cards) {
            CardDTO cardDTO = new CardDTO();
            cardDTO.setName(card.getName());
            cardDTO.setType(card.getType());
            cardDTO.setRarity(card.getRarity());
            cardDTOs.add(cardDTO);
        }
        return cardDTOs;
    }

    public CardDTO getCard(int id) {

        Card card = cardRepository.findAll().get(id);
        CardDTO cardDTO = new CardDTO();

        cardDTO.setName(card.getName());
        cardDTO.setType(card.getType());
        cardDTO.setRarity(card.getRarity());
        cardDTO.setImageUrl(card.getImageUrl());
        return cardDTO;
    }

    public CardDTO uploadCard(CardDTO cardDTO) {

        Card card = new Card();
        card.setName(cardDTO.getName());
        card.setType(cardDTO.getType());
        card.setRarity(cardDTO.getRarity());
        card.setImageUrl(cardDTO.getImageUrl());
        cardRepository.save(card);

        return cardDTO;
    }

    public List<CardDTO> multiUploadCards(List<CardDTO> cardDTOs) {

        for (CardDTO cardDTO : cardDTOs) {
            Card card = new Card();
            card.setName(cardDTO.getName());
            card.setType(cardDTO.getType());
            card.setRarity(cardDTO.getRarity());
            card.setImageUrl(cardDTO.getImageUrl());
            cardRepository.save(card);
        }
     return cardDTOs;
    }
}
