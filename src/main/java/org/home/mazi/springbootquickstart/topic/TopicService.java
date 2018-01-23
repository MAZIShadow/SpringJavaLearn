package org.home.mazi.springbootquickstart.topic;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MAZI_
 */
@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		
		return topics;
	}

	Topic getTopic(String id) {
		return topicRepository.findOne(id);
	}

	void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	void updateTopic(Topic topic, String id) {
		topicRepository.save(topic);
	}

	void deleteTopic(String id) {
		topicRepository.delete(id);
	}
}
