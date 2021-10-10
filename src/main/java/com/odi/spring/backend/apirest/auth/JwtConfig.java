package com.odi.spring.backend.apirest.auth;

public class JwtConfig {
	public static final String LLAVE_SECRETA = "alguna.clave.secreta.1234";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n"
			+ "MIIEogIBAAKCAQEA8LrrNJoy/opOLC3V3qFWmt4wkDpNpP4FCp5e/fW9zx9IENuf\r\n"
			+ "yclUICjt8kT2Ti0EqJhwOxzOgoUqf95BTONNdV10ya8omOwTBPuYPmSMRBxf/C4z\r\n"
			+ "Tf+WABTw9sZNp6ZK+OuxHc9Vi61O5kIoaCMDPQfX2KRkFFyDH1iJ3s8CoD5nEzEY\r\n"
			+ "24iSGsnxgwDkt9+l/KfwY4t6LMAyAt47U0aAKk+rlSJoteePJm0CdqkmsAru/ubC\r\n"
			+ "ILTOOO/deQL2Sg9axBaTk2Drv3BwZufrN7g/qPmFqpygkCIq99lUlpAyOWsYY9dY\r\n"
			+ "wa6kBRv1Qm35WHquV9k4ftHkYyxb7nbbPhe92wIDAQABAoIBAFanglk6FJcp4//l\r\n"
			+ "M/Ji81DmIGcaha6ZvejXn2wdlIjFQuTGmhtB/KVi9lxaVKtJaz7hOK0ernuvQeAr\r\n"
			+ "eigaPly8GnkrMxrxB9uoUWJMQW2XJToay18NXMqEv0Sll3h81MoL1YLcinewGBGs\r\n"
			+ "yOzLhbPnadxTOK9Xqd+TuHVa4SAbA7g7w1/EajwVclBnbJ+bPeHfyWquNO4odrwc\r\n"
			+ "GFviBE/DG6Xt5LRXd0bRI8q8MTOxrp0qVUw/UGHAGU7tDBMyutTlHX+gYUW0+I8l\r\n"
			+ "JYaxLkHYQdFMhE7ssnStnYfTf+aI3OPOZ9WWIMntUopi8r+FEMMceyOz9/6+APBC\r\n"
			+ "iYQ9VQECgYEA+NuRlX/Qqp06YvrvFiQE5ImC6mkPn25N2IpOks7XLDoJIscDCDY8\r\n"
			+ "XOTlvd9WaSJow2q1u+kBSWVRRLW2KigpdOvIgRueTyOzt+MuQdZzn/CXLphrAaem\r\n"
			+ "iqgkyNkEsS/x0EsbHDGrrsECLkqrDsSoWELjKHxQbBwpBph74RzlB4ECgYEA96Oi\r\n"
			+ "eBEdrm1n/M6bluBAT3lmE1TqC7ldJYoyZQKBMAAgChGoMqXt+y5ZXrOPKa4G2RYx\r\n"
			+ "trktBHDSRXoD6wY09lUkbiffQA3cXHLHOs3PFHjoVtvd+xv+0WDRRIyVC6pwI9WM\r\n"
			+ "w8YFNgyon1+d4Nw0K9Lnph4v3n3g8ra00uzfk1sCgYAXOUZo0TjD81BTlF9jjZD3\r\n"
			+ "Uu3ouk0+76hMIPwcLzldYz0fBbt+tLEFakcWZRVHUnK8aeTz2FbKZq4i32JUpNLZ\r\n"
			+ "mndntRAdCpPnAUh71GuN7YHuU0MJMIAWSILGS5pofrTuX1P0WZ5P/KsbbtRv2GJt\r\n"
			+ "ejCAwrkunaImf2xwIaYuAQKBgD7yrnLczvGux9cgYbZ5bH+HOWZCmHfAd6f6OBMr\r\n"
			+ "DtG3xm0ozduKCDNoNbl35TVQEleOZ7at3X6aeyjD+kj8u+u9+tOxePNcUp6BYplV\r\n"
			+ "BYWLsmuZ2hRhqmVouek13xEnEvhY6T4+kMaLczWH5abp8q0NIGs+kyZ4Uvz/anmP\r\n"
			+ "UsmvAoGAbO2cce0kXHwPvm2FGVZxUvqAFgrWCxZXfnJUGfFcxxzx2K9DfNjfuIFV\r\n"
			+ "Vt2GxckaTTBRQvN/f83d0r+suUbZo8Hsr/qHwhrsxLA0q1Vy45d8ased7QNXbj1i\r\n"
			+ "witjWodFE6YRL+yWcXlhFQanf0u00yqwqJaaquAeYG4kplA9Jno=\r\n"
			+ "-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n"
			+ "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA8LrrNJoy/opOLC3V3qFW\r\n"
			+ "mt4wkDpNpP4FCp5e/fW9zx9IENufyclUICjt8kT2Ti0EqJhwOxzOgoUqf95BTONN\r\n"
			+ "dV10ya8omOwTBPuYPmSMRBxf/C4zTf+WABTw9sZNp6ZK+OuxHc9Vi61O5kIoaCMD\r\n"
			+ "PQfX2KRkFFyDH1iJ3s8CoD5nEzEY24iSGsnxgwDkt9+l/KfwY4t6LMAyAt47U0aA\r\n"
			+ "Kk+rlSJoteePJm0CdqkmsAru/ubCILTOOO/deQL2Sg9axBaTk2Drv3BwZufrN7g/\r\n"
			+ "qPmFqpygkCIq99lUlpAyOWsYY9dYwa6kBRv1Qm35WHquV9k4ftHkYyxb7nbbPhe9\r\n"
			+ "2wIDAQAB\r\n"
			+ "-----END PUBLIC KEY-----";
}
