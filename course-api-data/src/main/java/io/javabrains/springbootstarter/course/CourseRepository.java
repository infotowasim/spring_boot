package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,String> {
	

	//Crud operation
	//getAllTopics()
	//getTopic(String id)
	//updateTopic(Topic t)
	//daleteTopic(String id)
	
	
	//public List<Course> getCoursesByTopic(String topicId);
	//public List<Course> getCoursesByName(String name);
	
	//public List<Course>  findByName(String name);
	//public List<Course>  findBydescription(String foo);
	
	public List<Course>  findByTopicId(String topicId);

}
