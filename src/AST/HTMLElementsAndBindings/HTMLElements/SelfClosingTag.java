package AST.HTMLElementsAndBindings.HTMLElements;

import AST.HTMLElementsAndBindings.Attribute.Attribute;
import AST.HTMLElementsAndBindings.Attribute.BoundAttribute;
import AST.HTMLElementsAndBindings.Bindings.EventBinding;

import java.util.ArrayList;
import java.util.List;

public class SelfClosingTag {
    private List<BoundAttribute> boundAttributes = new ArrayList<>();
    private List<Attribute> attributes = new ArrayList<>();
    private List<EventBinding> eventBindings = new ArrayList<>();

    public List<BoundAttribute> getBoundAttributes() {
        return boundAttributes;
    }

    public void setBoundAttributes(List<BoundAttribute> boundAttributes) {
        this.boundAttributes = boundAttributes;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public List<EventBinding> getEventBindings() {
        return eventBindings;
    }

    public void setEventBindings(List<EventBinding> eventBindings) {
        this.eventBindings = eventBindings;
    }

    public void addBoundAttribute(BoundAttribute boundAttribute) {
        this.boundAttributes.add(boundAttribute);
    }

    public void addAttribute(Attribute attribute) {
        this.attributes.add(attribute);
    }

    public void addEventBinding(EventBinding eventBinding) {
        this.eventBindings.add(eventBinding);
    }

    @Override
    public String toString() {
        return "SelfClosingTag { " +
                "boundAttributes = " + boundAttributes +
                ", attributes = " + attributes +
                ", eventBindings = " + eventBindings +
                '}';
    }
}
