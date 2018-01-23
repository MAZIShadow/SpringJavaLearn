package org.home.mazi.springbootquickstart.course;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author MAZI_
 */
public interface CourseRepository extends CrudRepository<Course, String> {
	public List<Course> findByTopicId(String topicId);
}
