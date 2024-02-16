package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.service.MahasiswaService;
import com.example.demo.entity.*;
import com.example.demo.repository.MahasiswaRepository;

@RestController
@RequestMapping("/mahasiswa")
public class MahasiswaController {
    @Autowired
    MahasiswaService mahasiswaService;
    @Autowired
    MahasiswaRepository mahasiswaRepository;
    @GetMapping("")
    public ResponseEntity<List<Mahasiswa>> getMahasiswa() {
        List<Mahasiswa> mahasiswas = mahasiswaService.getMahasiswa();
        return ResponseEntity.ok(mahasiswas);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Mahasiswa>> getMahasiswaById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(mahasiswaService.getMahasiswaById(id));

    }
    @PostMapping("")
    public ResponseEntity<Mahasiswa> postMahasiswa(@RequestBody Mahasiswa mahasiswa) {
        return new ResponseEntity<>(mahasiswaService.postMahasiswa(mahasiswa), HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Mahasiswa> updateMahasiswa(@PathVariable("id") Long id, @RequestBody Mahasiswa mahasiswa) throws Exception {
        return new ResponseEntity<>(mahasiswaService.updateMahasiswa(id, mahasiswa), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Mahasiswa> deleteMahasiswa(@PathVariable("id") Long id) {
        mahasiswaRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
