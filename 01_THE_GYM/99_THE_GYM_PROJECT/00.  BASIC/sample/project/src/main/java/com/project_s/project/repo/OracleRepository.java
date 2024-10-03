package com.project_s.project.repo;


import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class OracleRepository {
    private final JdbcTemplate jdbcTemplate;

    public OracleRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // public List<String> getNameList() {
    //     final String sql = "SELECT NAME FROM TEST_TABLE_001";
    //     return jdbcTemplate.queryForList(sql, String.class);
    // }

    public List<String> getAllNames() {
        final String sql = "SELECT NAME FROM TEST_TABLE_001";
        return jdbcTemplate.queryForList(sql, String.class);
    }

    public void insertDatas(String name) {
        final String sql = "INSERT INTO TEST_TABLE_001 (NAME) VALUES (?)";
        jdbcTemplate.update(sql,name);
    }
}
