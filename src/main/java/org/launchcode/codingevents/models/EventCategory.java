package org.launchcode.codingevents.models;

import javax.validation.constraints.Size;
import java.util.Objects;

public class EventCategory {

    private int id;
    private static int nextId = 1;
    @Size(min=3, message="Name must be at least 3 characters long")
    private String name;

    public EventCategory(String name) {
        this();
        this.name = name;
    }

    public EventCategory() {
        this.id= nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventCategory that = (EventCategory) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
