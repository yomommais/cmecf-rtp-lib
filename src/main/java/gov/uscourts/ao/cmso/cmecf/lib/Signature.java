package gov.uscourts.ao.cmso.cmecf.lib;

public interface Signature {

	String generateAxWaySignature(String httpMethod, String gatewayHost, String path, String payload);

}
