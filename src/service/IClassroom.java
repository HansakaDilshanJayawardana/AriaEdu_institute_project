package service;

import model.Classroom;

import java.util.ArrayList;

public interface IClassroom {

    public void addClassroom(Classroom classroom);
    public void editClassroom(Classroom classroom);
    public ArrayList<Classroom> viewClassroom();
}
