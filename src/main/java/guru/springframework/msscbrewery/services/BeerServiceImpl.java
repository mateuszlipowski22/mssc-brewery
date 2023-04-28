package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService{
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .BeerName("Galaxy cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveNewDto(BeerDto beerDto) {
        return BeerDto
                .builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        log.debug("Updating a beer");
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleteing a beer");
    }
}
