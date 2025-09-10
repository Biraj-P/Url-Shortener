package com.biraj.urlshortener.domain.models;

import java.io.Serializable;

/**
 * DTO for {@link com.biraj.urlshortener.domain.entities.User}
 */
public record UserDto(Long id, String name) implements Serializable {
}