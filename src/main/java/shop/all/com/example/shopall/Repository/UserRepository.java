package shop.all.com.example.shopall.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.all.com.example.shopall.entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    // Custom query methods if needed
    UserEntity findByEmail(String email);
    UserEntity findByEmailAndPassword(String email, String password);
}

