package AST.StoreDec;

public class StoreBody {
    private SelectorsSection selectorsSection = null;
    private ActionsSection actionsSection = null;
    private ReducerSection reducerSection = null;
    private StateSection stateSection;

    public SelectorsSection getSelectorsSection() {
        return selectorsSection;
    }

    public void setSelectorsSection(SelectorsSection selectorsSection) {
        this.selectorsSection = selectorsSection;
    }

    public ActionsSection getActionsSection() {
        return actionsSection;
    }

    public void setActionsSection(ActionsSection actionsSection) {
        this.actionsSection = actionsSection;
    }

    public ReducerSection getReducerSection() {
        return reducerSection;
    }

    public void setReducerSection(ReducerSection reducerSection) {
        this.reducerSection = reducerSection;
    }

    public StateSection getStateSection() {
        return stateSection;
    }

    public void setStateSection(StateSection stateSection) {
        this.stateSection = stateSection;
    }

    @Override
    public String toString() {
        return "StoreBody{" +
                "selectorsSection = " + (selectorsSection != null ? selectorsSection : "Not Defined") +
                ", actionsSection = " + (actionsSection != null ? actionsSection : "Not Defined") +
                ", reducerSection = " + (reducerSection != null ? reducerSection : "Not Defined") +
                ", stateSection = " + (stateSection != null ? stateSection : "Not Defined") +
                '}';
    }

}
