package com.stackroute.crud;

import com.stackroute.crud.util.Create;
import com.stackroute.crud.util.Delete;
import com.stackroute.crud.util.Read;
import com.stackroute.crud.util.Update;

public class App {

    public static void main( String[] args ) {

        Create create = new Create();
        Read read = new Read();
        Update update = new Update();
        Delete delete = new Delete();

        read.readOperation();
        create.createOperation(5, "Aarav", 2, "m");
        read.readOperation();
        update.updateOperation(3, "Nannu", 26, "f");
        read.readOperation();
        delete.deleteOperation(5);

    }
}
