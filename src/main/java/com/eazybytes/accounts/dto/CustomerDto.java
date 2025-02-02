package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account Information"
)
public class CustomerDto {

    @Schema(
            description = "Name of the Customer",
            example = "John Doe"
    )
    @NotEmpty(message = "Name cannot be null or empty")
    @Size(min = 5, max = 30, message = "The length of the customer name should be between 5 and 30")
    private String name;


    @Schema(
            description = "Email of the Customer",
            example = "john.doe@example.com"
    )
    @NotEmpty(message = "Email cannot be null or empty")
    @Email(message = "Email should be valid value")
    private String email;

    @Schema(
            description = "Mobile Number of the Customer",
            example = "1234567890"
    )
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Account Details of the Customer",
            implementation = AccountsDto.class
    )
    private AccountsDto accountsDto;
}
