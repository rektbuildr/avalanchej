/*
 *
 * Crypto.bi AvalancheJ - An experimental (unofficial) Java library for interacting with the Avalanche Platform
 * Copyright (C) 2023 AVAXBuildr
 *
 * For more information, visit:
 * https://crypto.bi
 *
 *
 **/

package to.avax.avalanche.network;

public enum NetworkProtocolType {
    HTTP, HTTPS;

    public static NetworkProtocolType of(String protocol) {
        if (protocol == null) {
            throw new RuntimeException("Protocol cannot be null");
        }
        switch (protocol) {
            case "http":
                return HTTP;
            case "https":
                return HTTPS;
            default:
                throw new RuntimeException("Invalid protocol " + protocol);
        }
    }

    public String toString() {
        switch (this) {
            case HTTP:
                return "http";
            case HTTPS:
                return "https";
            default:
                throw new RuntimeException("Invalid protocol " + this);
        }

    }
}