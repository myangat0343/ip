
package Duke;
import Duke.Exceptions.DukeException;
import Duke.Tasks.Deadline;
import Duke.Tasks.Event;
import Duke.Tasks.TaskList;
import Duke.*;
import Duke.UI.Ui;


import Duke.Storage.FileReader;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


/**
 * Duke App Main class
 */

public class Duke {

    private static final FileReader storage = new FileReader("Duke");
    ;

    private static final TaskList tasks = storage.load();

    private static final Ui ui = new Ui();

    private void launch() throws FileNotFoundException {
        System.out.println("Hello World!!!!");


//        try {
//            FileInputStream fis = new FileInputStream(String.valueOf(filePath));
//            ObjectInputStream reader = new ObjectInputStream(fis);
//
//        } catch (IOException e){
//            System.out.println("wromg");
//        }


    }


    public void run() {
        ui.showWelcome();
        boolean isExit = false;
//        while (!isExit) {
//            /*
//            try {
//                String fullCommand = ui.readCommand();
//                ui.showLine();
//                Command c = Parser.parse(fullCommand);
//
//
//            } catch (DukeException e) {
//                ui.showError(e.getMessage());
//            } finally {
//                ui.showLine();
//            }
//*/
//        }


    }

    public static void main(String[] args) throws DukeException, FileNotFoundException {
        Event e = new Event("Go to the lecture", LocalDateTime.of(LocalDate.parse("2022-02-22"), LocalTime.parse("11:22")), false);
        Deadline ddl = new Deadline("Go to the lecture", LocalDateTime.of(LocalDate.parse("2022-02-22"), LocalTime.parse("11:22")), true);

        System.out.println(e.toString());
        System.out.println(e.save());
        System.out.println(ddl.toString());
        System.out.println(ddl.save());
       // new Duke().launch();
    }
}


