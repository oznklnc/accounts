package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(
        name = "Accounts",
        description = "Schema to hold Account Information"
)
public class AccountsDto {

    @Schema(
            description = "Account Number of the Eazy Bank account",
            example = "1234567890"
    )
    @NotEmpty(message = "Account number cannot be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number must be 10 digits")
    private Long accountNumber;

    @Schema(
            description = "Account Type of the Eazy Bank account",
            example = "SAVINGS"
    )
    @NotEmpty(message = "Account type cannot be null or empty")
    private String accountType;

    @Schema(
            description = "Eazy Bank branch address",
            example = "123, Main Street, New York, USA"
    )
    @NotEmpty(message = "Branch address cannot be null or empty")
    private String branchAddress;
}
