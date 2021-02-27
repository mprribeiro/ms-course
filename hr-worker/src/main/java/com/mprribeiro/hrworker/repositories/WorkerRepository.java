package com.mprribeiro.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mprribeiro.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
