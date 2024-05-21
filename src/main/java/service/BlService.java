package service;

import model.BlModel;

import java.util.List;

public interface BlService {

    BlModel findById(Long id);

    List<BlModel> listAll();
}
