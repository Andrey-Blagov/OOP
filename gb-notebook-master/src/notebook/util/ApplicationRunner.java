package notebook.util;

import static notebook.util.DBConnector.createDB;

import notebook.controller.UserController;
import notebook.model.repository.GBRepository;
import notebook.model.repository.impl.UserRepository;
import notebook.view.UserView;

/**
 * ApplicationRunner
 */
public class ApplicationRunner {

    public ApplicationRunner() {
        createDB();
        GBRepository repository = new UserRepository();
        UserController controller = new UserController(repository);
        UserView view = new UserView(controller);
        view.run();
    }

    public static void run() {
        try {
            new ApplicationRunner();
        // } finally {
        //     doShutdownHook();
        // }
    }
}