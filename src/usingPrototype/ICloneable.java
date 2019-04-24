package usingPrototype;

public interface ICloneable {

    ICloneable swallowCopy() throws CloneNotSupportedException;
    ICloneable deepCopy() throws CloneNotSupportedException;
}
