package archiver;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

/**
 * Created by etryfly on 20.06.17.
 */
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model) {
        this.model = model;
    }

    public File askFileForArchivation() {
        JFileChooser fileopen = new JFileChooser();
        int ret = fileopen.showDialog(null, "Открыть файл");
        if (ret == JFileChooser.APPROVE_OPTION) {
            File file = fileopen.getSelectedFile();
            view.inputLable.setText(file.getName());
            return file;
        }
        return null;
    }


    public File askArchiveOutputFile() {
        JFileChooser fileopen = new JFileChooser();
        int ret = fileopen.showDialog(null, "Открыть файл");
        if (ret == JFileChooser.APPROVE_OPTION) {
            File file = fileopen.getSelectedFile();
            view.outputLable.setText(file.getName());
            return file;
        }
        return null;
    }


    public void onListenFileSelect(JButton button) {
        button.addActionListener((ActionListener) -> {
            model.setFileInput(askFileForArchivation());
        });
    }

    public void onListenArchiveSelect(JButton button) {
        button.addActionListener((ActionListener) -> {
            model.setFileOutput(askArchiveOutputFile());
        });
    }

    public void onListenSubmit(JButton button) {
        button.addActionListener((ActionListener) -> {
            try {
                model.archiveFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void setView(View view) {
        this.view = view;
    }
}
