package com.dio.salas_reuniao_java.repository;

import com.dio.salas_reuniao_java.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
