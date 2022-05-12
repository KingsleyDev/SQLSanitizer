package co.za.flash.sqlsanitizer.controller.models;

import com.google.gson.Gson;

import java.util.Set;

public class ResponseDto<T> {

    private Set<String> errors;
    private T data;

    @Override
    public int hashCode() {
        return new Gson().toJson(this).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        return new Gson().toJson(this).hashCode() == new Gson().toJson(obj).hashCode();
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
