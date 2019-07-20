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

        System.out.println("\n Initial Table \n");
        read.readOperation();
        System.out.println("############################################################\n");

        System.out.println("\n After Inserting a new row \n");
        create.createOperation(5, "Aarav", 2, "m");
        read.readOperation();
        System.out.println("############################################################\n");

        System.out.println("\n After Updating the new row \n");
        update.updateOperation(5, "Aarie", 3, "m");
        read.readOperation();
        System.out.println("############################################################\n");

        System.out.println("\n After Deleting the new row \n");
        delete.deleteOperation(5);
        read.readOperation();
        System.out.println("############################################################\n");
    }
}
