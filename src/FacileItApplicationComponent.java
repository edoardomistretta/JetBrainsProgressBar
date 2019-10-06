import com.intellij.ide.ui.LafManager;

import javax.swing.*;

public class FacileItApplicationComponent {
    public FacileItApplicationComponent() {
        LafManager.getInstance().addLafManagerListener(__ -> updateProgressBarUi());
        updateProgressBarUi();
    }

    private void updateProgressBarUi() {
        UIManager.put("ProgressBarUI", FacileItProgressBarUi.class.getName());
        UIManager.getDefaults().put(FacileItProgressBarUi.class.getName(), FacileItProgressBarUi.class);
    }
}
