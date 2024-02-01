package org.example.view;

public class MyMenu {
    private MyIo io = new MyIo();
    public int mainMenu(){
        return io.getUserInt("1.Generate 1 Zombie\n2.Generate some Zed\n3.Generate n Zed\n4.Quit\nEnter: ",true);
    }

    public int nZed(){
        return io.int_Min_MAx("How many Zed yoy want to generate\nEnter: ",1,50, true);
    }
}
