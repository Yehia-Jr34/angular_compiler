package SymbolTable;

import java.util.*;

public class BaseSymbolTable {
    private List<Row> symbols = new ArrayList<>();

    public void addSymbol(Row symbol) {
        this.symbols.add(symbol);
    }

    public List<Row> getSymbols() {
        return symbols;
    }

    public void print() {
        System.out.println("=================== SYMBOL TABLE ===================");
        symbols.forEach(System.out::println);
        System.out.println("==================== END SYMBOL TABLE ==================");
    }
}