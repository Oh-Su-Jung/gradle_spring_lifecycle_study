package gradle_spring_lifecycle_study.di;

import org.springframework.stereotype.Component;

@Component
public class DuplicateMemberException extends RuntimeException {
	
	public DuplicateMemberException(String message) {
		super(message);
	}
}
