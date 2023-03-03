package com.example.services;

import com.example.entities.Beer;

import java.util.List;
import java.util.Optional;

public class BeerServiceImpl implements BeerService {
    @Override
    public List<Beer> findAll() {
        return null;
    }

    @Override
    public Optional<Beer> findById(Long id) {
        return Optional.empty();
    }
}
