package com.gmail.denvolynets216;

import java.io.Serializable;

public class Groups implements Serializable{
    private Group[] groups;

    public Groups() {
        groups = new Group[0];
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public void addGroup(Group group){
        Group[]  temp = new Group[groups.length + 1];
        System.arraycopy(groups,0, temp, 0, groups.length);
        temp[temp.length-1] = group;
        groups = temp;
    }

    public void printGroups(){
        for (Group group : groups) {
            System.out.println(group.toString());
        }
    }
}
