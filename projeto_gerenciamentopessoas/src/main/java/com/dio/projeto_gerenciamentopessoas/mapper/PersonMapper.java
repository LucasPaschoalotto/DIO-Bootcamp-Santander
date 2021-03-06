package com.dio.projeto_gerenciamentopessoas.mapper;

import com.dio.projeto_gerenciamentopessoas.dto.request.PersonDTO;
import com.dio.projeto_gerenciamentopessoas.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}
