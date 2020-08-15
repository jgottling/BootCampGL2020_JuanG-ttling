package spring.coverage.example.model;

import java.util.ArrayList;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Example {

	private int id;
	private String name;
	private int value;
}
