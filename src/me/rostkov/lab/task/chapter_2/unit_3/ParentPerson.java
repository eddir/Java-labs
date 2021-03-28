package me.rostkov.lab.task.chapter_2.unit_3;

import me.rostkov.lab.task.chapter_1.unit_4.Name;

public class ParentPerson {

    private Name name;
    private ParentPerson parent;
    private short height;

    public ParentPerson(Name name, ParentPerson parent, short height) {
        this.name = name;
        this.parent = parent;
        this.height = height;
    }

    public ParentPerson(Name name, short height) {
        this.name = name;
        this.height = height;
    }

    public String toString() {
        if (height < 160) {
            return name + " маленький человек";
        } else if (height <= 185) {
            return name + " средний человек";
        }
        return name + " большой человек";
    }

    public boolean hasParent() {
        return this.parent != null;
    }

    public ParentPerson getParent() {
        return parent;
    }

    public void setParent(ParentPerson parent) {
        this.parent = parent;

        if (this.name.getSurname() == null && parent.getName().getSurname() != null) {
            this.name.setSurname(parent.getName().getSurname());
        }

        if (this.name.getPatronymic() == null) {
            this.name.setPatronymic(Name.toPatronymic(parent.getName().getName()));
        }
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public short getHeight() {
        return height;
    }

    public void setHeight(short height) {
        this.height = height;
    }


}
