package Ejercicio3Composite;

public interface IFile {
    int getNumberOfWords();
    void addChild(IFile file);
    void removeChild(IFile file);
    IFile getChild(int index);
}
