package AST.StoreDec;

import java.util.List;

public class ReducerSection {
    private List<ReducerRule> rules;

    public List<ReducerRule> getRules() {
        return rules;
    }

    public void setRules(List<ReducerRule> rules) {
        this.rules = rules;
    }

    public void addRule(ReducerRule rule) {
        this.rules.add(rule);
    }

    @Override
    public String toString() {
        return "ReducerSection { " +
                "rules = " + rules +
                '}';
    }
}
