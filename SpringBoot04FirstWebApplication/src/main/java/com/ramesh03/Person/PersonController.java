package com.ramesh03.Person;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class PersonController
{
	private PersonService personService;
	
	public PersonController(PersonService personService) {
		super();
		this.personService = personService;
	}

	@RequestMapping("person-list")
	public String listAllPersons(ModelMap map)
	{
		 List<PersonDetails> persons= personService.findByUserName("Ramesh");
		 map.addAttribute("persons", persons);
		 System.out.println(persons);
		return "PersonList";
	}
}
