package com.julioosilva97.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.julioosilva97.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
