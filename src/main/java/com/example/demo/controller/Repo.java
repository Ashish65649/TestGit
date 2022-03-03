package com.example.demo.controller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Question, Integer> {
}
