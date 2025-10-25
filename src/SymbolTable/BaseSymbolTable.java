package SymbolTable;

import java.util.*;
import java.util.stream.Collectors;

public class BaseSymbolTable {
    private List<Row> symbols = new ArrayList<>();

    public void addSymbol(Row symbol) {
        this.symbols.add(symbol);
    }

    public List<Row> getSymbols() {
        return symbols;
    }

    // البحث في النطاق الحالي فقط
    public Row lookupCurrentScope(String name, String currentScope) {
        return symbols.stream()
                .filter(s -> s.getName().equals(name) && s.getScope().equals(currentScope))
                .findFirst()
                .orElse(null);
    }

    // البحث في جميع النطاقات (من الأعمق إلى الأوسع)
    public Row lookup(String name, String currentScope) {
        // البحث في النطاق الحالي أولاً
        Row symbol = lookupCurrentScope(name, currentScope);
        if (symbol != null) return symbol;

        // ثم البحث في النطاق العام
        return symbols.stream()
                .filter(s -> s.getName().equals(name) && "global".equals(s.getScope()))
                .findFirst()
                .orElse(null);
    }

    // التحقق من وجود رمز في النطاق الحالي
    public boolean existsInCurrentScope(String name, String currentScope) {
        return lookupCurrentScope(name, currentScope) != null;
    }

    // الحصول على جميع الرموز في نطاق معين
    public List<Row> getSymbolsInScope(String scope) {
        return symbols.stream()
                .filter(s -> s.getScope().equals(scope))
                .collect(Collectors.toList());
    }

    // الحصول على جميع الرموز من نوع معين
    public List<Row> getSymbolsByType(SymbolType type) {
        return symbols.stream()
                .filter(s -> s.getSymbolType() == type)
                .collect(Collectors.toList());
    }

    public void print() {
        System.out.println("=================== SYMBOL TABLE ===================");
        symbols.forEach(System.out::println);
        System.out.println("==================== END SYMBOL TABLE ==================");
    }
}