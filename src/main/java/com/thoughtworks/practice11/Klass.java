package com.thoughtworks.practice11;

import java.util.ArrayList;
import java.util.Collection;

public class Klass {
    private int number;
    private Student leader;
    private Collection<JoinListener> joinJoinListeners;
    private Collection<AssignLeaderListener> assignLeaderListeners;

    public Klass(int number) {
        this.number = number;
        this.joinJoinListeners = new ArrayList<>();
        this.assignLeaderListeners = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Klass klass = (Klass) o;

        return number == klass.number;
    }

    @Override
    public int hashCode() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student student) {
        if (student.getKlass().equals(this)) {
            this.leader = student;
            assignLeaderListeners.forEach(l -> l.notifyAssignLeader(student, this));
        } else {
            System.out.println("It is not one of us.");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        joinJoinListeners.forEach(l -> l.notifyJoin(student, this));
    }

    public boolean isIn(Student student) {
        return student.getKlass().equals(this);
    }

    public void registerJoinListener(JoinListener joinListener) {
        this.joinJoinListeners.add(joinListener);
    }

    public void registerAssignLeaderListener(AssignLeaderListener listener) {
        this.assignLeaderListeners.add(listener);
    }
}
