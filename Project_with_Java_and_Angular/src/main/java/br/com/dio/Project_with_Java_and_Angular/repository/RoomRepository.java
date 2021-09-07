package br.com.dio.Project_with_Java_and_Angular.repository;

import br.com.dio.Project_with_Java_and_Angular.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long> {
}
