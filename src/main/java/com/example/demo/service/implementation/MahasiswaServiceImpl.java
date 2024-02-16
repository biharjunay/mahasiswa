package com.example.demo.service.implementation;

import java.util.List;
import java.util.Optional;


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
    @Override
    public Optional<Mahasiswa> getMahasiswaById(Long id) {
        Optional<Mahasiswa> mahasiswa = mahasiswaRepository.findById(id);
        return mahasiswa;
    }
    @Override
    public Mahasiswa postMahasiswa(Mahasiswa mahasiswa) {
        Mahasiswa mahasiswa2 = mahasiswaRepository.save(mahasiswa);
        return mahasiswa2;
    }
    @Override
    public Mahasiswa updateMahasiswa(Long id, Mahasiswa mahasiswaUpdate) throws Exception {
        Mahasiswa mahasiswa = mahasiswaRepository.findById(id).orElseThrow(() -> new Exception("not found"));
        mahasiswa.setId(mahasiswaUpdate.getId());
        mahasiswa.setName(mahasiswaUpdate.getName());
        mahasiswa.setAge(mahasiswaUpdate.getAge());
        mahasiswa.setAddress(mahasiswaUpdate.getAddress());
        mahasiswa = mahasiswaRepository.save(mahasiswa);
        return mahasiswa;
    }
    
}
