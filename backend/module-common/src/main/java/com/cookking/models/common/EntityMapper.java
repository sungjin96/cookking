package com.cookking.models.common;

import org.mapstruct.InheritInverseConfiguration;

import java.util.List;

/**
 * Created by marathoner on 2021/07/16.
 */
public interface EntityMapper <D, E> {
    E toEntity(D dto);

    @InheritInverseConfiguration
    D toDto(E entity);

    List<E> toEntityList(List<D> list);

    List<D> toDtoList(List<E> list);
}
