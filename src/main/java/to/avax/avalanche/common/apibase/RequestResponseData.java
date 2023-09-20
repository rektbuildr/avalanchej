/*
 *
 * Crypto.bi AvalancheJ - An experimental (unofficial) Java library for interacting with the Avalanche Platform
 * Copyright (C) 2023 REKTBuildr
 *
 * For more information, visit:
 * https://crypto.bi
 *
 *
 **/

package to.avax.avalanche.common.apibase;

import lombok.Data;

@Data
public class RequestResponseData {
    public Object data;
    public Object headers;
    public int status;
    public String statusText;
    public Object request;
}
