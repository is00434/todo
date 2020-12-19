package todo.todos;

import org.springframework.stereotype.Component;

@Component
public class TodoApiController {

	private final TodoRepository repository;
	 
	public TodoApiController(final TodoRepository repository) {
		this.repository = repository;
	}
}
