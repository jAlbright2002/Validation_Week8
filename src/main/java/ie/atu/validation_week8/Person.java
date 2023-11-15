package ie.atu.validation_week8;


import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {

    @NotBlank(message="Name cannot be blank.")
    String name;

    @NotEmpty(message="Title cannot be empty.")
    String title;

    @Positive(message="Id must be positive.") @Max(5)
    int employeeId;

    @Min(18)
    int age;

    @Email(message="Not a valid email.")
    String email;

    @NotEmpty(message="Position cannot be empty.")
    String position;

    @NotNull(message="Department must have a value.")
    String department;

}
