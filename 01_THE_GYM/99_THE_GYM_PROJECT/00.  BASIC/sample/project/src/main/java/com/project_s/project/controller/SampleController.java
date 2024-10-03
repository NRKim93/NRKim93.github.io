package com.project_s.project.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project_s.project.service.SampleServiceImpl;


@Controller
public class SampleController {
    
    private final SampleServiceImpl sampleService;  // SampleService 인터페이스 주입

    @Autowired
    public SampleController(SampleServiceImpl sampleService) {
        this.sampleService = sampleService;
    }
    
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/name")
    @ResponseBody
    public List<String> getAllNames() {
        return sampleService.getAllNames();  // 서비스 계층에 데이터 조회 요청
    }

    @PostMapping("/insert")
    @ResponseBody
    public void insertDatas(@RequestBody Map<String,String> payload) {
        String name = payload.get("name");
        sampleService.insertDatas(name);

    }

    @PostMapping("/delete")
    @ResponseBody
    public void deletetDatas(@RequestBody Map<String,String> payload) {
        String name = payload.get("name");
        sampleService.deletetDatas(name);
    }
    
}
