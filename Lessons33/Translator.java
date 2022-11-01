package Lessons33;

import java.util.ArrayList;
import java.util.Scanner;

public class  Translator {
    private String name;
    public String trans;

    public Translator(String name, String trans) {
        this.name = name;
        this.trans=trans;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrans() {
        return trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }

    }

