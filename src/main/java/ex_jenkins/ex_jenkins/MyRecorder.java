package ex_jenkins.ex_jenkins;

import hudson.tasks.BuildStepMonitor;
import hudson.tasks.Recorder;

/**
 * Created by sungwoo on 15. 12. 10.
 */
public class MyRecorder extends Recorder {

    @Override
    public BuildStepMonitor getRequiredMonitorService() {
        return BuildStepMonitor.NONE;
    }
}
