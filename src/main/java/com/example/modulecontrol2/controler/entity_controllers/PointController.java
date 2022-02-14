package com.example.modulecontrol2.controler.entity_controllers;

import com.example.modulecontrol2.model.Point;
import com.example.modulecontrol2.model.Task;
import com.example.modulecontrol2.repository.PointRepo;
import com.example.modulecontrol2.repository.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PointController {
    @Autowired
    private PointRepo pointRepository;

    @GetMapping("/points")
    public List<Point> getAllPoints() {
        return pointRepository.findAll();
    }
}