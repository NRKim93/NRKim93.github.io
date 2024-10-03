package com.project_s.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_s.project.repo.OracleRepository;

@Service
public class SampleServiceImpl implements SampleService{
    private final OracleRepository oracleRepository;

    @Autowired
    public SampleServiceImpl(OracleRepository oracleRepository) {
        this.oracleRepository = oracleRepository;
    }

       // 데이터 조회 구현
       @Override
       public List<String> getAllNames() {
           return oracleRepository.getAllNames();  // 리포지토리에서 데이터 조회
       }

       @Override
       public void insertDatas(String name) {
            oracleRepository.insertDatas(name);
       }

       @Override
       public void deletetDatas(String name) {
            oracleRepository.deletetDatas(name);
       }
}
