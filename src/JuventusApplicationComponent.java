import com.intellij.ide.ui.LafManager;

import javax.swing.*;

public class JuventusApplicationComponent {
    public JuventusApplicationComponent() {
        LafManager.getInstance().addLafManagerListener(__ -> updateProgressBarUi());
        updateProgressBarUi();
    }

    private void updateProgressBarUi() {
        UIManager.put("ProgressBarUI", JuventusProgressBarUi.class.getName());
        UIManager.getDefaults().put(JuventusProgressBarUi.class.getName(), JuventusProgressBarUi.class);
    }
}
