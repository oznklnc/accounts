package com.eazybytes.accounts.mapper;

import com.eazybytes.accounts.dto.AccountsDto;
import com.eazybytes.accounts.entity.Accounts;
import org.springframework.stereotype.Component;

@Component
public class AccountsMapper extends AbstractMapper<Accounts, AccountsDto> {

    @Override
    public AccountsDto toDto(Accounts entity) {
        return AccountsDto.builder()
                .accountNumber(entity.getAccountNumber())
                .accountType(entity.getAccountType())
                .branchAddress(entity.getBranchAddress())
                .build();
    }

    @Override
    public Accounts toEntity(AccountsDto dto) {
        Accounts accounts = new Accounts();
        accounts.setAccountNumber(dto.getAccountNumber());
        accounts.setAccountType(dto.getAccountType());
        accounts.setBranchAddress(dto.getBranchAddress());
        return accounts;
    }

    @Override
    public Accounts toEntity(AccountsDto dto, Accounts entity) {
        entity.setAccountNumber(dto.getAccountNumber());
        entity.setAccountType(dto.getAccountType());
        entity.setBranchAddress(dto.getBranchAddress());
        return entity;
    }
}
