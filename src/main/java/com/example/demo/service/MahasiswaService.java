package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Mahasiswa;

public interface MahasiswaService {
    List<Mahasiswa> getMahasiswa();
    Optional<Mahasiswa> getMahasiswaById(Long id);
    Mahasiswa postMahasiswa(Mahasiswa Mahasiswa);
    Mahasiswa updateMahasiswa(Long id, Mahasiswa mahasiswaUpdate) throws Exception;
}
