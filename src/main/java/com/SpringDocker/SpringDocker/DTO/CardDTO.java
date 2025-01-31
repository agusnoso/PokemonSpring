package com.SpringDocker.SpringDocker.DTO;

import com.SpringDocker.SpringDocker.Rarity;
import lombok.Data;

@Data
public class CardDTO {
    private String name;
    private String type;
    private Rarity rarity;
    private String imageUrl;
}
