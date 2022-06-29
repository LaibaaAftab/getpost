package com.example.integapachi;

public class Student {

    private String id;
    private String firstname;
    private String second;
    private int maths;
    private int english;
    private int totalmarks;

    public void setid(String s)
    {
        id = s;
    }

    public void setfname(String s)
    {
        firstname = s;
    }

    public void setsname(String s)
    {
        second = s;
    }

    public void setmaths(int s)
    {
        maths = s;
    }
    public void seteng(int s)
    {
        english = s;
    }

    public String getname()
    {
        return firstname+" "+second;
    }

    public String getid()
    {
        return id;

    }

    public int getmaths()
    {
        return maths;
    }

    public int geteng()
    {
        return english;
    }
    public void settotal(int t)
    {
        totalmarks = t;
    }

    public Student addMarks(Student s)
    {
        int total = s.geteng() + s.getmaths();
        s.settotal(total);
        return s;

    }

    public int addMarkss(int i,int j)
    {
        this.seteng(i);
        this.setmaths(j);
        int total = i + j;
        return total;

    }




}
