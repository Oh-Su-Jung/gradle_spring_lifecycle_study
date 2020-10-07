package gradle_spring_lifecycle_study.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"gradle_spring_lifecycle_study.spring"})
public class AppCtx {
}
