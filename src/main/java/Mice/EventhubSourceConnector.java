package Mice;

import java.util.*;

import org.apache.kafka.common.config.ConfigDef;
import org.apache.kafka.connect.source.SourceConnector;
import org.apache.kafka.connect.source.SourceRecord;
import org.apache.kafka.connect.connector.Task;

public class EventhubSourceConnector extends  SourceConnector {
    private Map<String,String> props;

    @Override
    public String version() {
        return null;
    }

    @Override
    public void start(Map<String, String> props) {
        this.props = props;
    }


    @Override
    public void stop(){

    }

    @Override
    public ConfigDef config() {
        return null;
    }

    @Override
    public Class<? extends Task> taskClass(){
        return EventhubSourceTask.class;
    }

    @Override
    public List<Map<String, String>> taskConfigs(int maxTasks) {
        return null;
    }


}
