package org.zktr;

import java.util.List;

public class Rank {
    private int rid;
    private String rname;
    private List<Student> list;

    public Rank() {
    }

    public Rank(int rid, String rname, List<Student> list) {
        this.rid = rid;
        this.rname = rname;
        this.list = list;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }
}
