package AST.Literal.Object;

import java.util.List;

public class ObjectBody {
    private List<ObjectKeyValue> objects;

    public List<ObjectKeyValue> getObjects() {
        return objects;
    }

    public void setObjects(List<ObjectKeyValue> objects) {
        this.objects = objects;
    }

    public void addObject(ObjectKeyValue object) {
        this.objects.add(object);
    }

    @Override
    public String toString() {
        return "ObjectBody { " +
                "objects = " + objects +
                '}';
    }
}
