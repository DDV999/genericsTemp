public class gTemp19<G> implements GenericInterfaceImpl<G>{
    private G something;

    @Override
    public G doSomething(){
        return something;
    }
}

interface GenericInterfaceImpl<G>{
    public G doSomething();
}