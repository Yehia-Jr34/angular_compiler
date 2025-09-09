package SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class BaseSymbolTable {
    private List<Row> symbols = new ArrayList<Row>();
    private List<String> usedVariables = new ArrayList<String>();

    public List<Row> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<Row> symbols) {
        this.symbols = symbols;
    }

    public List<String> getUsedVariables() {
        return usedVariables;
    }

    public void setUsedVariables(List<String> usedVariables) {
        this.usedVariables = usedVariables;
    }

    public void addSymbol(Row symbol) {
        this.symbols.add(symbol);
    }

    public void addUsedVariable(String variable) {
        this.usedVariables.add(variable);
    }

    public void print() {
        System.out.println("=================== Variables ===================");
        for (Row row : symbols) {
            System.out.println(row);
        }
        System.out.println("==================== End Of Variables ==================");

        System.out.println("==================== Used Variables ===============");
        for (String variable : usedVariables) {
            System.out.println(variable);
        }
        System.out.println("==================== End Of Used Variables ===============");
    }

}
