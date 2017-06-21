package archiver;

/**
 * Created by etryfly on 20.06.17.
 */
public class Main {
    public static void main(String[] args) {

        Model model = new Model();
        Controller controller = new Controller(model);
        View view = new View(controller);
        controller.setView(view);
        view.setVisible(true);
    }
}
