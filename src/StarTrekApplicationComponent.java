import com.intellij.ide.ui.LafManager;

import javax.swing.*;

public class StarTrekApplicationComponent {
    public StarTrekApplicationComponent() {
        LafManager.getInstance().addLafManagerListener(__ -> updateProgressBarUi());
        updateProgressBarUi();
    }

    private void updateProgressBarUi() {
        UIManager.put("ProgressBarUI", StarTrekProgressBarUi.class.getName());
        UIManager.getDefaults().put(StarTrekProgressBarUi.class.getName(), StarTrekProgressBarUi.class);
    }
}
