package vn.t3h.t3h_2202.dto;

import lombok.Data;
import vn.t3h.t3h_2202.entity.CategoryEntity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class CategoryDto {
    Long id;
    String name;
    String description;

    public CategoryEntity convertEntity(){
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setId(id);
        categoryEntity.setName(name);
        categoryEntity.setDescription(description);
        return categoryEntity;
    }
}
