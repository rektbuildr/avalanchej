package to.avax.avalanche.common.output;

public abstract class OutputOwners {
    protected String _typeName;
    protected Object _typeID;

    protected byte[] locktime;
    protected byte[] threshold;
    protected byte[] numaddrs;

    protected Address[] addresses;
}
