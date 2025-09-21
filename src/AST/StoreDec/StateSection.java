package AST.StoreDec;

import java.util.ArrayList;
import java.util.List;

public class StateSection {
    List<StoreStateField> fields = new ArrayList<StoreStateField>();

    public List<StoreStateField> getFields() {
        return fields;
    }

    public void setFields(List<StoreStateField> fields) {
        this.fields = fields;
    }

    public void addField(StoreStateField field) {
        fields.add(field);
    }

    @Override
    public String toString() {
        return "StateSection { " +
                "fields = " + fields +
                '}';
    }
}
