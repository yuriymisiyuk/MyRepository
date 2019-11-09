package telran.java31.dto;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

@Getter
@Builder
public class PersonFoodDto
{

	String name;
	@Singular List<String> foods;
}
