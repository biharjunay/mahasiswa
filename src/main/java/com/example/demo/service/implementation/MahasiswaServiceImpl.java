package com.example.demo.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Mahasiswa;
import com.example.demo.repository.MahasiswaRepository;
import com.example.demo.service.MahasiswaService;

public class MahasiswaServiceImpl implements MahasiswaService {
    @Autowired
    private MahasiswaRepository mahasiswaRepository;
    @Override
    public List<Mahasiswa> getMahasiswa() {
        List<Mahasiswa> mahasiswas = mahasiswaRepository.findAll();
        return mahasiswas;
    }
    
}
