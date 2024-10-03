package com.project_s.project.service;

import java.util.List;

public interface SampleService {
    // select문 구동 메서드
    List<String> getAllNames();
    void insertDatas(String name);
    void deletetDatas(String name);

}
