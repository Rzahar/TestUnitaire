package fr.testdemo.employes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employe, Long> {
}
