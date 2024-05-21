package service.impl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import model.BlModel;
import repository.BlRepository;
import service.BlService;

import java.util.List;


@ApplicationScoped
public class BlServiceImpl implements BlService {


    @Inject
    private BlRepository blRepository;

    @Override
    public BlModel findById(Long id) {
        return blRepository.findById(id);
    }

    @Override
    public List<BlModel> listAll() {
        return List.copyOf(blRepository.listAll());
    }


}
