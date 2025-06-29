package com.telusko.demo.service;

import com.telusko.demo.Model.Feature;
import com.telusko.demo.Model.Project;
import com.telusko.demo.repo.ProjectRepository;
import com.telusko.demo.repo.featurerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class featureservice {

    @Autowired
    public featurerepo repo;


    public Feature addfeature(Feature feature) {
        return repo.save(feature);
    }

    public List<Feature> viewfeatures() {
        return (List<Feature>) repo.findAll();
    }
}
