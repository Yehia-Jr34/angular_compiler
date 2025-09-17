package AST.StoreDec;

import java.util.List;

public class ActionsSection {
    private List<ActionDec> actions;

    public List<ActionDec> getActions() {
        return actions;
    }

    public void setActions(List<ActionDec> actions) {
        this.actions = actions;
    }

    public void addAction(ActionDec action) {
        this.actions.add(action);
    }

    @Override
    public String toString() {
        return "ActionsSection{" +
                "actions=" + actions +
                '}';
    }
}
