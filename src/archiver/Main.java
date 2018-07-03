package archiver;

/**
 * Дописать разархивацию
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
