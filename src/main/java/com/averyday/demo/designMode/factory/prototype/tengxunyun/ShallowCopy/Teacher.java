package com.averyday.demo.designMode.factory.prototype.tengxunyun.ShallowCopy;

import lombok.Data;

/**
 * Description
 * Author ayt  on
 */
@Data
public class Teacher implements Cloneable {
    private String name;
    private Integer age;
    private String address;

    @Override
    public Teacher clone() {
        Teacher teacher = null;
        try {
            teacher = (Teacher) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return teacher;
    }


}
