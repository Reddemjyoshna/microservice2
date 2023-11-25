package com.vamsi.SpringPostDb.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vamsi.SpringPostDb.model.StudentModel;

@Repository
public interface StudentRepo extends MongoRepository<StudentModel, String>{
 
	List<StudentModel> findByName(String name);
}