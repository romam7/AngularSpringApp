package com.roman.springboot.backend.apirest.auth;

public class JwtConfig {

	public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEowIBAAKCAQEAwIWy2V3VHPFZ6aWidK5epXzrOv1CerBip52bhn+mMfT0uUwn\r\n" + 
			"I4Udh6frkQnu6q+YuGm3CPZaayuC4NmJVkw7dO1i89KxhN5vaxqn1C7OEuL+Ju6t\r\n" + 
			"OlXSg1E45ryFh3CkuneYb7p3cdPziBuai9SO/XWzDJE67OKtAbbO7mtOCoPgvQiT\r\n" + 
			"7bqgJtmrwAgmEd/9zc9Bx9cDd8QVA2XFaDaLxyGoZ3Gq9ltLBrK40j1HXDNKx/33\r\n" + 
			"IbwrDNseKx1Nw0A4EC163iepDRwNKmwJYhzYJ+jWy6JgtRHSjg0ultjqbnZNBSS7\r\n" + 
			"nKoeNLUkb+g4BOcS9w5N9pTtM6QB6+4HgqkWmQIDAQABAoIBAHWKKyNiklZVVBu+\r\n" + 
			"MG0keEx48/TT4t6dCd5j7ywyivk9IJxwzgR1pQ3Ji5zFf8Rw6MDOah1iqtl7ezBk\r\n" + 
			"H+E8MaC1vhA2toL0evndEFIPMWl+hMSoO8K92wSpdiAJQUzrjOb7VWoBYiNwz+Jt\r\n" + 
			"V/G/GH3Oej5V/K/bxNyjC7usb70irtBYW+jIxtZlDgu5skiVNhdnBcHQpQh/yVWl\r\n" + 
			"z0DlMMUkAGOczwr1K3vjzBnfLK+mmLm7tkAcp9SVpCJ1jjYADSETh8D+7S4enT4e\r\n" + 
			"U8MD31cJe24Y4IqeZ+9ZcuqVncfjswExLTl04SQd3p2rwWSVf73K/NnE9fpYaZhb\r\n" + 
			"PV6kAMECgYEA8p9vaPtx6rE2fr6MsVwG4si3OI4kqSEiLetaUdnRisFf8KMp/8N2\r\n" + 
			"u8lraq9ueDFmX05Bx4DxUMDbnNVYDesRcyJHnmAdYsaeF6AUljqd4IVNQSwUWaXz\r\n" + 
			"iQKUNJZixe7mYRjnR36/44fpp6X8Ns6kb6hraSacUEvtvux/Qhq5JtUCgYEAyyMb\r\n" + 
			"H7rLpD2+lRWzq1xn+GpHX9mblUUsWG7ijJF2eQ+n78PjbqYbq3X+55OstDNNPMEv\r\n" + 
			"ohP9jS3kX2ywvuM5Xrtf2sY4C5Xhd1cIII8sPOUd75vKbyVxCVkZF94qFHE4lQFt\r\n" + 
			"6PRdevtruqX5oDcCc0ZgzCmB0KGzoEbhkTYTGrUCgYADul1s4Ig0kfqDYgwpYX+d\r\n" + 
			"lnXyQYTgsGilCfu+TDmDB0uhF/C6RFebtRGYdw+cey3Wgw5RsXKDyiLVuxV6SUVg\r\n" + 
			"XoN5NILfFKwzMrt+P3JTk9jHCpVZd0pRrZ93W2QzJGOX1FkhaRortdfqQouoj+5I\r\n" + 
			"5O6ZlAVM2o3RpDKkYmK77QKBgQCO5mBTXt2Y6ZKjYAPnnXbKi0EwjW1kgafjggW/\r\n" + 
			"Kykzmq7h/WSF1zaJ1NT/5aPNlHVWMvSmSPfKFCmec2CWuFQIbznMNjsA82wLvt7J\r\n" + 
			"wM42/Fqlz2uF6sns8I+1eaUSgl9yevHtudH1DN9JCy9i5K/FlhHMLbrToJ0zOAnA\r\n" + 
			"VFD2LQKBgFQFORasaGtbCc1mvTk5ynPLcIqB9+P51APX13R1aVILks08cV/1SnBo\r\n" + 
			"6OReiIkm2O7iNqMl9uvYMGFxMPDwNGuaBVdFdxYL615hpZRdR4OSkkUSUH1nrMcn\r\n" + 
			"3GBlrGSLg4Huu8Vm5yiD/gxpc4uDs6Xz6tfk1qMFRl8ZPqXxZFRV\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwIWy2V3VHPFZ6aWidK5e\r\n" + 
			"pXzrOv1CerBip52bhn+mMfT0uUwnI4Udh6frkQnu6q+YuGm3CPZaayuC4NmJVkw7\r\n" + 
			"dO1i89KxhN5vaxqn1C7OEuL+Ju6tOlXSg1E45ryFh3CkuneYb7p3cdPziBuai9SO\r\n" + 
			"/XWzDJE67OKtAbbO7mtOCoPgvQiT7bqgJtmrwAgmEd/9zc9Bx9cDd8QVA2XFaDaL\r\n" + 
			"xyGoZ3Gq9ltLBrK40j1HXDNKx/33IbwrDNseKx1Nw0A4EC163iepDRwNKmwJYhzY\r\n" + 
			"J+jWy6JgtRHSjg0ultjqbnZNBSS7nKoeNLUkb+g4BOcS9w5N9pTtM6QB6+4HgqkW\r\n" + 
			"mQIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";
}
