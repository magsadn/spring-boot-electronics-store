package com.magsad.electronics.service;

import com.magsad.electronics.entity.ModelProperty;
import com.magsad.electronics.repository.ModelPropertyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ModelPropertyService {
    private final ModelPropertyRepository modelPropertyRepository;

    public List<ModelProperty> findAll(){
        return modelPropertyRepository.findAll();
    }

    public ModelProperty findById(Long id){
        return modelPropertyRepository.findById(id).get();
    }

    public ModelProperty save(ModelProperty modelProperty){
        return modelPropertyRepository.save(modelProperty);
    }

    public void delete(Long id){
        ModelProperty modelPropertyForDelete = modelPropertyRepository.findById(id).get();
        modelPropertyRepository.delete(modelPropertyForDelete);
    }

    public ModelProperty update(ModelProperty modelProperty){
        ModelProperty modelPropertyForUpdate = modelPropertyRepository.findById(modelProperty.getId()).get();

        modelPropertyForUpdate.setModel(modelProperty.getModel());
        modelPropertyForUpdate.setPrice(modelProperty.getPrice());
        modelPropertyForUpdate.setCpu(modelProperty.getCpu());
        modelPropertyForUpdate.setRam(modelProperty.getRam());
        modelPropertyForUpdate.setScreen(modelProperty.getScreen());
        modelPropertyForUpdate.setCamera(modelProperty.getCamera());
        modelPropertyForUpdate.setBattery(modelProperty.getBattery());
        modelPropertyForUpdate.setStockCount(modelProperty.getStockCount());
        modelPropertyForUpdate.setStorage(modelProperty.getStorage());
        modelPropertyForUpdate.setNfc(modelProperty.getNfc());
        modelPropertyForUpdate.setBluetooth(modelProperty.getBluetooth());
        modelPropertyForUpdate.setWifi(modelProperty.getWifi());
        modelPropertyForUpdate.setConnection(modelProperty.getConnection());
        modelPropertyForUpdate.setChargeType(modelProperty.getChargeType());
        modelPropertyForUpdate.setExtraProperty(modelProperty.getExtraProperty());

        return modelPropertyRepository.save(modelPropertyForUpdate);
    }
}
