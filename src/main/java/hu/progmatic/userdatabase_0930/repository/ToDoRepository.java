package hu.progmatic.userdatabase_0930.repository;

import hu.progmatic.userdatabase_0930.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Long> {

}
