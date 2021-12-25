package com.magsad.electronics.service;

import com.magsad.electronics.entity.Model;
import com.magsad.electronics.repository.ModelRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Data
public class ModelService {
    private final ModelRepository modelRepository;

    public List<Model> findAll(){
        return modelRepository.findAll();
    }

    public Model findById(Long id){
        return modelRepository.findById(id).get();
    }

    public Model save(Model Model){
        return modelRepository.save(Model);
    }

    public void delete(Long id){
        Model modelForDelete = modelRepository.findById(id).get();
        modelRepository.delete(modelForDelete);
    }

    public Model update(Model model){
        Model modelForUpdate = modelRepository.findById(model.getId()).get();

        modelForUpdate.setName(model.getName());
        modelForUpdate.setModelType(model.getModelType());
        modelForUpdate.setBrand(model.getBrand());

        return modelRepository.save(modelForUpdate);
    }
}
