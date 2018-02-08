package ru.dinis.cadry.dao.interfaces;

import org.springframework.stereotype.Component;
import ru.dinis.cadry.beans.Employee;
import ru.dinis.cadry.entities.User;

import java.util.List;

/**
 * Create by dinis of 04.02.18.
 */
@Component
public interface EmployeeDao {

    List<User> getUser();

    void addEmpl(Employee employee);

}
