package com.kj;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contacts")
public class ContactRestController {
	@Autowired
	private ContactRepository repo;

	@RequestMapping(method = RequestMethod.GET)
	public List<Contact> getAll() {
		return repo.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public Contact create(@RequestBody Contact contact) {
		return repo.save(contact);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "{id}")
	public void delete(@PathVariable String id) {
		repo.delete(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "{id}")
	public Contact update(@PathVariable String id, @RequestBody Contact contact) {
		Contact update = repo.findOne(id);
		update.setName(contact.getName());
		return repo.save(update);
	}
}
