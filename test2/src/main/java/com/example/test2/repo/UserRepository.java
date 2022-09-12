package com.example.test2.repo;
import com.example.test2.Model.Post;
import com.example.test2.Model.PostGan;
import com.example.test2.Model.PostUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface UserRepository extends CrudRepository<PostUser,Long> {
   List<PostUser> findBySurname(String surname);
//   List<PostUser> findBySurnameContains(String Surname);

}
