package AST.HTMLElementsAndBindings.Bindings;

import AST.Dec.Function.FunctionCall;
import AST.Identifier.IdentifierPath;

public class EventBinding {
    private EventName eventName;
    private FunctionCall functionCall = null;
    private IdentifierPath identifierPath = null;

    public EventName getEventName() {
        return eventName;
    }

    public void setEventName(EventName eventName) {
        this.eventName = eventName;
    }

    public FunctionCall getFunctionCall() {
        return functionCall;
    }

    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    public IdentifierPath getIdentifierPath() {
        return identifierPath;
    }

    public void setIdentifierPath(IdentifierPath identifierPath) {
        this.identifierPath = identifierPath;
    }

    @Override
    public String toString() {
        if (functionCall != null) {
            return "EventBinding { " +
                    "eventName = " + eventName +
                    ", functionCall = " + functionCall +
                    '}';
        } else {
            return "EventBinding { " +
                    "eventName = " + eventName +
                    ", identifierPath = " + identifierPath +
                    '}';
        }
    }
}
