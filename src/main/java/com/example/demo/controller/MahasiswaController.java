package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MahasiswaService;
import com.example.demo.entity.*;

@RestController
@RequestMapping("/shoes")
public class MahasiswaController {
    @Autowired
    MahasiswaService mahasiswaService;
    @GetMapping("")
    public ResponseEntity<List<Mahasiswa>> getMahasiswa() {
        List<Mahasiswa> mahasiswas = mahasiswaService.getMahasiswa();
        return ResponseEntity.ok(mahasiswas);
    }
}
