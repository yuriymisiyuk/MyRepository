package telran.java31.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import telran.java31.dto.PersonDto;
import telran.java31.dto.PersonFoodDto;

@RestController
@RequestMapping("/v1")
public class SimpleServiceController
{
	@GetMapping("/hello")
	public String hello(@RequestParam(name = "firstname") String str1, @RequestParam(name = "lastname") String str2)
	{
		return "Hello " + str1 + " " + str2;
	}
	
	@PostMapping("/hello")
	public String hello(@RequestBody PersonDto personDto)
	{
		return "Hello " + personDto.getFirstname() + " " + personDto.getLastname();
	}
	
	@PostMapping("/food")
	public PersonFoodDto eatPerson(@RequestBody PersonDto personDto)
	{
		return PersonFoodDto.builder()
				.name(personDto.getFirstname() + " " + personDto.getLastname())
				.food("Banana")
				.food("Clementine")
				.food("Chicken")
				.build();
	}
}
